// Fig. 6.3: CuadradoEnteros.java
// Crear y utilizar un método definido por el programador.
import java.awt.Container;

import javax.swing.*;

public class CuadradoEnteros extends JApplet {

   // configurar GUI y calcular los cuadrados de los enteros del 1 al 10
   public void init()
   {
      // objeto JTextArea para mostrar resultados
      JTextArea areaSalida = new JTextArea();

      // obtener panel de contenido del subprograma (área visible del componente de GUI)
      Container contenedor = getContentPane();

      // adjuntar areaSalida al contenedor
      contenedor.add( areaSalida ); 

      int resultado;          // guardar el resultado de la llamada al método cuadrado
      String salida = "";  // Objeto String que contiene los resultados

      // iterar 10 veces
      for ( int contador = 1; contador <= 10; contador++ ) {
         resultado = cuadrado( contador );  // llamada al método

         // anexar resultado al objeto String salida 
         salida += "El cuadrado de " + contador + " es " + resultado + "\n";

      } // fin de instrucción for 

      areaSalida.setText( salida );  // colocar resultados en el objeto JTextArea

   } // fin del método init
   
   // declaración del método cuadrado
   public int cuadrado( int y )
   {
      return y * y;  // devolver cuadrado de y

   } // fin del método cuadrado

} // fin de la clase CuadradoEnteros


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
