// Fig. 13.22: DemoTeclas.java
// Demostración de los eventos de pulsación de tecla.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoTeclas extends JFrame implements KeyListener {
   private String linea1 = "", linea2 = "", linea3 = "";
   private JTextArea areaTexto;

   // configurar GUI
   public DemoTeclas()
   {
      super( "Demostración de eventos de pulsación de tecla" );

      // establecer objeto JTextArea
      areaTexto = new JTextArea( 10, 15 );
      areaTexto.setText( "Oprima cualquier tecla en el teclado..." );
      areaTexto.setEnabled( false );
      areaTexto.setDisabledTextColor( Color.BLACK );
      getContentPane().add( areaTexto );

      addKeyListener( this );  // permitir al marco procesar eventos de teclas
      
      setSize( 350, 100 );
      setVisible( true );

   } // fin del constructor de DemoTeclas

   // manejar evento de pulsación de cualquier tecla
   public void keyPressed( KeyEvent evento )
   {
      linea1 = "Se oprimió tecla: " + evento.getKeyText( evento.getKeyCode() );
      establecerLineas2y3( evento );
   }

   // manejar evento de liberación de cualquier tecla
   public void keyReleased( KeyEvent evento )
   {
      linea1 = "Se soltó tecla: " + evento.getKeyText( evento.getKeyCode() );
      establecerLineas2y3( evento );
   }

   // manejar evento de pulsación de una tecla de acción
   public void keyTyped( KeyEvent evento )
   {
      linea1 = "Se escribió tecla: " + evento.getKeyChar();
      establecerLineas2y3( evento );
   }

   // establecer segunda y tercera líneas de salida
   private void establecerLineas2y3( KeyEvent evento )
   {
      linea2 = "Esta tecla " + ( evento.isActionKey() ? "" : "no " ) +
         "es una tecla de acción";

      String temp = evento.getKeyModifiersText( evento.getModifiers() );

      linea3 = "Teclas modificadoras oprimidas: " + 
         ( temp.equals( "" ) ? "ninguna" : temp );

      areaTexto.setText( linea1 + "\n" + linea2 + "\n" + linea3 + "\n" );
   }

   public static void main( String args[] )
   {
      DemoTeclas aplicacion = new DemoTeclas();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoTeclas


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
