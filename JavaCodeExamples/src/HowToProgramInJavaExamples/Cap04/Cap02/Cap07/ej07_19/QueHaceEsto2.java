// Exercise 7.19: QueHaceEsto2.java
import java.awt.*;
import javax.swing.*;

public class QueHaceEsto2 extends JApplet {

   public void init()
   {
      int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      JTextArea areaSalida = new JTextArea();

      unaFuncion( arreglo, 0, areaSalida );

      Container contenedor = getContentPane();
      contenedor.add( areaSalida );
   }
   
   public void unaFuncion( int arreglo2[], int x, JTextArea salida )
   {
      if ( x < arreglo2.length ) {
         unaFuncion( arreglo2, x + 1, salida );
         salida.append( arreglo2[ x ] + "  " );
      }
   }
}



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
