// Fig. 5.7: PruebaDoWhile.java
// Uso de la instrucción do...while.
import java.awt.Graphics;

import javax.swing.JApplet;

public class PruebaDoWhile extends JApplet {
  
   // dibujar líneas en el subprograma
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint heredado de JApplet

      int contador = 1;   // inicializar contador

      do {
         g.drawOval( 110 - contador * 10, 110 - contador * 10,
            contador * 20, contador * 20 );
         ++contador;
      } while ( contador <= 10 );  // fin de instrucción do...while 

   } // fin del método paint

} // fin de la clase PruebaDoWhile

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
