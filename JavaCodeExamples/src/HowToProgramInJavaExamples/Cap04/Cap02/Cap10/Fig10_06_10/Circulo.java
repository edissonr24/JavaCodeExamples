// Fig. 10.8: Circulo.java
// La clase Circulo que hereda de Punto.

public class Circulo extends Punto {
   private double radio;  // radio del Circulo

   // constructor sin argumentos; el valor predeterminado de radio es 0.0
   public Circulo()
   {
      // la llamada implícita al constructor de Punto ocurre aquí
   } 
   
   // constructor
   public Circulo( int x, int y, double valorRadio )
   {
      super( x, y );  // llamar al constructor de Punto
      establecerRadio( valorRadio );
   } 

   // establecer el radio
   public void establecerRadio( double valorRadio )
   {
      radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
   } 

   // devolver el radio
   public double obtenerRadio()
   {
      return radio;
   } 

   // calcular y devolver el diámetro
   public double obtenerDiametro()
   {
      return 2 * obtenerRadio();
   } 

   // calcular y devolver la circunferencia
   public double obtenerCircunferencia()
   {
      return Math.PI * obtenerDiametro();
   } 

   // sobrescribir el método abstracto obtenerArea para devolver área del Circulo
   public double obtenerArea()
   {
      return Math.PI * obtenerRadio() * obtenerRadio();
   } 

   // sobrescribir el método abstracto obtenerNombre para devolver "Circulo"
   public String obtenerNombre()
   {
      return "Circulo";
   } 

   // sobrescribir toString para devolver la representación String de Circulo
   public String toString()
   {
      return "Centro = " + super.toString() + "; Radio = " + obtenerRadio();
   } 

} // fin de la clase Circulo

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
