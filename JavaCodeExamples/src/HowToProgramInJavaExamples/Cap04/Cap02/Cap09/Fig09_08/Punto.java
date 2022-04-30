// Fig. 9.4: Punto.java
// La declaración de la clase Punto representa un par de coordenadas x-y.

public class Punto {
   private int x; // parte x de un par de coordenadas
   private int y; // parte y de un par de coordenadas

   // constructor sin argumentos
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
 
   // establece x en el par de coordenadas
   public void estableceX( int valorX )
   {
      x = valorX;  // no hay necesidad de validación
   } 

   // devuelve x del par de coordenadas
   public int obtieneX()
   {
      return x;
   } 

   // establece y en el par de coordenadas
   public void estableceY( int valorY )
   {
      y = valorY;  // no hay necesidad de validación
   } 

   // devuelve y del par de coordenadas
   public int obtieneY()
   {
      return y;
   } 

   // devuelve la representación String del objeto Punto
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
