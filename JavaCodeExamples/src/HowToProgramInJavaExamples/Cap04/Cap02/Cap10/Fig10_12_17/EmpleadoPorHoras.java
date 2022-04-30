// Fig. 10.14: EmpleadoPorHoras.java
// La clase EmpleadoPorHoras que extiende a Empleado.

public class EmpleadoPorHoras extends Empleado {
   private double sueldo;   // sueldo por hora
   private double horas;  // horas trabajadas en la semana

   // constructor
   public EmpleadoPorHoras( String nombre, String apellido, 
      String numeroSeguroSocial, double sueldoPorHora, double horasTrabajadas )
   {
      super( nombre, apellido, numeroSeguroSocial );
      establecerSueldo( sueldoPorHora );
      establecerHoras( horasTrabajadas );
   } 

   // establecer sueldo de empleado por horas
   public void establecerSueldo( double cantidadSueldo )
   {
      sueldo = cantidadSueldo < 0.0 ? 0.0 : cantidadSueldo;
   } 

   // devolver sueldo
   public double obtenerSueldo()
   {
      return sueldo;
   } 

   // establecer horas trabajadas del empleado por horas
   public void establecerHoras( double horasTrabajadas )
   {
      horas = ( horasTrabajadas >= 0.0 && horasTrabajadas <= 168.0 ) ?
         horasTrabajadas : 0.0;
   } 

   // devolver horas trabajadas
   public double obtenerHoras()
   {
      return horas;
   } 

   // calcular pago del empleado por horas;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      if ( horas <= 40 )  // sin tiempo extra
         return sueldo * horas;
      else
         return 40 * sueldo + ( horas - 40 ) * sueldo * 1.5;
   } 

   // devolver la representación String del objeto EmpleadoPorHoras
   public String toString()
   {
      return "\nempleado por horas: " + super.toString();
   } 
   
} // fin de la clase EmpleadoPorHoras

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
