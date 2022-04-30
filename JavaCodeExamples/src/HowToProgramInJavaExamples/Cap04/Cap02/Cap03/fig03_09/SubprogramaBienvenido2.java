package Cap03.fig03_09;

// Fig. 3.9: SubprogramaBienvenido2.java
// Mostrar varias cadenas en un subprograma.

// paquetes de Java
import java.awt.Graphics;    // importar la clase Graphics
import javax.swing.JApplet;  // importar la clase JApplet

public class SubprogramaBienvenido2 extends JApplet {  

   // dibujar texto en el fondo del subprograma
   public void paint( Graphics g )
   {
      // llamar a la versión del método paint de la superclase
      super.paint( g );

      // dibujar dos valores String en diferentes ubicaciones
      g.drawString( "¡Bienvenido a", 25, 25 );
      g.drawString( "la programación en Java!", 25, 40 );

   } // fin del método paint

} // fin de la clase SubprogramaBienvenido2

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
