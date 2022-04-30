// Fig. 11.13: StringBufferAppend.java
// StringBuffer append methods.
import javax.swing.*;

public class StringBufferAppend {

   public static void main( String args[] )
   {
      Object refObject = "hola"; 
      String cadena = "adiós";  
      char arregloChar[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBoolean = true;
      char valorCharacter = 'Z';
      int valorInteger = 7;
      long valorLong = 10000000;
      float valorFloat = 2.5f; // el sufijo f indica que 2.5 es un float
      double valorDouble = 33.333;
      StringBuffer ultimoBuffer = new StringBuffer( "último StringBuffer" );
      StringBuffer buffer = new StringBuffer();

      buffer.append( refObject );
      buffer.append( "  " );   // cada uno de estos contiene dos espacios
      buffer.append( cadena );
      buffer.append( "  " );
      buffer.append( arregloChar );
      buffer.append( "  " );
      buffer.append( arregloChar, 0, 3 );
      buffer.append( "  " );
      buffer.append( valorBoolean );
      buffer.append( "  " );
      buffer.append( valorCharacter );
      buffer.append( "  " );
      buffer.append( valorInteger );
      buffer.append( "  " );
      buffer.append( valorLong );
      buffer.append( "  " );
      buffer.append( valorFloat );
      buffer.append( "  " );
      buffer.append( valorDouble );
      buffer.append( "  " );
      buffer.append( ultimoBuffer );

      JOptionPane.showMessageDialog( null, 
         "buffer = " + buffer.toString(), "Métodos append de StringBuffer", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de StringBufferAppend

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
