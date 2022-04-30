// Fig. 11.17: OtrosMetodosChar.java
// Métodos no estáticos de Character.
import javax.swing.*;

public class OtrosMetodosChar {

   public static void main( String args[] )
   {
      Character c1 = new Character( 'A' );
      Character c2 = new Character( 'a' );

      String salida = "c1 = " + c1.charValue() + 
         "\nc2 = " + c2.toString();

      if ( c1.equals( c2 ) )
         salida += "\n\nc1 y c2 son iguales";
      else
         salida += "\n\nc1 y c2 no son iguales";

      JOptionPane.showMessageDialog( null, salida,
         "Métodos no estáticos de Character",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // end class OtrosMetodosChar

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
