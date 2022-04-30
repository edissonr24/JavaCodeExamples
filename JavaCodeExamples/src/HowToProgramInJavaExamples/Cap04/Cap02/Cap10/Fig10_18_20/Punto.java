// Fig. 10.19: Punto.java
// La declaración de la clase Punto que implementa a la interfaz Figura.

public class Punto extends Object implements Figura {
   private int x;  // parte x del par de coordenadas
   private int y;  // parte y del par de coordenadas

   // constructor sin argumentos; el valor predeterminado de x e y es 0
   public Punto()
   {
      // la llamada implícita al constructor de Object ocurre aquí
   } 

   // constructor
   public Punto( int valorX, int valorY )
   {
      // la llamada implícita al constructor de Object ocurre aquí
      x = valorX;  // no hay necesidad de validación
      y = valorY;  // no hay necesidad de validación
   } 
 
   // establecer x en el par de coordenadas
   public void establecerX( int valorX )
   {
      x = valorX;  // no hay necesidad de validación
   } 

   // devolver x del par de coordenadas
   public int obtenerX()
   {
      return x;
   } 

   // establecer y en el par de coordenadas
   public void establecerY( int valorY )
   {
      y = valorY;  // no hay necesidad de validación
   } 

   // devolver y del par de coordenadas
   public int obtenerY()
   {
      return y;
   } 

   // declarar el método abstracto obtenerArea
   public double obtenerArea()
   {
      return 0.0;
   } 

   // declarar el método abstracto obtenerVolumen
   public double obtenerVolumen()
   {
      return 0.0;
   } 

   // sobrescribir el método abstracto obtenerNombre para que devuelva "Punto"
   public String obtenerNombre()
   {
      return "Punto";
   } 

   // sobrescribir toString para que devuelva la representación String de Punto
   public String toString()
   {
      return "[" + obtenerX() + ", " + obtenerY() + "]";
   } 

} // fin de la clase Punto

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
