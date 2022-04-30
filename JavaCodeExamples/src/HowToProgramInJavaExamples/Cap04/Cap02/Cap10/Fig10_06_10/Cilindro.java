// Fig. 10.9: Cilindro.java
// La clase Cilindro que hereda de Circulo.

public class Cilindro extends Circulo {
   private double altura;  // la altura del Cilindro

   // constructor sin argumentos; el valor predeterminado de altura es 0.0
   public Cilindro()
   {
      // la llamada implícita al constructor de Circulo ocurre aquí
   } 

   // constructor
   public Cilindro( int x, int y, double radio, double valorAltura )
   {
      super( x, y, radio );  // llamar al constructor de Circulo
      establecerAltura( valorAltura );
   } 

   // establecer la altura del Cilindro
   public void establecerAltura( double valorAltura )
   {
      altura = ( valorAltura < 0.0 ? 0.0 : valorAltura );
   } 

   // obtener la altura del Cilindro
   public double obtenerAltura()
   {
      return altura;
   } 

   // sobrescribir método abstracto obtenerArea para devolver area de Cilindro
   public double obtenerArea()
   {
      return 2 * super.obtenerArea() + obtenerCircunferencia() * obtenerAltura();
   } 

   // sobrescribir método abstracto obtenerVolumen para devolver valor del Cilindro
   public double obtenerVolumen()
   {
      return super.obtenerArea() * obtenerAltura();
   } 

   // sobrescribir método abstracto obtenerNombre para devolver "Cilindro"
   public String obtenerNombre()
   {
      return "Cilindro";
   } 

   // sobrescribir toString para devolver representación String del Cilindro
   public String toString()
   {
      return super.toString() + "; Altura = " + obtenerAltura();
   } 

} // fin de la clase Cilindro

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
