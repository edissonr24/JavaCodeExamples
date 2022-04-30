// Fig. 11.14: StringBufferInsert.java
// Los métodos insert y delete de StringBuffer.
import javax.swing.*;

public class StringBufferInsert {

   public static void main( String args[] )
   {
      Object refObject = "hola";  
      String cadena = "adiós";  
      char arregloChar[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBoolean = true;
      char valorCharacter = 'K';
      int valorInteger = 7;
      long valorLong = 10000000;
      float valorFloat = 2.5f;  // el sufijo f indica que 2.5 es un float
      double valorDouble = 33.333;
      StringBuffer buffer = new StringBuffer();

      buffer.insert( 0, refObject );
      buffer.insert( 0, "  " );  // cada uno de estos contienen dos espacios
      buffer.insert( 0, cadena );
      buffer.insert( 0, "  " );
      buffer.insert( 0, arregloChar );
      buffer.insert( 0, "  " );
      buffer.insert( 0, arregloChar, 3, 3 );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorBoolean );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorCharacter );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorInteger );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorLong );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorFloat );
      buffer.insert( 0, "  " );
      buffer.insert( 0, valorDouble );

      String salida = "buffer después de inserciones:\n" + buffer.toString();

      buffer.deleteCharAt( 10 );  // eliminar 5 en 2.5
      buffer.delete( 2, 6 );      // eliminar .333 in 33.333

      salida += "\n\nbuffer después de eliminaciones:\n" + buffer.toString();

      JOptionPane.showMessageDialog( null, salida,
         "Métodos insert/delete de StringBuffer", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase StringBufferInsert

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
