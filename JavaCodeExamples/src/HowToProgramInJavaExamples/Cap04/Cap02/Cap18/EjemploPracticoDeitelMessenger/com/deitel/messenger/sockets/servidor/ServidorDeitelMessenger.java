// ServidorDeitelMessenger.java
// ServidorDeitelMessenger es un servidor de conversaci�n (chat) con 
// subprocesamiento m�ltiple, basado en sockets y paquetes.
package com.deitel.messenger.sockets.servidor;

import java.util.*;
import java.net.*;
import java.io.*;

import com.deitel.messenger.*;
import com.deitel.messenger.sockets.*;

public class ServidorDeitelMessenger implements EscuchaMensajes {
   
   // iniciar servidor de conversaci�n
   public void iniciarServidor() 
   {      
      // crear servidor y administrar nuevos clientes
      try {
         
         // crear objeto ServerSocket para las conexiones entrantes
         ServerSocket socketServidor = new ServerSocket( 
            ConstantesSocketMessenger.PUERTO_SERVIDOR, 100 );
         
         System.out.println( "Servidor escuchando en el puerto " + 
            ConstantesSocketMessenger.PUERTO_SERVIDOR + " ..." );
         
         // escuchar constantemente en espera de clientes
         while ( true ) {
            
            // aceptar nueva conexi�n de cliente
            Socket socketCliente = socketServidor.accept();
            
            // crear nuevo objeto SubprocesoReceptor para recibir
            // mensajes del cliente
            new SubprocesoReceptor( this, socketCliente ).start();
                        
            // imprimir informaci�n sobre la conexi�n
            System.out.println( "Conexion recibida de: " +
               socketCliente.getInetAddress() );
            
         } // fin de instrucci�n while     
         
      } // fin del bloque try
      
      // manejar posible excepci�n al crear servidor y conectar clientes
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }

   } // fin del m�todo iniciarServidor
   
   // al recibir un nuevo mensaje, transmitirlo a los clientes
   public void mensajeRecibido( String de, String mensaje ) 
   {          
      // crear objeto String que contenga el mensaje completo
      String mensajeCompleto = de + 
         ConstantesSocketMessenger.SEPARADOR_MENSAJE + mensaje;
      
      // crear e iniciar objeto SubprocesoEnvioMulticast para transmitir
      // los nuevos mensajes a todos los clientes
      new SubprocesoEnvioMulticast( mensajeCompleto.getBytes() ).start();
   }   
   
   public static void main ( String args[] ) 
   {
      new ServidorDeitelMessenger().iniciarServidor();
   }

} // fin de la clase ServidorDeitelMessenger


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
