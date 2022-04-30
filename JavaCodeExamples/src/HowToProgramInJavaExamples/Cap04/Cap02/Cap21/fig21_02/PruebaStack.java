// Fig. 21.2: PruebaStack.java
// Programa para probar la clase java.util.Stack.
import java.util.*;

public class PruebaStack {

   public PruebaStack()
   {
      Stack pila = new Stack();  

      // crear objetos para almacenarlos en la pila
      Boolean bool = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 34567 );
      String cadena = "hola";

      // usar el método push
      pila.push( bool );
      imprimirPila( pila );
      pila.push( caracter );
      imprimirPila( pila );
      pila.push( entero );
      imprimirPila( pila );
      pila.push( cadena );
      imprimirPila( pila );

      // eliminar elementos de la pila
      try {
         Object objetoEliminado = null;

         while ( true ) {
            objetoEliminado = pila.pop(); // usar el método pop
            System.out.println( objetoEliminado.toString() + " sacado" );
            imprimirPila( pila );
         }
      }

      // atrapar excepción si la pila está vacía al sacar el elemento
      catch ( EmptyStackException excepcionPilaVacia ) {
         excepcionPilaVacia.printStackTrace();
      }
   }
   
   private void imprimirPila( Stack pila )
   {
      if ( pila.isEmpty() )
         System.out.print( "la pila esta vacia" ); // la pila está vacía
      
      else {
         System.out.print( "la pila contiene: " );      
         Enumeration elementos = pila.elements();
         
         // iterar a través de los elementos
         while ( elementos.hasMoreElements() )
            System.out.print( elementos.nextElement() + " " );
      }
      
      System.out.println( "\n" ); // avanzar a la siguiente línea
   }
   
   public static void main( String args[] )
   {
      new PruebaStack();
   }

} // fin de la clase PruebaStack


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
