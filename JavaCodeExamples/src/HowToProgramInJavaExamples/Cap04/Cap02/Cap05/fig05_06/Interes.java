// Fig. 5.6: Interes.java
// C�lculo del inter�s compuesto.
import java.text.NumberFormat;  // clase para el formato num�rico
import java.util.Locale;  // clase para informaci�n espec�fica de cada pa�s

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interes {

   public static void main( String args[] )
   {
      double cantidad;       // cantidad depositada al final de cada a�o
      double principal = 1000.0;  // cantidad inicial sin intereses
      double tasa = 0.05;         // tasa de inter�s

      // crear NumberFormat para la moneda en d�lares
      NumberFormat formatoMoneda = 
         NumberFormat.getCurrencyInstance( Locale.US );

      // crear JTextArea para mostrar la salida
      JTextArea areaTextoSalida = new JTextArea();

      // establecer la primera l�nea de texto en areaTextoSalida
      areaTextoSalida.setText( "A�o\tCantidad en dep�sito\n" );

      // calcular la cantidad en dep�sito para cada uno de los diez a�os
      for ( int anio = 1; anio <= 10; anio++ ) {

         // calcular la nueva cantidad para el a�o especificado
         cantidad = principal * Math.pow( 1.0 + tasa, anio );

         // anexar una l�nea de texto a areaTextoSalida
         areaTextoSalida.append( anio + "\t" +
            formatoMoneda.format( cantidad ) + "\n" );

      } // fin de instrucci�n for

      // mostrar resultados
      JOptionPane.showMessageDialog( null, areaTextoSalida,
         "Inter�s compuesto", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicaci�n

   } // fin de main

} // fin de la clase Interes

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
