// Fig. 4.7: Promedio1.java
// Programa del promedio de una clase mediante la repetici�n controlada por contador.
import javax.swing.JOptionPane;

public class Promedio1 {

   public static void main( String args[] ) 
   {
      int total;          // suma de las calificaciones introducidas por el usuario
      int contadorCalif;  // n�mero de calificaci�n a introducir a continuaci�n
      int calificacion;   // valor de la calificaci�n
      int promedio;       // promedio de calificaciones

      String cadenaCalif; // calificaci�n introducida por el usuario
   
      // fase de inicializaci�n
      total = 0;          // inicializar total
      contadorCalif = 1;   // inicializar contador de ciclo
   
      // fase de procesamiento
      while ( contadorCalif <= 10 ) {  // iterar 10 veces

         // pedir la entrada y leer la calificaci�n del usuario
         cadenaCalif = JOptionPane.showInputDialog( 
            "Escriba la calificaci�n como un entero: " );

         // convertir cadenaCalif en int
         calificacion = Integer.parseInt( cadenaCalif );

         total = total + calificacion;            // sumar calificacion al total
         contadorCalif = contadorCalif + 1;  // incrementar el contador

      } // fin de instrucci�n while
   
      // fase de terminaci�n
      promedio = total / 10;  // divisi�n de enteros

      // mostrar el promedio de las calificaciones del examen
      JOptionPane.showMessageDialog( null, "El promedio de la clase es " + promedio, 
         "Promedio de la clase", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar el programa

   } // fin de main

} // fin de la clase Promedio1

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
