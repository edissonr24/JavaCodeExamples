// Fig. 8.6: PruebaTiempo3.java
// Constructores sobrecargados utilizados para inicializar objetos Tiempo2.
import javax.swing.*;

public class PruebaTiempo3 {

   public static void main( String args[] )
   {
      Tiempo2 t1 = new Tiempo2();              // 00:00:00
      Tiempo2 t2 = new Tiempo2( 2 );           // 02:00:00
      Tiempo2 t3 = new Tiempo2( 21, 34 );      // 21:34:00
      Tiempo2 t4 = new Tiempo2( 12, 25, 42 );  // 12:25:42
      Tiempo2 t5 = new Tiempo2( 27, 74, 99 );  // 00:00:00
      Tiempo2 t6 = new Tiempo2( t4 );          // 12:25:42

      String salida = "Se construyó con: " +
         "\nt1: todos los argumentos predeterminados" +
         "\n      " + t1.aStringUniversal() +
         "\n      " + t1.aStringEstandar();

      salida += "\nt2: se especificó hora; minuto y segundo predeterminados" +
         "\n      " + t2.aStringUniversal() +
         "\n      " + t2.aStringEstandar();

      salida += "\nt3: se especificaron hora y minuto; segundo predeterminado" +
         "\n      " + t3.aStringUniversal() +
         "\n      " + t3.aStringEstandar();

      salida += "\nt4: se especificaron hora, minuto y segundo" +
         "\n      " + t4.aStringUniversal() +
         "\n      " + t4.aStringEstandar();

      salida += "\nt5: se especificaron todos como valores inválidos" +
         "\n      " + t5.aStringUniversal() +
         "\n      " + t5.aStringEstandar();

      salida += "\nt6: se específico objeto t4 de la clase Tiempo2" +
         "\n      " + t6.aStringUniversal() +
         "\n      " + t6.aStringEstandar();

      JOptionPane.showMessageDialog( null, salida,
         "Constructores sobrecargados", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   } // fin de main

} // fin de la clase PruebaTiempo3


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
