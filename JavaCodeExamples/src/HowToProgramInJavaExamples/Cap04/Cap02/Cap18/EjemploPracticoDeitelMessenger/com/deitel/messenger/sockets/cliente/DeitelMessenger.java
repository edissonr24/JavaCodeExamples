// DeitelMessenger.java
// DeitelMessenger es una aplicación de conversación (chat) que utiliza a GUICliente
// y AdministradorSocketsMensajes para comunicarse con el ServidorDeitelMessenger.
package com.deitel.messenger.sockets.cliente;

import com.deitel.messenger.*;

public class DeitelMessenger {
   
   public static void main( String args[] ) 
   {
      AdministradorMensajes administradorMensajes;
      
      // crear nuevo objeto DeitelMessenger
      if ( args.length == 0 )
         administradorMensajes = new AdministradorSocketsMensajes( "localhost" );
      else
         administradorMensajes = new AdministradorSocketsMensajes( args[ 0 ] );  
      
      // crear GUI para objeto AdministradorSocketsMensajes
      GUICliente guiCliente = new GUICliente( administradorMensajes );
      guiCliente.setSize( 300, 400 );
      guiCliente.setResizable( false );
      guiCliente.setVisible( true );
   }

} // fin de la clase DeitelMessenger


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
