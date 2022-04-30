// Fig. 11.8: VariosString2.java
// Los métodos replace, toLowerCase, toUpperCase, trim y toCharArray de String.
import javax.swing.*;

public class VariosString2 {

   public static void main( String args[] )
   {
      String s1 = new String( "hola" );
      String s2 = new String( "ADIOS" );
      String s3 = new String( "   espacios   " );

      String salida = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3;

      // probar el método replace      
      salida += "\n\nReemplazar 'l' con 'L' en s1: " +
         s1.replace( 'l', 'L' );

      // probar toLowerCase y toUpperCase
      salida += "\n\ns1.toUpperCase() = " + s1.toUpperCase() +
         "\ns2.toLowerCase() = " + s2.toLowerCase();

      // probar el método trim
      salida += "\n\ns3 después de trim = \"" + s3.trim() + "\"";

      // probar el método toCharArray
      char arregloChar[] = s1.toCharArray();
      salida += "\n\ns1 como un arreglo de caracteres = ";

      for ( int cuenta = 0; cuenta < arregloChar.length; ++cuenta )
         salida += arregloChar[ cuenta ];

      JOptionPane.showMessageDialog( null, salida,
         "Métodos adicionales de String methods", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase VariosString2

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
