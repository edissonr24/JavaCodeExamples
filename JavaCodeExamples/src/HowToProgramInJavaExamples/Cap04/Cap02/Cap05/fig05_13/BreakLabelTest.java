// Fig. 5.13: BreakLabelTest.java
// Labeled break statement.
import javax.swing.JOptionPane;

public class BreakLabelTest {

   public static void main( String args[] )
   {
      String output = "";

      stop: {  // labeled block

         // count 10 rows
         for ( int row = 1; row <= 10; row++ ) {

            // count 5 columns
            for ( int column = 1; column <= 5 ; column++ ) {

               if ( row == 5 )  // if row is 5,
                  break stop;   // jump to end of stop block

               output += "*  ";

            } // end inner for

            output += "\n";

         } // end outer for

         // following line is skipped
         output += "\nLoops terminated normally";

      } // end labeled block

      JOptionPane.showMessageDialog( null, output,
         "Testing break with a label",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate application

   } // end main

} // end class BreakLabelTest

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
