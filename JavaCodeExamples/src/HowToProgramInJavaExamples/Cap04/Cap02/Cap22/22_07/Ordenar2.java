// Fig. 22.7: Ordenar2.java
// Uso de un objeto Comparator con el algoritmo sort.
import java.util.*;

public class Ordenar2 {
   private static final String palos[] = 
      { "Corazones", "Diamantes", "Treboles", "Espadas" };

   // mostrar los elementos del objeto List
   public void imprimirElementos()
   {
      List lista = Arrays.asList( palos ); // crear objeto List

      // mostrar elementos del objeto List
      System.out.println( "Elementos desordenados en la lista:\n" + lista );

      // ordenar en forma descendente utilizando un comparador
      Collections.sort( lista, Collections.reverseOrder() ); 

      // mostrar los elementos del objeto List
      System.out.println( "Elementos ordenados en la lista:\n" + lista );
   }
 
   public static void main( String args[] )
   {
      new Ordenar2().imprimirElementos();
   } 
                                          
} // fin de la clase Ordenar2


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
