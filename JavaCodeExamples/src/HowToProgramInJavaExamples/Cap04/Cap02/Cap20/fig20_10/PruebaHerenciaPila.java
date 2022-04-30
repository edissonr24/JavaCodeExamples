// Fig. 20.11: PruebaHerenciaPila.java
// La clase PruebaHerenciaPila.
import com.deitel.cpej5.cap20.HerenciaPila;
import com.deitel.cpej5.cap20.ExcepcionListaVacia;

public class PruebaHerenciaPila {

   public static void main( String args[] )
   {
      HerenciaPila pila = new HerenciaPila();  

      // crear objetos que se van a almacenar en la pila
      Boolean bool = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 34567 );
      String cadena = "hola";

      // usar método push
      pila.push( bool );
      pila.imprimir();
      pila.push( caracter );
      pila.imprimir();
      pila.push( entero );
      pila.imprimir();
      pila.push( cadena );
      pila.imprimir();

      // eliminar elementos de la pila
      try {
         Object objetoEliminado = null;

         while ( true ) {
            objetoEliminado = pila.pop(); // usar método pop
            System.out.println( objetoEliminado.toString() + " sacado" );
            pila.imprimir();
         }
      }

      // atrapar excepción si pila queda vacía al sacar elemento
      catch ( ExcepcionListaVacia excepcionListaVacia ) {
         excepcionListaVacia.printStackTrace();
      }
   }

} // fin de la clase PruebaHerenciaPila


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
