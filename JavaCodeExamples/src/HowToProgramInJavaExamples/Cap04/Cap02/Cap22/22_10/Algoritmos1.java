// Fig. 22.10: Algoritmos1.java
// Uso de los algoritmos reverse, fill, copy, min y max.
import java.util.*;

public class Algoritmos1 {
   private String letras[] = { "P", "C", "M" }, copiaLetras[];
   private List lista, listaCopia;

   // crear un objeto List y manipularlo con métodos de las colecciones
   public Algoritmos1()
   {
      lista = Arrays.asList( letras );     // obtener objeto List
      copiaLetras = new String[ 3 ];
      listaCopia = Arrays.asList( copiaLetras );

      System.out.println( "Lista inicial: " );
      mostrar( lista );

      Collections.reverse( lista );         // invertir el orden
      System.out.println( "\nDespues de llamar a reverse: " );
      mostrar( lista );

      Collections.copy( listaCopia, lista );  // copiar objeto List
      System.out.println( "\nDespues de copiar: " );
      mostrar( listaCopia );

      Collections.fill( lista, "R" );       // llenar lista con Rs
      System.out.println( "\nDespues de llamar a fill: " );
      mostrar( lista );

   } // fin del constructor

   // mostrar información del objeto List
   private void mostrar( List refLista )
   {
      System.out.print( "La lista es: " );

      for ( int k = 0; k < refLista.size(); k++ )
         System.out.print( refLista.get( k ) + " " );

      System.out.print( "\nMax: " + Collections.max( refLista ) );
      System.out.println( "  Min: " + Collections.min( refLista ) );
   }

   public static void main( String args[] )
   {
      new Algoritmos1();
   } 
                                          
} // fin de la clase Algoritmos1


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
