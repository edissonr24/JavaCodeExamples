package Cap02.fig02_20;

// Fig. 2.20: Comparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales 
// y de igualdad.

// paquetes de Java
import javax.swing.JOptionPane;

public class Comparacion {

   // el m�todo main empieza la ejecuci�n de la aplicaci�n de Java
   public static void main( String args[] )
   {
      String primerNumero;   // primera cadena introducida por el usuario
      String segundoNumero;  // segunda cadena introducida por el usuario
      String resultado;        // una cadena que contiene el resultado

      int numero1;          // primer n�mero para comparar
      int numero2;          // segundo n�mero para comparar

      // recibir el primer n�mero del usuario como una cadena
      primerNumero = JOptionPane.showInputDialog( "Escriba el primer entero:" );

      // recibir el segundo n�mero del usuario como una cadena
      segundoNumero =
         JOptionPane.showInputDialog( "Escriba el segundo entero :" );
      
      // convertir los n�meros de tipo String a tipo int
      numero1 = Integer.parseInt( primerNumero );
      numero2 = Integer.parseInt( segundoNumero );

      // inicializar resultado con cadena vac�a
      resultado = "";

      if ( numero1 == numero2 )
         resultado = resultado + numero1 + " == " + numero2;

      if ( numero1 != numero2 )
         resultado = resultado + numero1 + " != " + numero2;

      if ( numero1 < numero2 )
         resultado = resultado + "\n" + numero1 + " < " + numero2;

      if ( numero1 > numero2 )
         resultado = resultado + "\n" + numero1 + " > " + numero2;

      if ( numero1 <= numero2 )
         resultado = resultado + "\n" + numero1 + " <= " + numero2;

      if ( numero1 >= numero2 )
         resultado = resultado + "\n" + numero1 + " >= " + numero2;

      // Mostrar los resultados
      JOptionPane.showMessageDialog( null, resultado, "Resultados de la comparacion",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicaci�n

   } // fin del m�todo main

} // end class Comparison
