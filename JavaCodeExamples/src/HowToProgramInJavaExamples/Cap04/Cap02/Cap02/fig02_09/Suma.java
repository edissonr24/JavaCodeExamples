package Cap02.fig02_09;

// Fig. 2.9: Suma.java
// Programa que muestra la suma de dos n�meros.

// Paquetes de Java
import javax.swing.JOptionPane;  // el programa utiliza JOptionPane

public class Suma{

   // el m�todo main empieza la ejecuci�n de la aplicaci�n de Java
   public static void main( String args[] )
   {
      String primerNumero;   // primera cadena introducida por el usuario
      String segundoNumero;  // segunda cadena introducida por el usuario

      int numero1;          // primer n�mero a sumar
      int numero2;          // segundo n�mero a sumar
      int suma;              // suma de numero1 y numero2

      // leer el primer n�mero del usuario como una cadena
      primerNumero = JOptionPane.showInputDialog( "Escriba el primer entero" );

      // leer el segundo n�mero del usuario como una cadena
      segundoNumero = 
         JOptionPane.showInputDialog( "Escriba el segundo entero" );

      // convertir los n�meros de tipo String a tipo int
      numero1 = Integer.parseInt( primerNumero ); 
      numero2 = Integer.parseInt( segundoNumero );

      // sumar los n�meros
      suma = numero1 + numero2;

      // mostrar el resultado
      JOptionPane.showMessageDialog( null, "La suma es " + suma, 
         "Resultados", JOptionPane.PLAIN_MESSAGE );
         
      System.exit( 0 );   // terminar aplicaci�n con la ventana

   } // fin del m�todo main

} // fin de la clase Suma
