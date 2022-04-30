// Fig. 5.5: Suma.java
// Suma de enteros con la instrucción for.
import javax.swing.JOptionPane;

public class Suma {

   public static void main( String args[] )
   {
      int total = 0;  // inicializar el total

      // sumar los enteros pares del 2 al 100
      for ( int numero = 2; numero <= 100; numero += 2 )
         total += numero;

      // mostrar el resultado
      JOptionPane.showMessageDialog( null, "La suma es " + total,
         "Suma de los enteros pares del 2 al 100",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );   // terminar la aplicación

   } // fin de main

} // fin de la clase Suma

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
