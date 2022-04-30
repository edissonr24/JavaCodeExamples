// Fig. 9.4: Punto.java
// La declaraci�n de la clase Punto representa un par de coordenadas x-y.

public class Punto {
   private int x; // parte x de un par de coordenadas
   private int y; // parte y de un par de coordenadas

   // constructor sin argumentos
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
 
   // establece x en el par de coordenadas
   public void estableceX( int valorX )
   {
      x = valorX;  // no hay necesidad de validaci�n
   } 

   // devuelve x del par de coordenadas
   public int obtieneX()
   {
      return x;
   } 

   // establece y en el par de coordenadas
   public void estableceY( int valorY )
   {
      y = valorY;  // no hay necesidad de validaci�n
   } 

   // devuelve y del par de coordenadas
   public int obtieneY()
   {
      return y;
   } 

   // devuelve la representaci�n String del objeto Punto
   public String toString()
   {
      return "[" + x + ", " + y + "]";
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
