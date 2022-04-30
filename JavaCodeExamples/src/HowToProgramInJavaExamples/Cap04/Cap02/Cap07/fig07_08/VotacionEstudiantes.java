// Fig. 7.8: VotacionEstudiantes.java
// Programa de votación de los estudiantes.
import javax.swing.*;

public class VotacionEstudiantes {

   public static void main( String args[] )
   {
      int respuestas[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 
         10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 
         4, 8, 6, 8, 10 };
      int frecuencia[] = new int[ 11 ];

      // para cada respuesta, seleccionar el elemento de respuestas y usar ese valor 
      // como índice en frecuencia para determinar el elemento a incrementar
      for ( int respuesta = 0; respuesta < respuestas.length; respuesta++ )
         ++frecuencia[ respuestas[ respuesta ] ];

      String salida = "Calificación\tFrecuencia\n";
   
      // anexar frecuencias al String salida
      for ( int calificacion = 1; calificacion < frecuencia.length; calificacion++ )
         salida += calificacion + "\t" + frecuencia[ calificacion ] + "\n";

      JTextArea areaSalida = new JTextArea();
      areaSalida.setText( salida );

      JOptionPane.showMessageDialog( null, areaSalida,
         "Programa de votación de estudiantes", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase VotacionEstudiantes


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
