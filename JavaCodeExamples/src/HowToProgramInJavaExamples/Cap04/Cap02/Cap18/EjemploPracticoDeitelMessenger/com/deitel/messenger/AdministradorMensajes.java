// AdministradorMensajes.java
// AdministradorMensajes es una interfaz para objetos capaz de administrar
// las comunicaciones con un servidor de mensajes.
package com.deitel.messenger;

public interface AdministradorMensajes {   
   
   // conectarse al servidor de mensajes y enrutar los mensajes entrantes
   // al objeto EscuchaMensajes dado
   public void conectar( EscuchaMensajes escucha );
   
   // desconectarse del servidor de mensajes y dejar de enrutar
   // los mensajes entrantes hacia el objeto EscuchaMensajes dado
   public void desconectar( EscuchaMensajes escucha );
   
   // enviar mensaje al servidor de mensajes
   public void enviarMensaje( String de, String mensaje );  
}


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
