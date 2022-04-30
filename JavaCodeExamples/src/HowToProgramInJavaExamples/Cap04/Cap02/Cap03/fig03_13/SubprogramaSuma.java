// Fig. 3.13: SubprogramaSuma.java
// Suma dos n�meros de punto flotante.

// paquetes de Java
import java.awt.Graphics;   // importar la clase Graphics
import javax.swing.*;       // importar el paquete javax.swing

public class SubprogramaSuma extends JApplet {
   double suma;  // la suma de los valores introducidos por el usuario

   // inicializar el subprograma, obteniendo los valores del usuario
   public void init()
   {
      String primerNumero;   // primera cadena introducida por el usuario
      String segundoNumero;  // segunda cadena introducida por el usuario

      double numero1;       // primer n�mero a sumar
      double numero2;       // segundo n�mero a sumar

      // obtener el primer n�mero del usuario
      primerNumero = JOptionPane.showInputDialog(
         "Escriba el primer valor de punto flotante" );

      // obtener el segundo n�mero del usuario
      segundoNumero = JOptionPane.showInputDialog(
         "Escriba el segundo valor de punto flotante" );

      // convertir los n�meros de tipo Stromg a tipo double
      numero1 = Double.parseDouble( primerNumero ); 
      numero2 = Double.parseDouble( segundoNumero );

      // sumar los n�meros
      suma = numero1 + numero2;

   } // fin del m�todo init

   // dibujar los resultados en un rect�ngulo en el fondo del subprograma
   public void paint( Graphics g )
   {
      // llamar a la versi�n del m�todo paint de la superclase
      super.paint( g );

      // dibujar un rect�ngulo, empezando desde (15, 10), que tenga 270 
      // p�xeles de ancho y 20 p�xeles de alto
      g.drawRect( 15, 10, 270, 20 );

      // dibujar los resultados como String en (25, 25)
      g.drawString( "La suma es " + suma, 25, 25 );

   } // fin del m�todo paint

} // fin de la clase SubprogramaSuma

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
