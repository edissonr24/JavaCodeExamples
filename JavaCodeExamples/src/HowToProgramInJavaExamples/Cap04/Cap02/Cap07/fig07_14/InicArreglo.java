// Fig. 7.14: InicArreglo.java
// Inicialización de arreglos bidimensionales.
import java.awt.Container;
import javax.swing.*;

public class InicArreglo extends JApplet {
   JTextArea areaSalida;

   // configurar GUI e inicializar el subprograma
   public void init()
   {
      areaSalida = new JTextArea();
      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      int arreglo1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };        
      int arreglo2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 

      areaSalida.setText( "Los valores en arreglo1 por fila son\n" );
      crearSalida( arreglo1 );
   
      areaSalida.append( "\nLos valores en arreglo2 por fila son\n" );
      crearSalida( arreglo2 );

   } // fin del método init

   // anexar filas y columnas de un arreglo a areaSalida
   public void crearSalida( int arreglo[][] )
   {
      // iterar a través de las filas del arreglo
      for ( int fila = 0; fila < arreglo.length; fila++ ) {

         // iterar a través de las columnas de la fila actual
         for ( int columna = 0; columna < arreglo[ fila ].length; columna++ )
            areaSalida.append( arreglo[ fila ][ columna ] + "  " );

         areaSalida.append( "\n" );
      }

   } // fin del método crearSalida

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
