// Fig. 22.13: PruebaSortedSet.java
// Uso de TreeSet y SortedSet.
import java.util.*;

public class PruebaSortedSet {
   private static final String nombres[] = { "amarillo", "verde",
       "negro", "carne", "gris", "blanco", "anaranjado", "rojo", "verde" };
   
   // crear un conjunto ordenado con TreeSet, después manipularlo
   public PruebaSortedSet()
   {
      SortedSet arbol = new TreeSet( Arrays.asList( nombres ) );

      System.out.println( "conjunto: " );
      imprimirConjunto( arbol );

      // obtener conjunto headSet con base en "carne"
      System.out.print( "\nheadSet (\"carne\"):  " );
      imprimirConjunto( arbol.headSet( "carne" ) );

      // obtener conjunto tailSet con base en "carne"
      System.out.print( "tailSet (\"carne\"):  " );
      imprimirConjunto( arbol.tailSet( "carne" ) );

      // obtener elementos primero y último
      System.out.println( "primero: " + arbol.first() );
      System.out.println( "ultimo : " + arbol.last() );
   }

   // mostrar conjunto
   private void imprimirConjunto( SortedSet conjunto )
   {
      Iterator iterador = conjunto.iterator();

      while ( iterador.hasNext() )     
         System.out.print( iterador.next() + " " );

      System.out.println();
   } 

   public static void main( String args[] )
   {
      new PruebaSortedSet();
   }  
 
} // fin de la clase PruebaSortedSet

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
