package Cap10.Fig10_01;

// Fig. 9.12: Punto3.java
// La declaraci�n de la clase Punto representa un par de coordenadas x-y.

public class Punto3 {
   private int x;  // parte x de un par de coordenadas
   private int y;  // parte y de un par de coordenadas

   // constructor sin argumentos
   public Punto3()
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
   } 

   // constructor
   public Punto3( int valorX, int valorY )
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

   // devolver la representaci�n String del objeto Punto3
   public String toString()
   {
      return "[" + obtenerX() + ", " + obtenerY() + "]";
   } 

} // fin de la clase Punto3

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
