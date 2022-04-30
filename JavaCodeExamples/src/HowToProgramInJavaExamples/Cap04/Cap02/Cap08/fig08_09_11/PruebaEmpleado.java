// Fig. 8.11: PruebaEmpleado.java
// Demostración de un objeto que tiene como miembro a otro objeto.
import javax.swing.JOptionPane;

public class PruebaEmpleado {

   public static void main( String args[] )
   {
      Fecha nacimiento = new Fecha( 7, 24, 1949 );
      Fecha contratacion = new Fecha( 3, 12, 1988 );
      Empleado empleado = new Empleado( "Juan", "Pérez", nacimiento, contratacion );

      JOptionPane.showMessageDialog( null, empleado.aStringEmpleado(), 
         "Prueba de la clase Empleado", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase PruebaEmpleado



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
