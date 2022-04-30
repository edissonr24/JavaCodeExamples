// Fig. 11.11: StringBufferCapLen.java
// Los métodos length, setLength, capacity y ensureCapacity de StringBuffer.
import javax.swing.*;

public class StringBufferCapLen {

   public static void main( String args[] )
   {
      StringBuffer buffer = new StringBuffer( "Hola, ¿cómo estás?" );

      String salida = "buffer = " + buffer.toString() + "\nlongitud = " + 
         buffer.length() + "\ncapacidad = " + buffer.capacity();

      buffer.ensureCapacity( 75 );
      salida += "\n\nNueva capacidad = " + buffer.capacity();

      buffer.setLength( 10 );
      salida += "\n\nNueva longitud = " + buffer.length() +
         "\nbuf = " + buffer.toString();

      JOptionPane.showMessageDialog( null, salida,
         "Los métodos length y capacity de StringBuffer",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase StringBufferCapLen


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
