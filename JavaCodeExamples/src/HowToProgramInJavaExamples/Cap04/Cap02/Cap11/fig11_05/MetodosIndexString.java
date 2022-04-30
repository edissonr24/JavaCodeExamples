// Fig. 11.5: MetodosIndexString.java
// String searching methods indexOf and lastIndexOf.
import javax.swing.*;

public class MetodosIndexString {

   public static void main( String args[] )
   {
      String letras = "abcdefghijklmabcdefghijklm";

      // probar indexOf para localizar un caracter en una cadena
      String salida = "'c' se encuentra en el índice " + letras.indexOf( 'c' );

      salida += "\n'a' se encuentra en el índice " + letras.indexOf( 'a', 1 );

      salida += "\n'$' se encuentra en el índice " + letras.indexOf( '$' );

      // probar lastIndexOf para buscar un caracter en una cadena
      salida += "\n\nLa última 'c' se encuentra en el índice " +
         letras.lastIndexOf( 'c' );

      salida += "\nLa última 'a' se encuentra en el índice " +
         letras.lastIndexOf( 'a', 25 );

      salida += "\nEl último '$' se encuentra en el índice " +
         letras.lastIndexOf( '$' );

      // probar indexOf para localizar una subcadena en una cadena
      salida += "\n\n\"def\" se encuentra en el índice " +
         letras.indexOf( "def" );

      salida += "\n\"def\" se encuentra en el índice " +
         letras.indexOf( "def", 7 );

      salida += "\n\"hola\" se encuentra en el índice " +
         letras.indexOf( "hola" );

      // probar lastIndexOf para encontrar una subcadena en una cadena
      salida += "\n\nEl último \"def\" se encuentra en el índice " +
         letras.lastIndexOf( "def" );

      salida += "\nEl último \"def\" se encuentra en el índice " +
         letras.lastIndexOf( "def", 25 );

      salida += "\nEl último \"hola\" se encuentra en el índice " +
         letras.lastIndexOf( "hola" );

      JOptionPane.showMessageDialog( null, salida,
         "Métodos de búsqueda de String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

}  // fin de la clase MetodosIndexString

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
