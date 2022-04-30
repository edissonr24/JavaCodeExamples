// Fig. 5.1: ContadorWhile.java
// Repetición controlada por contador.
import java.awt.Graphics;

import javax.swing.JApplet;

public class ContadorWhile extends JApplet {

   // dibujar líneas en el fondo del subprograma
   public void paint( Graphics g ) 
   {      
      super.paint( g );  // llamar al método paint heredado de JApplet

      int contador = 1;   // inicialización

      while ( contador <= 10 ) {  // condición de repetición
         g.drawLine( 10, 10, 250, contador * 10 );
         ++contador;  // incremento

      } // fin de instrucción while

   } // fin del método paint

} // fin de la clase ContadorWhile

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
