// Fig. 6.12: SobrecargaMetodos.java
// Uso de métodos sobrecargados
import java.awt.Container;

import javax.swing.*;

public class SobrecargaMetodos extends JApplet {

   // crear GUI y llamar a cada uno de los métodos cuadrado
   public void init()
   {
      JTextArea areaSalida = new JTextArea();
      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      areaSalida.setText( "El cuadrado del valor integer 7 es " + cuadrado( 7 ) +
         "\nEl cuadrado del valor double 7.5 es " + cuadrado( 7.5 ) );

   } // fin del método init
   
   // método cuadrado con argumento int
   public int cuadrado( int intValor )
   {
      System.out.println( "Se llamo a cuadrado con argumento int: " + 
         intValor );

      return intValor * intValor;

   } // fin del método cuadrado con argumento int

   // método cuadrado con argumento double
   public double cuadrado( double doubleValor )
   {
      System.out.println( "Se llamo a cuadrado con argumento double: " + 
         doubleValor );

      return doubleValor * doubleValor;

   } // fin del método cuadrado con argumento double

} // fin de la clase SobrecargaMetodos



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
