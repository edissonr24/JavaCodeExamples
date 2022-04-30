package Cap03.fig03_06;

// Fig. 3.6: SubprogramaBienvenido.java
// Nuestro primer subprograma en Java.

// Paquetes de Java
import java.awt.Graphics;    // importar la clase Graphics
import javax.swing.JApplet;  // importar la clase JApplet

public class SubprogramaBienvenido extends JApplet {  

   // dibujar texto en el fondo del subprograma
   public void paint( Graphics g )
   {
      // llamar a la versión del método paint de la superclase
      super.paint( g );

      // dibujar un String en la coordenada x 25 y la coordenada y 25
      g.drawString( "¡Bienvenido a la programación en Java!", 25, 25 );

   } // fin del método paint

} // fin de la clase SubprogramaBienvenido

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
