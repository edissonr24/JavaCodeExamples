// AdministradorSocketsMensajes2.java
// AdministradorSocketsMensajes2 es una clase para objetos capaz de administrar
// las comunicaciones con un servidor de mensajes.
package com.deitel.messenger.sockets.cliente;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.net.*;
import java.util.*;

import com.deitel.messenger.*;

public class AdministradorSocketsMensajes2 implements AdministradorMensajes {   
   private SocketChannel canalSocket;
   private EscuchaMensajes escuchaMensajes;
   private String direccionServidor;
   private SubprocesoReceptor recibirMensaje;
   private boolean conectado;
   private Charset conjuntoChar = Charset.forName( "UTF-8" );
   private ByteBuffer buferEscritura;
   private ByteBuffer buferLectura = ByteBuffer.allocate( 512 );

   public AdministradorSocketsMensajes2( String host )
   {
      direccionServidor = host;
      conectado = false;
   }
   
   // conectarse con el servidor de mensajes y empezar a recibir el mensaje
   public void conectar( EscuchaMensajes escucha )
   {
      escuchaMensajes = escucha;

      // conectarse con el servidor e iniciar subproceso para recibir mensaje
      try {

         // crear objeto SocketChannel para realizar conexión con el servidor
         canalSocket = SocketChannel.open();
         canalSocket.connect( new InetSocketAddress(
               InetAddress.getByName( direccionServidor ), 12345 ) );

         // iniciar SubprocesoReceptor para recibir los mensajes enviados por el servidor
         recibirMensaje = new SubprocesoReceptor();
         recibirMensaje.start();

         conectado = true;
      }
	  catch ( Exception excepcion ) {
         excepcion.printStackTrace();
      }
   }
   
   // desconectarse del servidor de mensajes y dejar de recibir mensaje
   public void desconectar( EscuchaMensajes escucha )
   {
      if ( conectado ) {

         // enviar petición de desconexión y dejar de recibir
         try {
            enviarMensaje( "", "Desconectar" );

            conectado = false;

            // enviar señal de interrupción al subproceso receptor
            recibirMensaje.interrupt();
         }
	     catch ( Exception excepcion ) {
            excepcion.printStackTrace();
         }
      }
   }
   
   // enviar mensaje al servidor de mensajes
   public void enviarMensaje( String nombreUsuario, String cuerpoMensaje ) 
   {
      String mensaje = nombreUsuario + "> " + cuerpoMensaje;

      // enviar mensaje al servidor
      try {
         buferEscritura = conjuntoChar.encode( mensaje );
         canalSocket.write( buferEscritura );
      }
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();

         try {
            canalSocket.close();
         }
         catch ( IOException excepcion ) {
            excepcion.printStackTrace();
         }
      }

   } // fin del método enviarMensaje

   public class SubprocesoReceptor extends Thread 
   {
      public void run() 
      {
         int longitudMensaje = 0;
         String mensaje = "";

         // leer mensajes hasta que el servidor cierre la conexión
         try {

            // procesar mensajes enviados del servidor
            do {
               buferLectura.clear();
               canalSocket.read( buferLectura );
               buferLectura.flip();
               CharBuffer mensajeChar = conjuntoChar.decode( buferLectura );
               mensaje = mensajeChar.toString().trim();

               // descomponer mensaje en tokens para recuperar nombre de usuario y cuerpo del mensaje
               StringTokenizer tokenizer = 
                  new StringTokenizer( mensaje, ">" );

               // ignorar mensajes que no contengan un nombre
               // de usuario y cuerpo del mensaje
               if ( tokenizer.countTokens() == 2 ) 

                  // enviar mensaje a EscuchaMensajes
                  escuchaMensajes.mensajeRecibido( 
                     tokenizer.nextToken(),   // nombre de usuario
                     tokenizer.nextToken() ); // cuerpo del mensaje

            } while ( true );  // seguir recibiendo mensajes

         } // fin del bloque try

         // atrapar posibles problemas al leer del servidor
         catch ( IOException excepcionES ) {
            if ( excepcionES instanceof ClosedByInterruptException )
               System.out.println( "canal de socket cerrado" );
            else {
               excepcionES.printStackTrace();

               try {
                  canalSocket.close();
                  System.out.println( "canal de socket cerrado" );
               }
               catch ( IOException excepcion ) {
                  excepcion.printStackTrace();
               }
            }

         } // fin del bloque catch

      } // fin del método run

   } // fin de la clase interna SubprocesoReceptor

} // fin de la clase AdministradorSocketsMensajes2


/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
