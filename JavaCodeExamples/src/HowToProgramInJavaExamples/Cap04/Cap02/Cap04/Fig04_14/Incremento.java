// Fig. 4.14: Incremento.java
// Los operadores preincremento y postdecremento.

public class Incremento {

   public static void main( String args[] )
   {
      int c;
   
      // demostrar el uso de postincremento
      c = 5;                     // asignar 5 a c
      System.out.println( c );   // imprimir 5
      System.out.println( c++ ); // imprimir 5 y después postincremento
      System.out.println( c );   // imprimir 6

      System.out.println();      // saltar una línea

      // demostrar el uso de preincremento
      c = 5;                     // asignar 5 a c
      System.out.println( c );   // imprimir 5
      System.out.println( ++c ); // preincrementar y después imprimir 6
      System.out.println( c );   // imprimir 6

   } // fin de main

} // fin de la clase Incremento

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
