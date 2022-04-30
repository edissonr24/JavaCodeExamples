// Fig. 6.7: EnterosAleatorios.java
// Enteros aleatorios con desplazamiento y escala.
import javax.swing.JOptionPane;

public class EnterosAleatorios {

   public static void main( String args[] )
   {
      int valor;
      String salida = "";

      // iterar 20 veces
      for ( int contador = 1; contador <= 20; contador++ ) {

         // elegir entero aleatorio entre 1 y 6
         valor = 1 + ( int ) ( Math.random() * 6 );

         salida += valor + "  ";  // anexar valor a salida
         
         // si el contador es divisible entre 5, anexar nueva línea a String salida
         if ( contador % 5 == 0 )
            salida += "\n";

      } // fin de instrucción for

      JOptionPane.showMessageDialog( null, salida, 
         "20 números aleatorios de 1 a 6", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase EnterosAleatorios



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
