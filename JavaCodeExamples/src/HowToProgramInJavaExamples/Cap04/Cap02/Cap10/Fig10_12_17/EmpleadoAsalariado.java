// Fig. 10.13: EmpleadoAsalariado.java
// La clase EmpleadoAsalariado que extiende a Empleado.

public class EmpleadoAsalariado extends Empleado {
   private double salarioSemanal;

   // constructor
   public EmpleadoAsalariado( String nombre, String apellido, 
      String numeroSeguroSocial, double salario )
   {
      super( nombre, apellido, numeroSeguroSocial ); 
      establecerSalarioSemanal( salario );
   } 

   // establecer el salario del empleado asalariado
   public void establecerSalarioSemanal( double salario )
   {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   } 

   // devolver el salario del empleado asalariado
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } 

   // calcular el pago del empleado asalariado;
   // sobrescribir el método abstracto ingresos en Empleado
   public double ingresos()
   {
      return obtenerSalarioSemanal();
   } 

   // devolver la representación String del objeto EmpleadoAsalariado
   public String toString()
   {
      return "\nempleado asalariado: " + super.toString();
   } 
   
} // fin de la clase EmpleadoAsalariado

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
