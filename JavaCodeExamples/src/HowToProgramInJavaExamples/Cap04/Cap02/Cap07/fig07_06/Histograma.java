// Fig. 7.6: Histograma.java
// Programa para imprimir histogramas.
import javax.swing.*;

public class Histograma {

   public static void main( String args[] )
   {
      int arreglo[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };

      String salida = "Elemento\tValor\tHistograma";

      // para cada elemento del arreglo, mostrar una barra en el histograma
      for ( int contador = 0; contador < arreglo.length; contador++ ) {
         salida += "\n" + contador + "\t" + arreglo[ contador ] + "\t";

         // imprimir barra de asteriscos
         for ( int estrellas = 0; estrellas < arreglo[ contador ]; estrellas++ )
            salida += "*";

      } // fin de instrucción for externa

      JTextArea areaSalida = new JTextArea();
      areaSalida.setText( salida );

      JOptionPane.showMessageDialog( null, areaSalida,
         "Programa para imprimir histogramas", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase Histograma



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
