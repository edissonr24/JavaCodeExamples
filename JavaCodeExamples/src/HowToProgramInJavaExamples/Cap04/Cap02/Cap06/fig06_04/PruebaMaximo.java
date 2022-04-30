// Fig. 6.4: PruebaMaximo.java
// Encontrar el máximo de tres números de punto flotante.
import java.awt.Container;

import javax.swing.*;

public class PruebaMaximo extends JApplet {

   // inicializar el subprograma, obtener la entrada del usuario y crear GUI
   public void init()
   {
      // obtener entrada del usuario
      String s1 = JOptionPane.showInputDialog(
         "Escriba el primer valor de punto flotante" );
      String s2 = JOptionPane.showInputDialog(
         "Escriba el segundo valor de punto flotante" );
      String s3 = JOptionPane.showInputDialog(
         "Escriba el tercer valor de punto flotante" );

      // convertir la entrada del usuario en valores double
      double numero1 = Double.parseDouble( s1 );
      double numero2 = Double.parseDouble( s2 );
      double numero3 = Double.parseDouble( s3 );

      double max = maximo( numero1, numero2, numero3 ); // llamada al método

      // crear objeto JTextArea para mostrar los resultados
      JTextArea areaSalida = new JTextArea();

      // mostrar los numeros y el valor máximo 
      areaSalida.setText( "numero1: " + numero1 + "\nnumero2: " + 
         numero2 + "\nnumero3: " + numero3 + "\nel máximo es: " + max );

      // obtener el área visible del subprograma para componentes GUI
      Container contenedor = getContentPane();

      // adjuntar areaSalida al contenedor
      contenedor.add( areaSalida );

   } // fin del método init

   // el método maximo utiliza el método max de la clase Math para
   // determinar el valor máximo
   public double maximo( double x, double y, double z )
   {
      return Math.max( x, Math.max( y, z ) );

   } // fin del método maximo

} // fin de la clase PruebaMaximo


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
