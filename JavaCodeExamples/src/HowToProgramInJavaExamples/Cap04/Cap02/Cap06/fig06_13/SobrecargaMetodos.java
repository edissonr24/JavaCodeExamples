// Fig. 6.13: SobrecargaMetodos.java
// Métodos sobrecargados con firmas idénticas.
import javax.swing.JApplet;

public class SobrecargaMetodos extends JApplet {
   
   //  declaración del método cuadrado con argumento int
   public int cuadrado( int x )
   {
      return x * x;
   }
   
   // la segunda declaración del método cuadrado 
   // con argumento int produce un error de sintaxis
   public double cuadrado( int y )
   {
      return y * y;
   }

} // fin de la clase SobrecargaMetodos



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
