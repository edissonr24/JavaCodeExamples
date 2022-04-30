// AdministradorSocketsMensajes.java
// AdministradorSocketsMensajes se comunica con un ServidorDeitelMessenger usando 
// objetos Socket y MulticastSocket.
package com.deitel.messenger.sockets.cliente;

import java.util.*;
import java.net.*;
import java.io.*;

import com.deitel.messenger.*;
import com.deitel.messenger.sockets.*;

public class AdministradorSocketsMensajes implements AdministradorMensajes {
   
   // Socket para mensajes salientes
   private Socket socketCliente; 
   
   // Direcci�n de ServidorDeitelMessenger
   private String direccionServidor; 
   
   // Subproceso para recibir mensajes de transmisi�n m�ltiple
   private SubprocesoReceptorPaquetes subprocesoReceptor;
   
   // bandera indicando el estado de la conexi�n
   private boolean conectado = false;
   
   // constructor de AdministradorSocketsMensajes
   public AdministradorSocketsMensajes( String direccion )
   {
      direccionServidor = direccion;
   }
   
   // conectarse al servidor y enviar mensajes al objeto EscuchaMensajes dado
   public void conectar( EscuchaMensajes escucha ) 
   {
      // si ya est� conectado, regresar inmediatamente
      if ( conectado )
         return;

      // abrir conexi�n con objeto Socket a ServidorDeitelMessenger
      try {
         socketCliente = new Socket( 
            InetAddress.getByName( direccionServidor ), 
            ConstantesSocketMessenger.PUERTO_SERVIDOR );

         // crear objeto Thread para recibir mensajes entrantes
         subprocesoReceptor = new SubprocesoReceptorPaquetes( escucha );
         subprocesoReceptor.start();
         
         // actualizar bandera conectado
         conectado = true;
      } 

      // manejar posible excepci�n al conectarse con el servidor
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
   
   } // fin del m�todo conectar
   
   // desconectarse del servidor y desregistrar objeto EscuchaMensajes dado
   public void desconectar( EscuchaMensajes escucha ) 
   {
      // si no est� conectado, regresar inmediatamente
      if ( !conectado )
         return;
      
      // detener subproceso de escucha y desconectar del servidor
      try {     
         
         // notificar al servidor que el cliente se va a desconectar
         Thread desconectarSubproceso = new SubprocesoEmisor( socketCliente, "", 
            ConstantesSocketMessenger.CADENA_DESCONEXION );         
         desconectarSubproceso.start();         
         
         // esperar 10 segundos para que se env�e el mensaje de desconexi�n
         desconectarSubproceso.join( 10000 );
         
         // detener subprocesoReceptor y eliminar objeto EscuchaMensajes dado
         subprocesoReceptor.dejarDeEscuchar();
         
         // cerrar socket saliente
         socketCliente.close(); 
         
      } // fin del bloque try

      // manejar posible excepci�n al desconectarse del servidor
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
      
      // manejar posible excepci�n al unirse a desconectarSubproceso
      catch ( InterruptedException excepcionInterrupcion ) {
         excepcionInterrupcion.printStackTrace();
      }
     
      // actualizar bandera conectado
      conectado = false;
      
   } // fin del m�todo desconectar
   
   // enviar mensaje al servidor
   public void enviarMensaje( String de, String mensaje ) 
   {
      // si no est� conectado, regresar inmediatamente
      if ( !conectado )
         return;
      
      // crear e iniciar nuevo SubprocesoEmisor para entregar el mensaje
      new SubprocesoEmisor( socketCliente, de, mensaje).start();
   }   

} // fin del m�todo AdministradorSocketsMensajes


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