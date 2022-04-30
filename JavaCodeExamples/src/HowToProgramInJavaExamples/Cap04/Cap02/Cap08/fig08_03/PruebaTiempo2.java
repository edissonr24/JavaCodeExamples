// Fig. 8.3: PruebaTiempo2.java
// Errores que se producen al tratar de acceder a los miembros private de Tiempo1.
public class PruebaTiempo2 {

   public static void main( String args[] )
   {
      Tiempo1 tiempo = new Tiempo1();

      tiempo.hora = 7;    // error: hora es una variable de instancia privada
      tiempo.minuto = 15; // error: minuto es una variable de instancia privada
      tiempo.segundo = 30; // error: segundo es una variable de instancia privada
   }

} // fin de la clase PruebaTiempo2


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
