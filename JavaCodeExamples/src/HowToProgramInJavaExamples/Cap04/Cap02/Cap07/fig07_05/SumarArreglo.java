// Fig. 7.5: SumarArreglo.java
// Sumar el total de los valores de los elementos de un arreglo.
import javax.swing.*;

public class SumarArreglo {

   public static void main( String args[] )
   {
      int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int total = 0;

      // sumar el valor de cada elemento al total
      for ( int contador = 0; contador < arreglo.length; contador++ )
         total += arreglo[ contador ];

      JOptionPane.showMessageDialog( null, 
         "Total de elementos del arreglo: " + total,
         "Sumar los elementos de un arreglo",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main
   
} // fin de la clase SumarArreglo


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
