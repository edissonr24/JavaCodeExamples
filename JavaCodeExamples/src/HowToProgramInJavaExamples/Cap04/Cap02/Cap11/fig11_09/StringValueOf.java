// Fig. 11.9: StringValueOf.java
// Los métodos valueOf de la clase String.
import javax.swing.*;

public class StringValueOf {

   public static void main( String args[] )
   {
      char arregloChar[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBooleano = true;
      char valorCharacter = 'Z';
      int valorInteger = 7;
      long valorLong = 10000000L;
      float valorFloat = 2.5f; // el sufijo f indica que 2.5 es un float
      double valorDouble = 33.333;
      Object refObject = "hola"; // asignar cadena a una referencia Object

      String salida = "arreglo char = " + String.valueOf( arregloChar ) +
         "\nparte de arreglo char = " + String.valueOf( arregloChar, 3, 3 ) +
         "\nboolean = " + String.valueOf( valorBooleano ) +
         "\nchar = " + String.valueOf( valorCharacter ) +
         "\nint = " + String.valueOf( valorInteger ) +
         "\nlong = " + String.valueOf( valorLong ) + 
         "\nfloat = " + String.valueOf( valorFloat ) + 
         "\ndouble = " + String.valueOf( valorDouble ) + 
         "\nObject = " + String.valueOf( refObject );

      JOptionPane.showMessageDialog( null, salida,
         "Métodos valueOf de String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase StringValueOf

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
