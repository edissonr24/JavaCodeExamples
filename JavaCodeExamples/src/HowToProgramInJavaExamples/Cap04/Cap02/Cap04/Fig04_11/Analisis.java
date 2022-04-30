// Fig. 4.11: Analisis.java
// Análisis de los resultados de un examen.
import javax.swing.JOptionPane;

public class Analisis {

   public static void main( String args[] ) 
   {
      // inicializar variables en las declaraciones
      int aprobados = 0;          // número de aprobados
      int reprobados = 0;        // número de reprobados
      int contadorEstudiantes = 1;  // contador de estudiantes
      int resultado;              // resultado de un examen

      String entrada;            // valor introducido por el usuario
      String salida;           // cadena de salida

      // procesar 10 estudiantes utilizando un ciclo controlado por contador
      while ( contadorEstudiantes <= 10 ) {

         // pedir al usuario la entrada y obtener el valor del usuario
         entrada = JOptionPane.showInputDialog(
            "Escriba el resultado (1 = aprobado, 2 = reprobado)" );

         // convertir resultado en int
         resultado = Integer.parseInt( entrada );

         // si resultado es 1, incrementar aprobados; if...else anidado en while
         if ( resultado == 1 )
            aprobados = aprobados + 1;

         else // si resultado no es 1, incrementar reprobados
            reprobados = reprobados + 1;

         // incrementar contadorEstudiantes para que el ciclo termine eventualmente
         contadorEstudiantes = contadorEstudiantes + 1;  

      } // fin de instrucción while

      // fase de terminación; preparar y mostrar resultados
      salida = "Aprobados: " + aprobados + "\nReprobados: " + reprobados;

      // determinar si aprobaron más de 8 estudiantes
      if ( aprobados > 8 )
         salida = salida + "\nAumentar colegiatura";

      JOptionPane.showMessageDialog( null, salida, 
         "Análisis de resultados del examen", 
         JOptionPane.INFORMATION_MESSAGE );
      
      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase Analisis

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
