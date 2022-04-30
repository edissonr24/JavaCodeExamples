// Fig. 10.7: Punto.java
// Declaraci�n de la clase Punto que hereda de Figura.

public class Punto extends Figura {
   private int x;  // parte x del par de coordenadas
   private int y;  // parte y del par de coordenadas

   // constructor sin argumentos; valor predeterminado de 0 para x e y
   public Punto()
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
   } 

   // constructor
   public Punto( int valorX, int valorY )
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
      x = valorX;  // no hay necesidad de validaci�n
      y = valorY;  // no hay necesidad de validaci�n
   } 
 
   // establecer x en el par de coordenadas
   public void establecerX( int valorX )
   {
      x = valorX;  // no hay necesidad de validaci�n
   } 

   // devolver x del par de coordenadas
   public int obtenerX()
   {
      return x;
   } 

   // establecer y en el par de coordenadas
   public void establecerY( int valorY )
   {
      y = valorY;  // no hay necesidad de validaci�n
   } 

   // devolver y del par de coordenadas
   public int obtenerY()
   {
      return y;
   } 

   // sobrescribir el m�todo abstracto obtenerNombre para devolver "Punto"
   public String obtenerNombre()
   {
      return "Punto";
   } 

   // sobrescribir a toString para devolver la representaci�n String de Punto
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
