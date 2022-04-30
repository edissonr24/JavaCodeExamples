// Fig. 6.8: TirarDado.java
// Tirar un dado de seis lados 6000 veces.
import javax.swing.*;

public class TirarDado {

   public static void main( String args[] )
   {
      int frecuencia1 = 0, frecuencia2 = 0, frecuencia3 = 0,
          frecuencia4 = 0, frecuencia5 = 0, frecuencia6 = 0, cara;
   
      // sintetizar resultados
      for ( int tiro = 1; tiro <= 6000; tiro++ ) {
         cara = 1 + ( int ) ( Math.random() * 6 );
   
         // determinar el valor de tiro e incrementar el contador apropiado
         switch ( cara ) {
   
            case 1:
               ++frecuencia1;
               break; 
   
            case 2:
               ++frecuencia2;
               break;
   
            case 3:
               ++frecuencia3;
               break;
   
            case 4:
               ++frecuencia4;
               break;
   
            case 5:
               ++frecuencia5;
               break;
   
            case 6:
               ++frecuencia6;
               break;

         } // fin de instrucción switch

      } // fin de instrucción for

      JTextArea areaSalida = new JTextArea();

      areaSalida.setText( "Cara\tFrecuencia" + "\n1\t" + frecuencia1 + 
         "\n2\t" + frecuencia2 + "\n3\t" + frecuencia3 + 
         "\n4\t" + frecuencia4 + "\n5\t" + frecuencia5 + 
         "\n6\t" + frecuencia6 );

      JOptionPane.showMessageDialog( null, areaSalida,
         "Tirar un dado 6000 veces", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

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
