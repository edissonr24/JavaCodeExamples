// Fig. 8.17: PruebaTiempo1.java
// Clase PruebaTiempo1 que utiliza la clase Tiempo1.

// paquetes de Java
import javax.swing.JOptionPane;

// paquetes de Deitel
import com.deitel.cpej5.cap08.Tiempo1;	// importar la clase Tiempo1

public class PruebaTiempo1 {

   public static void main( String args[] )
   {
      Tiempo1 tiempo = new Tiempo1();  // llamar al constructor de Tiempo1

      // anexar versión String de tiempo a salida String
      String salida = "La hora universal inicial es: " +
         tiempo.aStringUniversal() + "\nLa hora estándar inicial es: " +
         tiempo.aStringEstandar();

      // cambiar tiempo y anexar hora actualizada a salida
      tiempo.establecerHora( 13, 27, 6 ); 
      salida += "\n\nLa hora universal después de establecerHora es: " + 
         tiempo.aStringUniversal() +
         "\nLa hora estándar después de establecerHora es: " + tiempo.aStringEstandar();

      // establecer tiempo con valores inválidos; anexar hora actualizada a salida
      tiempo.establecerHora( 99, 99, 99 ); 
      salida += "\n\nDespués de intentar ajustes inválidos: " + 
         "\nHora universal: " + tiempo.aStringUniversal() +
         "\nHora estándar: " + tiempo.aStringEstandar();

      JOptionPane.showMessageDialog( null, salida,
         "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase PruebaTiempo1


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
