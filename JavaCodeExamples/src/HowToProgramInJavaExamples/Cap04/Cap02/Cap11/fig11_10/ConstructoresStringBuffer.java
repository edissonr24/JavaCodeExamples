// Fig. 11.10: ConstructoresStringBuffer.java
// Los constructores de la clase StringBuffer.
import javax.swing.*;

public class ConstructoresStringBuffer {

   public static void main( String args[] )
   {
      StringBuffer buffer1 = new StringBuffer();
      StringBuffer buffer2 = new StringBuffer( 10 );
      StringBuffer buffer3 = new StringBuffer( "hola" );

      String salida = "buffer1 = \"" + buffer1.toString() + "\"" +
         "\nbuffer2 = \"" + buffer2.toString() + "\"" +
         "\nbuffer3 = \"" + buffer3.toString() + "\"";

      JOptionPane.showMessageDialog( null, salida,
         "Constructores de StringBuffer", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase ConstructoresStringBuffer


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
