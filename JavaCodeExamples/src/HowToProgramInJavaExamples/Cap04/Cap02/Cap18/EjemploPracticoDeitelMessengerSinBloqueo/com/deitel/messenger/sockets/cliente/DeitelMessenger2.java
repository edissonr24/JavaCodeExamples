// DeitelMessenger2.java
// DeitelMessenger2 es una aplicación de conversación que utiliza un objeto GUICliente
// para comunicarse con el servidor de conversación.
package com.deitel.messenger.sockets.cliente;

import com.deitel.messenger.*;

public class DeitelMessenger2 {
   
   public static void main( String args[] ) 
   {
      AdministradorMensajes administradorMensajes;
      
      // crear nuevo objeto DeitelMessenger
      if ( args.length == 0 )
         administradorMensajes = new AdministradorSocketsMensajes2( "localhost" );
      else
         administradorMensajes = new AdministradorSocketsMensajes2( args[ 0 ] );  
      
      // crear GUI para AdministradorSocketsMensajes
      GUICliente guiCliente = new GUICliente( administradorMensajes );
      guiCliente.setSize( 300, 400 );
      guiCliente.setResizable( false );
      guiCliente.setVisible( true );
   }

} // fin de la clase DeitelMessenger2


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
