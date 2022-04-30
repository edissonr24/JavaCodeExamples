// SubprocesoReceptor.java
// SubprocesoReceptor es un objeto Thread que escucha mensajes de un 
// cliente espec�fico y entrega mensajes a un objeto EscuchaMensajes.
package com.deitel.messenger.sockets.servidor;

import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

import com.deitel.messenger.*;
import com.deitel.messenger.sockets.*;

public class SubprocesoReceptor extends Thread {

   private BufferedReader entrada;
   private EscuchaMensajes escuchaMensajes;
   private boolean seguirEscuchando = true;
   
   // constructor de SubprocesoReceptor
   public SubprocesoReceptor( EscuchaMensajes escucha, Socket socketCliente ) 
   {
      // invocar al constructor de la superclase para nombrar objeto Thread
      super( "SubprocesoReceptor: " + socketCliente );
      
      // establecer escucha al que deben enviarse los nuevos mensajes
      escuchaMensajes = escucha;
      
      // establecer tiempo de interrupci�n para leer de socketCliente y crear
      // objeto BufferedReader para leer mensajes entrantes
      try {         
         socketCliente.setSoTimeout( 5000 );
         
         entrada = new BufferedReader( new InputStreamReader( 
            socketCliente.getInputStream() ) );
      }
      
      // manejar posible excepci�n al crear objeto BufferedReader
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
   
   } // fin del constructor de SubprocesoReceptor
   
   // escuchar nuevos mensajes y entregarlos a EscuchaMensajes
   public void run() 
   {    
      String mensaje;
      
      // escuchar mensajes hasta ser detenido
      while ( seguirEscuchando ) {   

         // leer mensaje de objeto BufferedReader
         try {            
            mensaje = entrada.readLine();
         }
         
         // manejar excepci�n si se acaba el tiempo para la lectura
         catch ( InterruptedIOException excepcionInterrupcion ) {

            // continuar con la siguiente iteraci�n para seguir escuchando
            continue;
         }
         
         // manejar excepci�n al leer mensaje
         catch ( IOException excepcionES ) {
            excepcionES.printStackTrace();            
            break;
         }

         // asegurar que el mensaje no sea nulo
         if ( mensaje != null ) {

            // dividir mensaje en tokens para recuperar nombre de usuario y cuerpo del mensaje
            StringTokenizer tokenizer = new StringTokenizer( 
               mensaje, ConstantesSocketMessenger.SEPARADOR_MENSAJE );

            // ignorar mensajes que no contienen un nombre 
            // de usuario y cuerpo del mensaje 
            if ( tokenizer.countTokens() == 2 ) 

               // enviar mensaje a EscuchaMensajes
               escuchaMensajes.mensajeRecibido( 
                  tokenizer.nextToken(),   // nombre de usuario
                  tokenizer.nextToken() ); // cuerpo del mensaje

            else

               // si se recibe mensaje de desconexi�n, dejar de escuchar
               if ( mensaje.equalsIgnoreCase( 
                  ConstantesSocketMessenger.SEPARADOR_MENSAJE +
                  ConstantesSocketMessenger.CADENA_DESCONEXION ) ) 
                  dejarDeEscuchar();

         } // fin de instrucci�n if

      } // fin de instrucci�n while  
      
      // cerrar BufferedReader (tambi�n se cierra Socket)
      try {         
         entrada.close();      
      }
      
      // manejar posible excepci�n al cerrar BufferedReader
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();     
      }       
 
   } // fin del m�todo run
   
   // dejar de escuchar mensajes entrantes
   public void dejarDeEscuchar() 
   {
      seguirEscuchando = false;
   }

} // fin de la clase SubprocesoReceptor


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
