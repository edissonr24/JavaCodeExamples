// SubprocesoEnvioMulticast.java
// SubprocesoEnvioMulticast es un objeto Thread que transmite un mensaje
// de conversación utilizando un datagrama de transmisión múltiple.
package com.deitel.messenger.sockets.servidor;

import java.io.*;
import java.net.*;

import com.deitel.messenger.sockets.*;

public class SubprocesoEnvioMulticast extends Thread {
   
   // datos del mensaje
   private byte[] bytesMensaje;
   
   // constructor de SubprocesoEnvioMulticast
   public SubprocesoEnvioMulticast( byte[] bytes ) 
   { 
      // invocar al constructor de la superclase para nombrar al objeto Thread
      super( "SubprocesoEnvioMulticast" );
      
      bytesMensaje = bytes; 
   }

   // entregar mensaje a DIRECCION_MULTICAST a través de objeto DatagramSocket
   public void run() 
   {
      // entregar mensaje
      try {         
         
         // crear objeto DatagramSocket para enviar el mensaje
         DatagramSocket socket = new DatagramSocket( 
            ConstantesSocketMessenger.PUERTO_ENVIO_MULTICAST );
         
         // usar objeto InetAddress reservado para grupo de transmisión múltiple
         InetAddress grupo = InetAddress.getByName( 
            ConstantesSocketMessenger.DIRECCION_MULTICAST );
         
         // crear objeto DatagramPacket que contiene el mensaje
         DatagramPacket paquete = new DatagramPacket( bytesMensaje, 
            bytesMensaje.length, grupo, 
            ConstantesSocketMessenger.PUERTO_ESCUCHA_MULTICAST );
         
         // enviar paquete al grupo de transmisión múltiple y cerrar el socket
         socket.send( paquete );
         socket.close();
      } 
      
      // manejar posible excepción al entregar el mensaje
      catch ( IOException excepcionES ) { 
         excepcionES.printStackTrace();
      }
      
   } // fin del método run

} // fin de la clase SubprocesoEnvioMulticast


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
