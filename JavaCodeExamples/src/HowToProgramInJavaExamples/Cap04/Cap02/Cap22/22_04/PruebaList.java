// Fig. 22.4: PruebaList.java
// Uso de objetos LinkedList.
import java.util.*;

public class PruebaList {
   private static final String colores[] = { "negro", "amarillo", 
      "verde", "azul", "violeta", "plata" };
   private static final String colores2[] = { "oro", "blanco", 
      "cafe", "azul", "gris", "plata" };
                  
   // establecer y manipular los objetos LinkedList
   public PruebaList()
   {
      List enlace = new LinkedList();
      List enlace2 = new LinkedList();

      // agregar elementos a cada lista
      for ( int cuenta = 0; cuenta < colores.length; cuenta++ ) {
         enlace.add( colores[ cuenta ] );
         enlace2.add( colores2[ cuenta ] );   
      }

      enlace.addAll( enlace2 );           // concatenar listas
      enlace2 = null;                   // liberar recursos

      imprimirLista( enlace );

      objetosStringMayuscula( enlace );

      imprimirLista( enlace );

      System.out.print( "\nEliminando elementos 4 a 6..." );
      eliminarElementos( enlace, 4, 7 );

      imprimirLista( enlace );

      imprimirListaInversa( enlace );

   } // fin del constructor de PruebaList

   // mostrar contenido de objeto List
   public void imprimirLista( List lista )
   {
      System.out.println( "\nlista: " );
   
      for ( int cuenta = 0; cuenta < lista.size(); cuenta++ )
         System.out.print( lista.get( cuenta ) + " " );

      System.out.println();
   }                                                    

   // localizar objetos String y convertir en mayúscula
   private void objetosStringMayuscula( List lista )
   {
      ListIterator iterador = lista.listIterator();

      while ( iterador.hasNext() ) {
         Object objeto = iterador.next();  // obtener elemento

         if ( objeto instanceof String )   // verificar si es String
            iterador.set( ( ( String ) objeto ).toUpperCase() ); 
      }
   }

   // obtener sublista y utilizar método clear para eliminar elementos de sublista
   private void eliminarElementos( List lista, int inicio, int fin)
   {
      lista.subList( inicio, fin).clear();  // eliminar elementos
   }

   // imprimir lista inversa
   private void imprimirListaInversa( List lista )
   {
      ListIterator iterador = lista.listIterator( lista.size() );

      System.out.println( "\nLista inversa:" );

      // imprimir lista en orden inverso
      while( iterador.hasPrevious() ) 
         System.out.print( iterador.previous() + " " ); 
   }
   
   public static void main( String args[] )
   {
      new PruebaList();
   }                                           
   
} // fin de la clase PruebaList

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