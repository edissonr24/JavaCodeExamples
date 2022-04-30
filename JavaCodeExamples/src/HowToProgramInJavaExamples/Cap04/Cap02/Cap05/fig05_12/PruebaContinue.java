// Fig. 5.12: PruebaContinue.java
// Continuar con la siguiente iteración de un ciclo.
import javax.swing.JOptionPane;

public class PruebaContinue {

   public static void main( String args[] )
   {
      String salida = "";

      for ( int cuenta = 1; cuenta <= 10; cuenta++ ) {  // iterar 10 veces

         if ( cuenta == 5 )  // si cuenta vale 5, 
            continue;       // evitar el código restante en el ciclo

         salida += cuenta + " ";

      } // fin de instrucción for

      salida += "\nSe utilizó continue para evitar imprimir un 5";
      JOptionPane.showMessageDialog( null, salida );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase PruebaContinue

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
