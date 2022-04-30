// SubprocesoReceptorPaquetes.java
// SubprocesoReceptorPaquetes escucha los objetos DatagramPacket que contienen
// mensajes de un objeto ServidorDeitelMessenger.
package com.deitel.messenger.sockets.cliente;

import java.io.*;
import java.net.*;
import java.util.*;

import com.deitel.messenger.*;
import com.deitel.messenger.sockets.*;

public class SubprocesoReceptorPaquetes extends Thread {
   
   // objeto EscuchaMensajes al que deben entregarse los mensajes
   private EscuchaMensajes escuchaMensajes;
   
   // objeto MulticastSocket para recibir mensajes de transmisión
   private MulticastSocket socketMulticast;
   
   // objeto InetAddress del grupo para los mensajes
   private InetAddress grupoMulticast;

   // bandera para terminar objeto SubprocesoReceptorPaquetes
   private boolean seguirEscuchando = true;
   
   // constructor de SubprocesoReceptorPaquetes
   public SubprocesoReceptorPaquetes( EscuchaMensajes escucha ) 
   {
      // invocar al constructor de la superclase para nombrar el objeto Thread
      super( "SubprocesoReceptorPaquetes" );
      
      // establecer objeto EscuchaMensajes
      escuchaMensajes = escucha;
      
      // conectarse con objeto MulticastSocket para realizar transmisión múltiple de dirección y puerto
      try {
         socketMulticast = new MulticastSocket( 
            ConstantesSocketMessenger.PUERTO_ESCUCHA_MULTICAST );
         
         grupoMulticast = InetAddress.getByName( 
            ConstantesSocketMessenger.DIRECCION_MULTICAST );
         
         // unirse al grupo de transmisión múltiple para recibir los mensajes
         socketMulticast.joinGroup( grupoMulticast ); 
         
         // establecer tiempo fuera de 5 segundos al esperar nuevos paquetes
         socketMulticast.setSoTimeout( 5000 );
      }
      
      // manejar posible excepción al conectarse con dirección de transmisión múltiple
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
      
   } // fin del constructor de SubprocesoReceptorPaquetes
   
   // escuchar mensajes del grupo de transmisión múltiple
   public void run() 
   {          
      // escuchar mensajes hasta ser detenido
      while ( seguirEscuchando ) {

         // crear búfer para mensaje entrante
         byte[] bufer = 
            new byte[ ConstantesSocketMessenger.TAMANIO_MENSAJE ];

         // crear objeto DatagramPacket para mensaje entrante
         DatagramPacket paquete = new DatagramPacket( bufer, 
            ConstantesSocketMessenger.TAMANIO_MENSAJE );

         // recibir nuevo objeto DatagramPacket (llamada de bloqueo)
         try {            
            socketMulticast.receive( paquete );
         }

         // manejar posible excepción al agotarse el tiempo para recibir
         catch ( InterruptedIOException excepcionESInterrupcion ) {
            
            // continuar con la siguiente iteración para seguir escuchando
            continue;
         }
         
         // manejar excepción al leer el paquete del grupo de transmisión múltiple
         catch ( IOException excepcionES ) {
            excepcionES.printStackTrace();
            break;
         }

         // colocar datos del mensaje en un objeto String
         String mensaje = new String( paquete.getData() );

         // eliminar espacio en blanco adicional de la parte final del mensaje
         mensaje = mensaje.trim();

         // dividir mensaje en tokens para recuperar nombre de usuario y cuerpo del mensaje
         StringTokenizer tokenizer = new StringTokenizer( 
            mensaje, ConstantesSocketMessenger.SEPARADOR_MENSAJE );

         // ignorar mensajes que no contengan un nombre 
         // de usuario y cuerpo del mensaje
         if ( tokenizer.countTokens() == 2 ) 

            // enviar mensaje a objeto EscuchaMensajes
            escuchaMensajes.mensajeRecibido( 
               tokenizer.nextToken(),   // nombre de usuario
               tokenizer.nextToken() ); // cuerpo del mensaje

      } // fin de instrucción while

      // dejar grupo de transmisión múltiple y cerrar objeto MulticastSocket
      try {
         socketMulticast.leaveGroup( grupoMulticast );
         socketMulticast.close(); 
      }
      
      // manejar posible excepción al leer el paquete del grupo de transmisión múltiple
      catch ( IOException excepcionES ) { 
         excepcionES.printStackTrace();
      }
      
   } // fin del método run
   
   // dejar de escuchar nuevos mensajes
   public void dejarDeEscuchar() 
   {
      seguirEscuchando = false;
   }

} // fin de la clase SubprocesoReceptorPaquetes


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
