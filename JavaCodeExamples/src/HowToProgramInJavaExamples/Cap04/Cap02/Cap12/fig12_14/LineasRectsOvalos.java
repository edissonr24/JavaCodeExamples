// Fig. 12.14: LineasRectsOvalos.java
// Dibujo de líneas, rectángulos y óvalos.
import java.awt.*;
import javax.swing.*;

public class LineasRectsOvalos extends JFrame {

   // establecer la cadena de la barra de título y dimensiones de la ventana
   public LineasRectsOvalos()
   {
      super( "Dibujo de líneas, rectángulos y óvalos" );

      setSize( 400, 165 );
      setVisible( true );
   }

   // mostrar varias líneas, rectángulos y óvalos
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint de la superclase

      g.setColor( Color.RED );
      g.drawLine( 5, 30, 350, 30 );

      g.setColor( Color.BLUE );
      g.drawRect( 5, 40, 90, 55 );
      g.fillRect( 100, 40, 90, 55 );

      g.setColor( Color.CYAN );
      g.fillRoundRect( 195, 40, 90, 55, 50, 50 );
      g.drawRoundRect( 290, 40, 90, 55, 20, 20 );

      g.setColor( Color.YELLOW );   
      g.draw3DRect( 5, 100, 90, 55, true );
      g.fill3DRect( 100, 100, 90, 55, false );

      g.setColor( Color.MAGENTA );
      g.drawOval( 195, 100, 90, 55 );
      g.fillOval( 290, 100, 90, 55 );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      LineasRectsOvalos aplicacion = new LineasRectsOvalos();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase LineasRectsOvalos

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
