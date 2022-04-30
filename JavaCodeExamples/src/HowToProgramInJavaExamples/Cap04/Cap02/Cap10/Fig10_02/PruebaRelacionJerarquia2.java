// Fig. 10.2: PruebaRelacionJerarquia2.java
// Intento de asignar la referencia de una superclase a una variable de tipo subclase.

public class PruebaRelacionJerarquia2 { 

   public static void main( String[] args ) 
   {
      Punto3 punto = new Punto3( 30, 50 );
      Circulo4 circulo;  // variable de tipo subclase

      // asignar la referencia de la superclase a la variable de tipo subclase
      circulo = punto;  // Error: un Punto3 no es un Circulo4
   }

} // fin de la clase PruebaRelacionJerarquia2

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
