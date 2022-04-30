// Fig. 5.2: ContadorFor.java
// Repetición controlada por contador con la instrucción for.
import java.awt.Graphics;

import javax.swing.JApplet;

public class ContadorFor extends JApplet {

   // dibujar líneas en el fondo del subprograma
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint heredado de JApplet

      // el encabezado de la instrucción for incluye la inicialización,  
      // la condición de repetición y el incremento
      for ( int contador = 1; contador <= 10; contador++ ) 
         g.drawLine( 10, 10, 250, contador * 10 );

   } // fin del método paint

} // fin de la clase ContadorFor

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
