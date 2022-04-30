package Cap11.fig11_01;

// Fig. 11.1: ConstructoresString.java
// Constructores de la clase String.
import javax.swing.*;

public class ConstructoresString {

   public static void main( String args[] )
   {
      char arregloChar[] = { 'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'ñ', 'o', 's' };
      byte arregloByte[] = { ( byte ) 'a', ( byte ) 'ñ', 
         ( byte ) 'o', ( byte ) ' ', ( byte ) 'n', 
         ( byte ) 'u', ( byte ) 'e', ( byte ) 'v', (byte) 'o' };

      String s = new String( "hola" );

      // usar constructores de String
      String s1 = new String();
      String s2 = new String( s );
      String s3 = new String( arregloChar );
      String s4 = new String( arregloChar, 7, 4 );
      String s5 = new String( arregloByte, 4, 5 );
      String s6 = new String( arregloByte );

      // anexar objetos String a salida
      String salida = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + 
         "\ns4 = " + s4 + "\ns5 = " + s5 + "\ns6 = " + s6;

      JOptionPane.showMessageDialog( null, salida,
         "Constructores de la clase String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase ConstructoresString


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
