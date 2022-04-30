// Fig. 11.5: MetodosIndexString.java
// String searching methods indexOf and lastIndexOf.
import javax.swing.*;

public class MetodosIndexString {

   public static void main( String args[] )
   {
      String letras = "abcdefghijklmabcdefghijklm";

      // probar indexOf para localizar un caracter en una cadena
      String salida = "'c' se encuentra en el �ndice " + letras.indexOf( 'c' );

      salida += "\n'a' se encuentra en el �ndice " + letras.indexOf( 'a', 1 );

      salida += "\n'$' se encuentra en el �ndice " + letras.indexOf( '$' );

      // probar lastIndexOf para buscar un caracter en una cadena
      salida += "\n\nLa �ltima 'c' se encuentra en el �ndice " +
         letras.lastIndexOf( 'c' );

      salida += "\nLa �ltima 'a' se encuentra en el �ndice " +
         letras.lastIndexOf( 'a', 25 );

      salida += "\nEl �ltimo '$' se encuentra en el �ndice " +
         letras.lastIndexOf( '$' );

      // probar indexOf para localizar una subcadena en una cadena
      salida += "\n\n\"def\" se encuentra en el �ndice " +
         letras.indexOf( "def" );

      salida += "\n\"def\" se encuentra en el �ndice " +
         letras.indexOf( "def", 7 );

      salida += "\n\"hola\" se encuentra en el �ndice " +
         letras.indexOf( "hola" );

      // probar lastIndexOf para encontrar una subcadena en una cadena
      salida += "\n\nEl �ltimo \"def\" se encuentra en el �ndice " +
         letras.lastIndexOf( "def" );

      salida += "\nEl �ltimo \"def\" se encuentra en el �ndice " +
         letras.lastIndexOf( "def", 25 );

      salida += "\nEl �ltimo \"hola\" se encuentra en el �ndice " +
         letras.lastIndexOf( "hola" );

      JOptionPane.showMessageDialog( null, salida,
         "M�todos de b�squeda de String", JOptionPane.INFORMATION_MESSAGE );

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
