// Fig. 10.3: PruebaRelacionJerarquia3.java
// Intento de invocar a los métodos miembros sólo de la subclase
// a través de una referencia a la superclase.

public class PruebaRelacionJerarquia3 { 

   public static void main( String[] args ) 
   {
      Punto3 punto; 
      Circulo4 circulo = new Circulo4( 120, 89, 2.7 ); 
      
      punto = circulo;  // apuntar referencia de superclase al objeto de subclase
	  
      // invocar métodos de superclase (Punto3) en objeto de subclase  
      // (Circulo4) a través de una referencia a la superclase
      int x = punto.obtenerX();
      int y = punto.obtenerY();
      punto.establecerX( 10 );  
      punto.establecerY( 20 );
      punto.toString();

      // intentar invocar a los métodos sólo de la subclase (Circulo4) en el
      // objeto de la subclase, a través de una referencia a la superclase (Punto3)
      double radio = punto.obtenerRadio();
      punto.establecerRadio( 33.33 );
      double diametro = punto.obtenerDiametro();
      double circunferencia = punto.obtenerCircunferencia();
      double area = punto.obtenerArea();

   } // fin de main

} // fin de la clase PruebaRelacionJerarquia3

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
