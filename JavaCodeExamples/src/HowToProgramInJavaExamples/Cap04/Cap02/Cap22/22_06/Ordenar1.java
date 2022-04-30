// Fig. 22.6: Ordenar1.java
// Uso del algoritmo sort.
import java.util.*;

public class Ordenar1 {
   private static final String palos[] = 
      { "Corazones", "Diamantes", "Treboles", "Espadas" };

   // mostrar los elementos del arreglo
   public void imprimirElementos()
   {
      // crear objeto ArrayList
      List lista = new ArrayList( Arrays.asList( palos ) );
      
      // mostrar lista
      System.out.println( "Elementos desordenados en el arreglo:\n" + lista );

      Collections.sort( lista ); // ordenar objeto ArrayList

      // mostrar lista
      System.out.println( "Elementos ordenados en el arreglo:\n" + lista );
   }

   public static void main( String args[] )
   {
      new Ordenar1().imprimirElementos();
   }   

} // fin de la clase Ordenar1


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
