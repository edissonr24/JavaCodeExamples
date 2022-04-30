// Fig. 11.12: StringBufferChars.java
// Los métodos charAt, setCharAt, getChars y reverse de StringBuffer.
import javax.swing.*;

public class StringBufferChars {

   public static void main( String args[] )
   {
      StringBuffer buffer = new StringBuffer( "hola a todos" );

      String salida = "buffer = " + buffer.toString() +
         "\nCaracter en 0: " + buffer.charAt( 0 ) +
         "\nCaracter en 3: " + buffer.charAt( 3 );

      char arregloChar[] = new char[ buffer.length() ];
      buffer.getChars( 0, buffer.length(), arregloChar, 0 );
      salida += "\n\nLos caracteres son: ";

      for ( int cuenta = 0; cuenta < arregloChar.length; ++cuenta )
         salida += arregloChar[ cuenta ];

      buffer.setCharAt( 0, 'H' );
      buffer.setCharAt( 7, 'T' );
      salida += "\n\nbuf = " + buffer.toString();

      buffer.reverse();
      salida += "\n\nbuf = " + buffer.toString();

      JOptionPane.showMessageDialog( null, salida,
         "Los métodos Chars de StringBuffer", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase StringBufferChars


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
