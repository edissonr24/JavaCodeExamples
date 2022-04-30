// Fig. 20.14: PruebaCola.java
// La clase PruebaCola.
import com.deitel.cpej5.cap20.Cola;
import com.deitel.cpej5.cap20.ExcepcionListaVacia;

public class PruebaCola {

   public static void main( String args[] )
   {
      Cola cola = new Cola();  

      // crear objetos para almacenar en la cola
      Boolean bool = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 34567 );
      String cadena = "hola";

      // usar método enqueue
      cola.enqueue( bool );
      cola.imprimir();
      cola.enqueue( caracter );
      cola.imprimir();
      cola.enqueue( entero );
      cola.imprimir();
      cola.enqueue( cadena );
      cola.imprimir();

      // eliminar objetos de la cola
      try {
         Object objetoEliminado = null;

         while ( true ) {
            objetoEliminado = cola.dequeue(); // usar método dequeue
            System.out.println( objetoEliminado.toString() + " se quito de la cola" );
            cola.imprimir();
         }
      }

      // procesar excepción si la cola está vacía al eliminar el elemento
      catch ( ExcepcionListaVacia excepcionListaVacia ) {
         excepcionListaVacia.printStackTrace();
      }
   }

} // fin de la clase PruebaCola


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
