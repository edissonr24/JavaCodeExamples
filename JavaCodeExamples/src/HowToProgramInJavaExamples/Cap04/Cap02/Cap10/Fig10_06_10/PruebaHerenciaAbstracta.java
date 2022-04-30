// Fig. 10.10: PruebaHerenciaAbstracta.java
// Controlador para la jerarquía figura, punto, circulo, cilindro.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PruebaHerenciaAbstracta {

   public static void main( String args[] )
   {
      // establecer el formato de número de punto flotante
      DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

      // crear objetos Punto, Circulo y Cilindro
      Punto punto = new Punto( 7, 11 );  
      Circulo circulo = new Circulo( 22, 8, 3.5 );  
      Cilindro cilindro = new Cilindro( 20, 30, 3.3, 10.75 );  

      // obtener nombre  y representación de cadena de cada objeto
      String salida = punto.obtenerNombre() + ": " + punto + "\n" +
         circulo.obtenerNombre() + ": " + circulo + "\n" +
         cilindro.obtenerNombre() + ": " + cilindro + "\n";

      Figura arregloDeFiguras[] = new Figura[ 3 ];  // crear arreglo de Figuras

      // apuntar arregloDeFiguras[ 0 ] al objeto de la subclase Punto
      arregloDeFiguras[ 0 ] = punto;

      // apuntar arregloDeFiguras[ 1 ] al objeto de la subclase Circulo
      arregloDeFiguras[ 1 ] = circulo;

      // apuntar arregloDeFiguras[ 2 ] al objeto de la subclase Cilindro
      arregloDeFiguras[ 2 ] = cilindro;

      // iterar a través de arregloDeFiguras para obtener nombre, representación 
      // de cadena, área y volumen para cada Figura en el arreglo
      for ( int i = 0; i < arregloDeFiguras.length; i++ ) {
         salida += "\n\n" + arregloDeFiguras[ i ].obtenerNombre() + ": " + 
            arregloDeFiguras[ i ].toString() + "\nArea = " +
            dosDigitos.format( arregloDeFiguras[ i ].obtenerArea() ) +
            "\nVolumen = " +
            dosDigitos.format( arregloDeFiguras[ i ].obtenerVolumen() );
      }

      JOptionPane.showMessageDialog( null, salida );  // mostrar resultados

      System.exit( 0 );

   } // fin de main

} // fin de la clase PruebaHerenciaAbstracta

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
