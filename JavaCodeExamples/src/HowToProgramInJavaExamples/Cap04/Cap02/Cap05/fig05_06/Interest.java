// Fig. 5.6: Interest.java
// Calculating compound interest.
import java.text.NumberFormat;  // class for numeric formatting
import java.util.Locale;  // class for country-specific information

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest {

   public static void main( String args[] )
   {
      double amount;       // amount on deposit at end of each year
      double principal = 1000.0;  // initial amount before interest
      double rate = 0.05;         // interest rate

      // create NumberFormat for currency in US dollar format
      NumberFormat moneyFormat = 
         NumberFormat.getCurrencyInstance( Locale.US );

      // create JTextArea to display output
      JTextArea outputTextArea = new JTextArea();

      // set first line of text in outputTextArea
      outputTextArea.setText( "Year\tAmount on deposit\n" );

      // calculate amount on deposit for each of ten years
      for ( int year = 1; year <= 10; year++ ) {

         // calculate new amount for specified year
         amount = principal * Math.pow( 1.0 + rate, year );

         // append one line of text to outputTextArea
         outputTextArea.append( year + "\t" +
            moneyFormat.format( amount ) + "\n" );

      } // end for

      // display results
      JOptionPane.showMessageDialog( null, outputTextArea,
         "Compound Interest", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminate the application

   } // end main

} // end class Interest

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
