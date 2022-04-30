// Fig. 8.13: PruebaEmpleado.java
// Prueba de la clase Empleado con la variable de clase est�tica,
// el m�todo de clase est�tico y memoria din�mica.
import javax.swing.*;

public class PruebaEmpleado {

   public static void main( String args[] )
   {
      // demostrar que cuenta es 0 antes de crear Empleados
      String salida = "Empleados antes de instanciar: " +
         Empleado.obtenerCuenta();

      // crear dos Empleados; la cuenta debe ser 2
      Empleado e1 = new Empleado( "Maria", "Flores" );
      Empleado e2 = new Empleado( "Juan", "Perez" );
   
      // demostrar que la cuenta es 2 despu�s de crear dos Empleados
      salida += "\n\nEmpleados despu�s de instanciar: " +
         "\nvia e1.obtenerCuenta(): " + e1.obtenerCuenta() +
         "\nvia e2.obtenerCuenta(): " + e2.obtenerCuenta() +
         "\nvia Empleado.obtenerCuenta(): " + Empleado.obtenerCuenta();
   
      // obtener nombres de Empleados
      salida += "\n\nEmpleado 1: " + e1.obtenerPrimerNombre() +
         " " + e1.obtenerApellidoPaterno() + "\nEmpleado 2: " + 
         e2.obtenerPrimerNombre() + " " + e2.obtenerApellidoPaterno();

      // decrementar la cuenta de referencia para cada objeto Empleado; en este 
      // ejemplo, hay s�lo una referencia a cada Empleado, por lo que estas
      // instrucciones marcan a cada objeto Empleado para la recolecci�n de basura
      e1 = null; 
      e2 = null;  

      System.gc(); // sugerir una llamada al recolector de basura

      // mostrar cuenta de objetos Empleado despu�s de llamar al recolector de basura; la cuenta 
      // mostrada puede ser 0, 1 o 2 dependiendo de si el recolector de basura
      // se ejecuta inmediatamente o no y del n�mero de objetos Empleado recolectados
      salida += "\n\nEmpleados despu�s de System.gc(): " + 
         Empleado.obtenerCuenta();

      JOptionPane.showMessageDialog( null, salida,
         "Miembros est�ticos", JOptionPane.INFORMATION_MESSAGE );

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
