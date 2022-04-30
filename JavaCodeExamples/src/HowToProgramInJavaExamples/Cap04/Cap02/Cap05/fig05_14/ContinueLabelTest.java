// Fig. 5.14: ContinueLabelTest.java
// Labeled continue statement.
import javax.swing.JOptionPane;

public class ContinueLabelTest {

   public static void main( String args[] )
   {
      String output = "";

      nextRow:  // target label of continue statement

         // count 5 rows
         for ( int row = 1; row <= 5; row++ ) {
            output += "\n";
  
            // count 10 columns per row
            for ( int column = 1; column <= 10; column++ ) {
   
               // if column greater than row, start next row
               if ( column > row )
                  continue nextRow; // next iteration of labeled loop
   
               output += "*  ";

            } // end inner for

         } // end outer for

      JOptionPane.showMessageDialog( null, output,
         "Testing continue with a label", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate application

   } // end main

} // end class ContinueLabelTest


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
