// Fig. 22.11: PruebaBinarySearch.java
// Uso del algoritmo binarySearch.
import java.util.*;

public class PruebaBinarySearch {
   private static final String colores[] = { "rojo", "blanco",  
      "azul", "negro", "amarillo", "morado", "carne", "rosa" };
   private List lista;        // referencia ArrayList

   // crear, ordenar y mostrar lista
   public PruebaBinarySearch()
   {
      lista = new ArrayList( Arrays.asList( colores ) );  
      Collections.sort( lista );   // Ordenar el objeto ArrayList
      System.out.println( "Objeto ArrayList ordenado: " + lista );
   }

   // buscar en lista varios valores
   private void imprimirResultadosBusqueda()
   {
      ayudanteImprimirResultadosBusqueda( colores[ 3 ] ); // primer elemento
      ayudanteImprimirResultadosBusqueda( colores[ 0 ] ); // elemento de enmedio
      ayudanteImprimirResultadosBusqueda( colores[ 7 ] ); // último elemento
      ayudanteImprimirResultadosBusqueda( "hormiguero" );  // más abajo del menor
      ayudanteImprimirResultadosBusqueda( "cabra" );      // no existe
      ayudanteImprimirResultadosBusqueda( "cebra" );     // no existe
   }

   // método ayudante para realizar búsquedas
   private void ayudanteImprimirResultadosBusqueda( String clave )
   {
      int resultado = 0;

      System.out.println( "\nBuscando: " + clave );
      resultado = Collections.binarySearch( lista, clave );
      System.out.println( ( resultado >= 0 ? "Se encontro en el indice " + resultado :
         "No se encontro (" + resultado + ")" ) );
   }

   public static void main( String args[] )
   {
      new PruebaBinarySearch().imprimirResultadosBusqueda();
   }       

} // fin de la clase PruebaBinarySearch

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
