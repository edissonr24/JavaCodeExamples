package Cap11.fig11_02;

// Fig. 11.2: VariosString.java
// Este programa demuestra los métodos length, charAt y getChars
// de la clase String.
import javax.swing.*;

public class VariosString {

   public static void main( String args[] )
   {
      String s1 = "hola a todos";
      char arregloChar[] = new char[ 4 ];

      String salida = "s1: " + s1;

      // probar método length
      salida += "\nLongitud de s1: " + s1.length();

      // iterar a través de los caracteres en s1 y mostrar al revés
      salida += "\nLa cadena invertida es: ";

      for ( int cuenta = s1.length() - 1; cuenta >= 0; cuenta-- )
         salida += s1.charAt( cuenta ) + " ";

      // copiar caracteres de la cadena a arregloChar
      s1.getChars( 0, 4, arregloChar, 0 );
      salida += "\nEl arreglo de caracteres es: ";

      for ( int cuenta = 0; cuenta < arregloChar.length; cuenta++ )
         salida += arregloChar[ cuenta ];

      JOptionPane.showMessageDialog( null, salida,
         "Métodos de la clase String para manipular caracteres",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase VariosString

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
