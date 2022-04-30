// Fig. 5.13: PruebaBreakEtiqueta.java
// Instrucción break etiquetada.
import javax.swing.JOptionPane;

public class PruebaBreakEtiqueta {

   public static void main( String args[] )
   {
      String salida = "";

      alto: {  // bloque etiquetado

         // contar 10 filas
         for ( int fila = 1; fila <= 10; fila++ ) {

            // contar 5 columnas
            for ( int columna = 1; columna <= 5 ; columna++ ) {

               if ( fila == 5 )  // si la fila es 5,
                  break alto;   // saltar al final del bloque alto

               salida += "*  ";

            } // fin de instrucción for interna

            salida += "\n";

         } // fin de for externo

         // la siguiente línea se evita
         salida += "\nLos ciclos terminaron normalmente";

      } // fin de bloque etiquetado

      JOptionPane.showMessageDialog( null, salida,
         "Probando break con una etiqueta",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase PruebaBreakEtiqueta

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
