// Fig. 6.15: PruebaFactorial.java
// Método recursivo para el factorial.
import java.awt.*;

import javax.swing.*;

public class PruebaFactorial extends JApplet {
   JTextArea areaSalida;

   // crear GUI y calcular factoriales del 0-10
   public void init()
   {
      areaSalida = new JTextArea();

      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      // calcular los factoriales de 0 hasta 10
      for ( long contador = 0; contador <= 10; contador++ )
         areaSalida.append( contador + "! = " +
            factorial( contador ) + "\n" );

   } // fin del método init
   
   // declaración recursiva del método factorial
   public long factorial( long numero )
   {                  
      // caso base
      if ( numero <= 1 )  
         return 1;

      // paso recursivo
      else                
         return numero * factorial( numero - 1 );

   } // fin del método factorial

} // fin de la clase PruebaFactorial


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
