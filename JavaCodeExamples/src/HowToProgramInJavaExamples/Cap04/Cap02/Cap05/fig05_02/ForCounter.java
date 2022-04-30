// Fig. 5.2: ForCounter.java
// Counter-controlled repetition with the for statement.
import java.awt.Graphics;

import javax.swing.JApplet;

public class ForCounter extends JApplet {

   // draw lines on applet’s background
   public void paint( Graphics g )
   {
      super.paint( g );  // call paint method inherited from JApplet

      // for statement header includes initialization,  
      // repetition condition and increment
      for ( int counter = 1; counter <= 10; counter++ ) 
         g.drawLine( 10, 10, 250, counter * 10 );

   } // end method paint

} // end class ForCounter

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
