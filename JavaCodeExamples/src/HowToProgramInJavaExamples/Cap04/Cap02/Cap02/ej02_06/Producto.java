package Cap02.ej02_06;

// Paquetes de Java
import javax.swing.JOptionPane;

public class Producto {

   public static void main( String args[] )
   {
      int x;       // primer número
      int y;       // segundo número
      int z;       // tercer número
      int resultado;  // producto de los números

      String xVal;  // primera cadena introducida por el usuario
      String yVal;  // segunda cadena introducida por el usuario 
      String zVal;  // tercera cadena introducida por el usuario

      xVal = JOptionPane.showInputDialog( "Escriba el primer entero:" );
      yVal = JOptionPane.showInputDialog( "Escriba el segundo entero:" );
      zVal = JOptionPane.showInputDialog( "Escriba el tercer entero:" );

      x = Integer.parseInt( xVal );
      y = Integer.parseInt( yVal );
      z = Integer.parseInt( zVal );

      resultado = x * y * z;

      JOptionPane.showMessageDialog( null, "El producto es " + resultado );

      System.exit( 0 );

   } // fin del método main

} // fin de la clase Producto


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