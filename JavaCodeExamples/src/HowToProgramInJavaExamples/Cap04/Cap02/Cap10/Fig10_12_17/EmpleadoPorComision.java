// Fig. 10.15: EmpleadoPorComision.java
// La clase EmpleadoPorComision que extiende a Empleado.

public class EmpleadoPorComision extends Empleado {
   private double ventasTotales;      // ventas totales por semana
   private double tasaComision;  // porcentaje de comisión

   // constructor
   public EmpleadoPorComision( String nombre, String apellido, 
      String numeroSeguroSocial, 
      double ventasTotalesSemana, double porcentaje )
   {
      super( nombre, apellido, numeroSeguroSocial );
      establecerVentasTotales( ventasTotalesSemana );
      establecerTasaComision( porcentaje );
   } 

   // establecer la tasa de comisión del empleado
   public void establecerTasaComision( double tasa )
   {
      tasaComision = ( tasa > 0.0 && tasa < 1.0 ) ? tasa : 0.0;
   } 

   // devolver la tasa de comisión del empleado
   public double obtenerTasaComision()
   {
      return tasaComision;
   } 

   // establecer salario base semanal del empleado por comisión
   public void establecerVentasTotales( double ventas )
   {
      ventasTotales = ventas < 0.0 ? 0.0 : ventas;
   } 

   // devolver cantidad de ventas totales del empleado por comisión
   public double obtenerVentasTotales()
   {
      return ventasTotales;
   } 

   // calcular pago del empleado por comisión;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      return obtenerTasaComision() * obtenerVentasTotales();
   } 

   // devolver la representación String del objeto EmpleadoPorComision
   public String toString()
   {
      return "\nempleado por comisión: " + super.toString();
   } 
   
} // fin de la clase EmpleadoPorComision

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
