// Fig. 11.7: ConcatenacionString.java
// El método concat de la clase String.
import javax.swing.*;

public class ConcatenacionString {

   public static void main( String args[] )
   {
      String s1 = new String( "Feliz " );
      String s2 = new String( "Cumpleaños" );

      String salida = "s1 = " + s1 + "\ns2 = " + s2;

      salida += "\n\nResultado de of s1.concat( s2 ) = " + s1.concat( s2 );
      salida += "\ns1 después de la concatenación = " + s1;

      JOptionPane.showMessageDialog( null, salida,
         "El método concat de String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase ConcatenacionString

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
