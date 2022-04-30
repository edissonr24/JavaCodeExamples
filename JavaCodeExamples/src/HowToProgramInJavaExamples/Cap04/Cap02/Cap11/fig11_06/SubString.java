// Fig. 11.6: SubString.java
// Los métodos substring de la clase String.
import javax.swing.*;

public class SubString {

   public static void main( String args[] )
   {
      String letras = "abcdefghijklmabcdefghijklm";

      // probar métodos substring
      String salida = "La subcadena desde el índice 20 hasta el final es " +
         "\"" + letras.substring( 20 ) + "\"\n";

      salida += "La subcadena desde el índice 3 hasta 6 es " +
         "\"" + letras.substring( 3, 6 ) + "\"";

      JOptionPane.showMessageDialog( null, salida,
         "Métodos substring de la clase String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase SubString


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
