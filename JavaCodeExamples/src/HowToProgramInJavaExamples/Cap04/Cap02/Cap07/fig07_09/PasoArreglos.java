// Fig. 7.9: PasoArreglos.java
// Paso de arreglos y elementos individuales de un arreglo a métodos.
import java.awt.Container;
import javax.swing.*;

public class PasoArreglos extends JApplet {

   // inicializar subprograma 
   public void init()
   {
      JTextArea areaSalida = new JTextArea();
      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      int arreglo[] = { 1, 2, 3, 4, 5 };
      
      String salida = "Efectos de pasar el arreglo completo por referencia:\n" +
         "Los valores del arreglo original son:\n";

      // anexar los elementos del arreglo original al String salida 
      for ( int contador = 0; contador < arreglo.length; contador++ )
         salida += "   " + arreglo[ contador ];
   
      modificarArreglo( arreglo );  // arreglo pasado por referencia
   
      salida += "\n\nLos valores del arreglo modificado son:\n";

      // anexar los elementos del arreglo modificado al String salida 
      for ( int contador = 0; contador < arreglo.length; contador++ )
         salida += "   " + arreglo[ contador ];
   
      salida += "\n\nEfectos de pasar el elemento de un arreglo por valor:\n" +
         "arreglo[3] antes de modificarElemento: " + arreglo[ 3 ];
   
      modificarElemento( arreglo[ 3 ] );  // intento de modificar arreglo[ 3 ]
   
      salida += "\narreglo[3] después de modificarElemento: " + arreglo[ 3 ];
      areaSalida.setText( salida );
     
   } // fin del método init
   
   // multiplicar cada elemento de un arreglo por 2 
   public void modificarArreglo( int arreglo2[] )
   {
      for ( int contador = 0; contador < arreglo2.length; contador++ )
         arreglo2[ contador ] *= 2;
   }
   
   // multiplicar argumento por 2
   public void modificarElemento( int elemento )
   {
      elemento *= 2;
   }   
     
} // fin de la clase PasoArreglos



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
