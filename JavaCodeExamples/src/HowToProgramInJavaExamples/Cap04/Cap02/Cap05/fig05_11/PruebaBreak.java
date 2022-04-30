// Fig. 5.11: PruebaBreak.java
// Terminación de un ciclo con break.
import javax.swing.JOptionPane;

public class PruebaBreak {

   public static void main( String args[] )
   {
      String salida = "";
      int cuenta;  
      
      for ( cuenta = 1; cuenta <= 10; cuenta++ ) {  // iterar 10 veces

         if ( cuenta == 5 )  // si cuenta vale 5, 
            break;          // terminar el ciclo

         salida += cuenta + " ";

      } // fin de instrucción for

      salida += "\nSe salió del ciclo en cuenta = " + cuenta;
      JOptionPane.showMessageDialog( null, salida );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase PruebaBreak


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
