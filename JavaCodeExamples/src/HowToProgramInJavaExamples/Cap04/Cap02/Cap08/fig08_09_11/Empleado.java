// Fig. 8.10: Empleado.java
// Empleado class declaration.

public class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private Fecha fechaNacimiento;
   private Fecha fechaContratacion;

   // constructor para inicializar nombre, fecha de nacimiento y de contratación
   public Empleado( String nombre, String apellido, Fecha fechaDeNacimiento, 
      Fecha fechaDeContratacion )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      fechaNacimiento = fechaDeNacimiento;
      fechaContratacion = fechaDeContratacion;
   }

   // convertir Empleado a formato de String
   public String aStringEmpleado()
   {
      return apellidoPaterno + ", " + primerNombre +  
         "  Contratado: " + fechaContratacion.aStringFecha() +  
         "  Fecha de nacimiento: " + fechaNacimiento.aStringFecha();
   }

} // fin de la clase Empleado


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
