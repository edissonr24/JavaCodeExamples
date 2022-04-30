// Fig. 10.6: Figura.java
// Declaración de la superclase abstracta Figura.

public abstract class Figura extends Object {
   
   // devolver el área de la figura; 0.0 de manera predeterminada
   public double obtenerArea()
   {
      return 0.0;
   } 

   // devolver el volumen de la figura; 0.0 de manera predeterminada
   public double obtenerVolumen()
   {
      return 0.0;
   } 

   // método abstracto, sobrescrito por las subclases
   public abstract String obtenerNombre();

} // fin de la clase abstracta Figura

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
