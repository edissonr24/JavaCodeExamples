// Fig. 10.12: Empleado.java
// La superclase abstracta Empleado.

public abstract class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   // constructor
   public Empleado( String nombre, String apellido, String ssn )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = ssn;
   } 

   // establecer el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } 

   // devolver el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } 

   // establecer el apellido
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } 

   // devolver el apellido
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } 

   // establecer el número de seguro social
   public void establecerNumeroSeguroSocial( String numero )
   {
      numeroSeguroSocial = numero;  // debería validarse
   } 

   // devolver el número de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } 

   // devolver representación String del objeto Empleado
   public String toString()
   {
      return obtenerPrimerNombre() + " " + obtenerApellidoPaterno() +
         "\nnúmero de seguro social: " + obtenerNumeroSeguroSocial();
   } 

   // método abstracto sobrescrito por las subclases
   public abstract double ingresos();
   
} // fin de la clase abstracta Empleado

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
