// Fig. 4.9: Promedio2.java
// Programa del promedio de una clase mediante la repetici�n controlada por centinela.
import java.text.DecimalFormat;  // clase para dar formato a los n�meros
import javax.swing.JOptionPane;

public class Promedio2 {

   public static void main( String args[] )
   {
      int total;           // suma de las calificaciones
      int contadorCalif;   // n�mero de calificaciones introducidas
      int calificacion;    // valor de la calificaci�n

      double promedio;  // n�mero con punto decimal para el promedio

      String cadenaCalif;  // calificaci�n introducida por el usuario

      // fase de inicializaci�n
      total = 0;         // incializar el total
      contadorCalif = 0;  // inicializar contador de ciclo
      
      // fase de procesamiento
      // obtener la primera calificaci�n del usuario
      cadenaCalif = JOptionPane.showInputDialog(
         "Escriba calificaci�n como entero o -1 para salir:" );

      // convertir cadenaCalif en int
      calificacion = Integer.parseInt( cadenaCalif );

      // iterar hasta que el usuario introduzca el valor centinela
      while ( calificacion != -1 ) {  
         total = total + calificacion;            // sumar calificacion al total
         contadorCalif = contadorCalif + 1;  // incrementar el contador

         // obtener siguiente calificaci�n del usuario
         cadenaCalif = JOptionPane.showInputDialog(
            "Escriba calificaci�n como entero o -1 para salir:" );

         // convertir cadenaCalif en int
         calificacion = Integer.parseInt( cadenaCalif );

      } // fin de instrucci�n while

      // fase de terminaci�n
      DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

      // si el usuario introdujo al menos una calificaci�n...
      if ( contadorCalif != 0 ) {

         // calcular el promedio de todas las calificaciones introducidas
         promedio = (double) total / contadorCalif;  

         // mostrar el promedio con dos d�gitos de precisi�n
         JOptionPane.showMessageDialog( null, 
            "El promedio de la clase es " + dosDigitos.format( promedio ), 
            "Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );

      } // fin de la parte if de la instrucci�n if...else

      else // si no se introdujeron calificaciones, imprimir el mensaje apropiado
         JOptionPane.showMessageDialog( null, "No se introdujeron calificaciones", 
            "Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicaci�n

   } // fin de main

} // fin de la clase Promedio2

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
