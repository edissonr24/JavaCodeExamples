// SubprocesoEmisor.java
// SubprocesoEmisor envía un mensaje al servidor de conversación en un objeto Thread separado.
package com.deitel.messenger.sockets.cliente;

import java.io.*;
import java.net.*;

import com.deitel.messenger.sockets.*;

public class SubprocesoEmisor extends Thread {

   // objeto Socket a través del cual se va a enviar el mensaje
   private Socket socketCliente;
   private String mensajeAEnviar;

   // constructor de SubprocesoEmisor
   public SubprocesoEmisor( Socket socket, String nombreUsuario, String mensaje ) 
   {
      // invocar al constructor de la superclase para nombrar el objeto Thread
      super( "SubprocesoEmisor: " + socket );

      socketCliente = socket;
      
      // construir el mensaje a enviar
      mensajeAEnviar = nombreUsuario + 
         ConstantesSocketMessenger.SEPARADOR_MENSAJE + mensaje;
   }
   
   // enviar mensaje y salir de objeto Thread
   public void run() 
   {
      // enviar mensaje y vaciar objeto PrintWriter
      try {     
         PrintWriter escritor = 
            new PrintWriter( socketCliente.getOutputStream() );
         escritor.println( mensajeAEnviar );
         escritor.flush();        
      } 

      // manejar posible excepción al enviar el mensaje
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
   } 

} // fin de la clase SubprocesoEmisor


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
