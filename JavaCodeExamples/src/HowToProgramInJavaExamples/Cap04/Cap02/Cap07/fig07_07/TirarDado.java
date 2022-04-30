// Fig. 7.7: TirarDado.java
// Tirar un dado de seis lados 6000 veces.
import javax.swing.*;

public class TirarDado {

   public static void main( String args[] )
   {
      int frecuencia[] = new int[ 7 ];

      // tirar un dado 6000 veces; usar el valor del dado como índice de frecuencia
      for ( int tiro = 1; tiro <= 6000; tiro++ ) 
         ++frecuencia[ 1 + ( int ) ( Math.random() * 6 ) ];  

      String salida = "Cara\tFrecuencia";
   
      // anexar frecuencias al String salida
      for ( int cara = 1; cara < frecuencia.length; cara++ )
         salida += "\n" + cara + "\t" + frecuencia[ cara ];

      JTextArea areaSalida = new JTextArea();
      areaSalida.setText( salida );

      JOptionPane.showMessageDialog( null, areaSalida,
         "Tirar un dado 6000 veces", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase TirarDado



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
