// Fig. 5.6: Interes.java
// Cálculo del interés compuesto.
import java.text.NumberFormat;  // clase para el formato numérico
import java.util.Locale;  // clase para información específica de cada país

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interes {

   public static void main( String args[] )
   {
      double cantidad;       // cantidad depositada al final de cada año
      double principal = 1000.0;  // cantidad inicial sin intereses
      double tasa = 0.05;         // tasa de interés

      // crear NumberFormat para la moneda en dólares
      NumberFormat formatoMoneda = 
         NumberFormat.getCurrencyInstance( Locale.US );

      // crear JTextArea para mostrar la salida
      JTextArea areaTextoSalida = new JTextArea();

      // establecer la primera línea de texto en areaTextoSalida
      areaTextoSalida.setText( "Año\tCantidad en depósito\n" );

      // calcular la cantidad en depósito para cada uno de los diez años
      for ( int anio = 1; anio <= 10; anio++ ) {

         // calcular la nueva cantidad para el año especificado
         cantidad = principal * Math.pow( 1.0 + tasa, anio );

         // anexar una línea de texto a areaTextoSalida
         areaTextoSalida.append( anio + "\t" +
            formatoMoneda.format( cantidad ) + "\n" );

      } // fin de instrucción for

      // mostrar resultados
      JOptionPane.showMessageDialog( null, areaTextoSalida,
         "Interés compuesto", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

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
