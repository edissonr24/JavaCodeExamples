// Fig. 18.X: ServidorDeitelMessengerSinBloqueo.java
// Establecer un servidor de conversación sin bloqueo que recibirá una conexión de un 
// cliente y repetirá el mensaje del cliente a todos los demás clientes conectados.
package com.deitel.messenger.sockets.servidor;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.channels.spi.*;
import java.nio.charset.*;
import java.net.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class ServidorDeitelMessengerSinBloqueo extends JFrame {
   private ServerSocketChannel canalSocketServidor;
   private Selector selector;
   private Vector sockets = new Vector();
   private int contador = 0;
   private JTextArea areaPantalla;
   private Charset conjuntoChar; 
   private ByteBuffer buferEscritura;
   private ByteBuffer buferLectura = ByteBuffer.allocate( 512 );

   public ServidorDeitelMessengerSinBloqueo()
   {
      super( "Servidor DeitelMessenger" );

      areaPantalla = new JTextArea();
      getContentPane().add( new JScrollPane( areaPantalla ) );

      setSize( 200, 300 );
      setVisible( true );

      // cerrar canal de socket y selector del servidor al cerrar la ventana
      addWindowListener( 
		
         new WindowAdapter() {

            public void windowClosing( WindowEvent eventoVentana )
            {
               // cerrar canal de socket y selector del servidor
               try {
                  canalSocketServidor.close();
	              selector.close();
               }
               catch( IOException excepcionES ) {
                  excepcionES.printStackTrace();
               }
               finally {
                  System.exit( 0 );
               }
            }

         } // fin de la clase interna WindowAdapter

      ); // fin de addWindowListener

   } // fin del constructor
   
   // configurar y ejecutar el servidor 
   public void ejecutarServidor()
   {
      // configurar servidor para que reciba conexiones; procesar las conexiones
      try {

         // especificar el conjunto de caracteres usado para codificar/decodificar mensajes
         conjuntoChar = Charset.forName( "UTF-8" );

         // crear un objeto ServerSocketChannel.
         canalSocketServidor = ServerSocketChannel.open();
	     canalSocketServidor.socket().bind( 
            new InetSocketAddress( 12345 ) );
         canalSocketServidor.configureBlocking( false );

         // esperar una conexión.
         obtenerConexion();

      } // fin del bloque try

      // procesar posibles problemas con E/S
      catch ( Exception excepcionES ) {
         excepcionES.printStackTrace();
      }

   } // fin del método ejecutarServidor

   // esperar a que llegue una conexión, después mostrar la información sobre la conexión
   private void obtenerConexion() throws Exception
   {
      // Selector para peticiones entrantes
	  selector = SelectorProvider.provider().openSelector();
      canalSocketServidor.register( 
         selector, SelectionKey.OP_ACCEPT, null );

      // procesar peticiones entrantes
      while ( selector.select() > 0 ) {

         // alistar canales para E/S
         Set clavesListos = selector.selectedKeys();
         Iterator iterador = clavesListos.iterator();

         // para cada canal listo, procesar petición
         while ( iterador.hasNext() ) {
		    SelectionKey clave = ( SelectionKey )iterador.next();
		    iterador.remove();

            if ( clave.isAcceptable() ) {  // listo para la conexión

               // crear conexión
               ServerSocketChannel siguienteListo =
                  ( ServerSocketChannel ) clave.channel();
               SocketChannel canalSocket = siguienteListo.accept();

               if ( canalSocket != null ) {
                  canalSocket.configureBlocking( false );
                  sockets.add( canalSocket.socket() );
                  contador++;

                  SwingUtilities.invokeLater( 

                     new Runnable() {

                        public void run() 
                        {
                           areaPantalla.append(
                              "\nConexión con Cliente " + contador );
                        }
                     }
			      );

                  // registrar operación de lectura para canalSocket
                  SelectionKey claveLectura = canalSocket.register( 
                     selector, SelectionKey.OP_READ, null );

               } // fin de instrucción if canalSocket != null

            } // fin de instrucción if clave.isAcceptable

            else if ( clave.isReadable() ) {  // listo para lectura

               // obtener canalSocket listo para lectura
               SocketChannel canalSocket = 
                  ( SocketChannel ) clave.channel();

               leerMensaje( canalSocket );
            }

         } // fin del procesamiento de cada canal

      } // fin del procesamiento de peticiones entrantes 

   } // fin del método obtenerConexion

   // enviar mensaje al cliente
   private void escribirMensaje( String mensaje ) throws IOException
   {
      Socket socket;
      SocketChannel canalSocket;
      
      // repetir mensaje de vuelta a todos los clientes conectados
      for ( int i = 0; i < sockets.size(); i++ ) {
         socket = ( Socket ) sockets.elementAt( i );
         canalSocket = socket.getChannel();

         // enviar mensaje al cliente
         try {

            // convertir mensaje en bytes en conjuntoChar
            buferEscritura = conjuntoChar.encode( mensaje );

            // escribir mensaje en canalSocket
            canalSocket.write( buferEscritura );
         }

         // procesar posibles problemas al enviar el objeto
         catch ( IOException excepcionES ) {
            excepcionES.printStackTrace();
            canalSocket.close();
            sockets.remove( socket );
         }

      } // fin de instrucción for

   } // fin del método escribirMensaje

   // leer mensaje del cliente
   private void leerMensaje( SocketChannel canalSocket ) 
      throws IOException
   {
      // leer mensaje
      try {

         if ( canalSocket.isOpen() ) {
            buferLectura.clear();
            canalSocket.read( buferLectura );
            buferLectura.flip();
            CharBuffer mensajeChar = conjuntoChar.decode( buferLectura );
            String mensaje = mensajeChar.toString().trim();

            // eliminar y cerrar la conexión cuando el cliente se desconecte
            if ( mensaje.indexOf( "Desconectar" ) >= 0 ) {
               sockets.remove( canalSocket.socket() );
               canalSocket.close();
            }
            else 
               escribirMensaje( mensaje );

         } // fin de instrucción if

      } // fin del bloque try

      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
         sockets.remove( canalSocket.socket() );
         canalSocket.close();
      }

   } // fin del método leerMensaje

   public static void main( String args[] )
   {
      ServidorDeitelMessengerSinBloqueo aplicacion = 
         new ServidorDeitelMessengerSinBloqueo();
      aplicacion.ejecutarServidor();
   }

}  // fin de la clase ServidorDeitelMessengerSinBloqueo

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