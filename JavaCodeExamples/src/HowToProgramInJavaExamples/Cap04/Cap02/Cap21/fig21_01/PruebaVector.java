// Fig. 21.1: PruebaVector.java
// Uso de la clase Vector.
import java.util.*;

public class PruebaVector {
   private static final String colores[] = { "rojo", "blanco", "azul" };

   public PruebaVector()
   {
      Vector vector = new Vector();
      imprimirVector( vector ); // imprimir el vector

      // agregar elementos al vector
      vector.add( "magenta" ); 

      for ( int cuenta = 0; cuenta < colores.length; cuenta++ )
         vector.add( colores[ cuenta ] );         

      vector.add( "cyan" );
      imprimirVector( vector ); // imprimir vector
      
      // mostrar los elementos primero y último
      try {
         System.out.println( "Primer elemento: " + vector.firstElement() );
         System.out.println( "Ultimo elemento: " + vector.lastElement() );
      }
      
      // atrapar excepción si el vector está vacío
      catch ( NoSuchElementException excepcion ) {
         excepcion.printStackTrace();
      }
      
      // ¿el vector contiene "rojo"?
      if ( vector.contains( "rojo" ) )
         System.out.println( "\n\"rojo\" se encontro en el indice " + 
            vector.indexOf( "rojo" ) + "\n" );
      else
         System.out.println( "\n\"rojo\" no se encontro\n" );
      
      vector.remove( "rojo" ); // eliminar la cadena "rojo"
      System.out.println( "\"rojo\" se ha eliminado" );
      imprimirVector( vector ); // imprimir el vector
      
      // ¿el vector contiene "rojo" después de la operación de eliminación?
      if ( vector.contains( "rojo" ) )
         System.out.println( "\"rojo\" se encontro en el indice " + 
            vector.indexOf( "rojo" ) );
      else
         System.out.println( "\"rojo\" no se encontro" );
      
      // imprimir el tamaño y la capacidad del vector
      System.out.println( "\nTamanio: " + vector.size() + 
         "\nCapacidad: " + vector.capacity() );

   } // fin del constructor
   
   private void imprimirVector( Vector vectorAMostrar )
   {
      if ( vectorAMostrar.isEmpty() ) 
         System.out.print( "el vector esta vacio" ); // vectorAMostrar está vacío
      
      else { // iterar a través de los elementos
         System.out.print( "el vector contiene: " );      
         Enumeration elementos = vectorAMostrar.elements(); 

         while ( elementos.hasMoreElements() )
            System.out.print( elementos.nextElement() + " " );
      }
      
      System.out.println( "\n" ); 
   }

   public static void main( String args[] )
   {
      new PruebaVector(); // crear objeto y llamar a su constructor
   } 

} // fin de la clase PruebaVector


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
