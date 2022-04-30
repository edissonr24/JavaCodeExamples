// Ejercicio 7.16: QueHaceEsto.java
import java.awt.*;
import javax.swing.*;

public class QueHaceEsto extends JApplet {
   int resultado;

   public void init()
   {
      int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
   
      resultado = queEsEsto( arreglo, arreglo.length );

      Container contenedor = getContentPane();
      JTextArea salida = new JTextArea();
      salida.setText( "El resultado es: " + resultado );
      contenedor.add( salida );
   }

   public int queEsEsto( int arreglo2[], int longitud )
   {
      if ( longitud == 1 )
         return arreglo2[ 0 ];
      else
         return arreglo2[ longitud - 1 ] + queEsEsto( arreglo2, longitud - 1 );
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
