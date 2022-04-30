// Fig. 7.4: InicArreglo.java
// Inicialización de un arreglo con los enteros pares del 2 al 20.
import javax.swing.*;

public class InicArreglo {

   public static void main( String args[] )
   {
      final int LONGITUD_ARREGLO = 10;    // constante
      int arreglo[];                    // referencia a un arreglo int

      arreglo = new int[ LONGITUD_ARREGLO ];  // crear el arreglo

      // calcular el valor para cada elemento del arreglo
      for ( int contador = 0; contador < arreglo.length; contador++ )
         arreglo[ contador ] = 2 + 2 * contador;

      String salida = "Índice\tValor\n";
   
      for ( int contador = 0; contador < arreglo.length; contador++ )
         salida += contador + "\t" + arreglo[ contador ] + "\n";

      JTextArea areaSalida = new JTextArea();
      areaSalida.setText( salida );

      JOptionPane.showMessageDialog( null, areaSalida,
         "Inicialización con enteros pares del 2 al 20",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase InicArreglo


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
