// Fig. 10.16: EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision que extiende a EmpleadoPorComision.

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
   private double salarioBase;  // salario base por semana

   // constructor
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String numeroSeguroSocial, double cantidadVentasTotales,
      double tasa, double cantidadSalarioBase )
   {
      super( nombre, apellido, numeroSeguroSocial, cantidadVentasTotales, tasa );
      establecerSalarioBase( cantidadSalarioBase );
   } 

   // establecer el salario base del empleado con salario base más comisión
   public void establecerSalarioBase( double salario )
   {
      salarioBase = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario base del empleado con salario base más comisión
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } 

   // calcular los ingresos del empleado con salario base más comisión;
   // sobrescribir el método ingresos en EmpleadoPorComision
   public double ingresos()
   {
      return obtenerSalarioBase() + super.ingresos();
   } 

   // devolver la representación String de EmpleadoBaseMasComision
   public String toString()
   {
      return "\nempleado con salario base más comisión: " +
         super.obtenerPrimerNombre() + " " + super.obtenerApellidoPaterno() +
         "\nnúmero de seguro social: " + super.obtenerNumeroSeguroSocial();
   } 
   
} // fin de la clase EmpleadoBaseMasComision

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
