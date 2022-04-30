// Fig. 5.14: PruebaContinueEtiqueta.java
// Instrucción continue etiquetada.
import javax.swing.JOptionPane;

public class PruebaContinueEtiqueta {

   public static void main( String args[] )
   {
      String salida = "";

      siguienteFila:  // etiqueta de destino de la instrucción continue

         // contar 5 filas
         for ( int fila = 1; fila <= 5; fila++ ) {
            salida += "\n";
  
            // contar 10 columnas por fila
            for ( int columna = 1; columna <= 10; columna++ ) {
   
               // si la columna es mayor que la fila, empezar la siguiente fila
               if ( columna > fila )
                  continue siguienteFila; // siguiente iteración del ciclo etiquetado
   
               salida += "*  ";

            } // fin de instrucción for interior

         } // fin de instrucción for exterior

      JOptionPane.showMessageDialog( null, salida,
         "Probando continue con una etiqueta", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase PruebaContinueEtiqueta


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
