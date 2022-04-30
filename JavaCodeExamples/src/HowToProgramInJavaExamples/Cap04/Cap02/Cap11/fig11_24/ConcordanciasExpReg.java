// Fig. 11.24: ConcordanciasExpReg.java
// Demonstrating Classes Pattern and Matcher.
import java.util.regex.*;
import javax.swing.*;

class ConcordanciasExpReg
{
   public static void main( String args[] )
   {
      String salida = "";

      // crear expresión regular
      Pattern expresion = 
         Pattern.compile( "J.*\\d[0-35-9]-\\d\\d-\\d\\d" );
      
      String cadena1 = "Jacinto nació el 05-12-75\n" +
         "David nació el 11-04-68\n" +
         "Miguel nació el 04-28-73\n" +
         "Juan nació el 12-17-77";

      // comparar expresión regular con la cadena e imprimir concordancias
      Matcher matcher = expresion.matcher( cadena1 );
        
      while ( matcher.find() )
         salida += matcher.group() + "\n";

      JOptionPane.showMessageDialog( null, salida );
      System.exit( 0 );

   } // fin de main

} // fin de la clase ConcordanciasExpReg


/*
 **************************************************************************
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
 **************************************************************************
*/

