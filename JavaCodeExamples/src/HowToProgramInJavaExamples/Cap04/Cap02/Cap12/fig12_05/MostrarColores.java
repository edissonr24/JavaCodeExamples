// Fig. 12.5: MostrarColores.java
// Demostración de los colores.
import java.awt.*;
import javax.swing.*;

public class MostrarColores extends JFrame {

   // el constructor establece cadena de barra de título y dimensiones de la ventana
   public MostrarColores()
   {
      super( "Uso de los colores" );

      setSize( 400, 130 );
      setVisible( true );
   }

   // dibujar rectángulos y objetos String en distintos colores
   public void paint( Graphics g )
   {
      // llamar al método paint de la superclase
      super.paint( g );

      // establecer nuevo color de dibujo utilizando enteros
      g.setColor( new Color( 255, 0, 0 ) );
      g.fillRect( 25, 25, 100, 20 );
      g.drawString( "RGB actual: " + g.getColor(), 130, 40 );

      // establecer nuevo color de dibujo utilizando valores float
      g.setColor( new Color( 0.0f, 1.0f, 0.0f ) );
      g.fillRect( 25, 50, 100, 20 );
      g.drawString( "RGB actual: " + g.getColor(), 130, 65 );

      // establecer nuevo color de dibujo utilizando objetos Color estáticos
      g.setColor( Color.BLUE );
      g.fillRect( 25, 75, 100, 20 );
      g.drawString( "RGB actual: " + g.getColor(), 130, 90 );

      // mostrar valores RGB individuales
      Color color = Color.MAGENTA;
      g.setColor( color );
      g.fillRect( 25, 100, 100, 20 );
      g.drawString( "Valores RGB: " + color.getRed() + ", " +
         color.getGreen() + ", " + color.getBlue(), 130, 115 );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      MostrarColores aplicacion = new MostrarColores();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase MostrarColores

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
