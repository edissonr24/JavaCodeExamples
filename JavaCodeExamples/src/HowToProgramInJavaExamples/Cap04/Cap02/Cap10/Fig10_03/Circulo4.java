// Fig. 9.13: Circulo4.java
// La clase Circulo4 hereda de Punto3 y accede a las variables x e y
// de Punto 3 mediante los m�todos public de Punto3.

public class Circulo4 extends Punto3 {

   private double radio;  // El radio de Circulo4

   // constructor sin argumentos
   public Circulo4()
   {
      // la llamada impl�cita al constructor de Punto3 ocurre aqu�
   } 
   
   // constructor
   public Circulo4( int valorX, int valorY, double valorRadio )
   {
      super( valorX, valorY );  // llama al constructor de Punto3 expl�citamente
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

   // calcular y devolver el di�metro
   public double obtenerDiametro()
   {
      return 2 * obtenerRadio();
   } 

   // calcular y devolver la circunferencia
   public double obtenerCircunferencia()
   {
      return Math.PI * obtenerDiametro();
   } 

   // calcular y devolver el �rea
   public double obtenerArea()
   {
      return Math.PI * obtenerRadio() * obtenerRadio();
   } 

   // devolver la representaci�n String del objeto Circulo4
   public String toString()
   {
      return "Centro = " + super.toString() + "; Radio = " + obtenerRadio();
   } 

} // fin de la clase Circulo4

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
