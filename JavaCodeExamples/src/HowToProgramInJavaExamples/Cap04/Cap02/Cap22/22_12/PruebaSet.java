// Fig. 22.12: PruebaSet.java
// Uso de un objeto HashSet para eliminar duplicados.
import java.util.*;

public class PruebaSet {
   private static final String colores[] = { "rojo", "blanco", "azul",
      "verde", "gris", "anaranjado", "carne", "blanco", "cyan",
      "durazno", "gris", "anaranjado" };
                  
   // crear y mostrar objeto ArrayList
   public PruebaSet()
   {
      List lista = new ArrayList( Arrays.asList( colores ) );
      System.out.println( "ArrayList: " + lista );
      imprimirSinDuplicados( lista );
   }

   // crear conjunto a partir del arreglo para eliminar duplicados
   private void imprimirSinDuplicados( Collection coleccion )
   {
      // crear un objeto HashSet y obtener su iterador
      Set conjunto = new HashSet( coleccion );   
      Iterator iterador = conjunto.iterator(); 

      System.out.println( "\nLos no duplicados son: " );

      while ( iterador.hasNext() )
         System.out.print( iterador.next() + " " );

      System.out.println();
   }

   public static void main( String args[] )
   {
      new PruebaSet();
   }   
                                        
} // fin de la clase PruebaSet


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
