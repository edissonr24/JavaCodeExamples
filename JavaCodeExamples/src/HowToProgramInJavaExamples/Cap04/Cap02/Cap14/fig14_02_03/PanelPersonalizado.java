// Fig. 14.2: PanelPersonalizado.java
// Una clase JPanel personalizada.
import java.awt.*;
import javax.swing.*;

public class PanelPersonalizado extends JPanel {
   public final static int CIRCULO = 1, CUADRADO = 2;
   private int figura;

   // usar figura para dibujar un óvalo o rectángulo
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      if ( figura == CIRCULO )
         g.fillOval( 50, 10, 60, 60 );
      else if ( figura == CUADRADO )
         g.fillRect( 50, 10, 60, 60 );
   }

   // establecer valor de figura y repintar PanelPersonalizado
   public void dibujar( int figuraADibujar )
   {
      figura = figuraADibujar;
      repaint();
   }

} // fin de la clase PanelPersonalizado



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
