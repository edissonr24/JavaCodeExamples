// Fig. 20.5: PruebaLista.java
// Clase PruebaLista para demostrar las herramientas de la clase Lista.
import com.deitel.cpej5.cap20.Lista;
import com.deitel.cpej5.cap20.ExcepcionListaVacia;

public class PruebaLista {

   public static void main( String args[] )
   {
      Lista lista = new Lista();  // crear el contenedor Lista

      // objetos a guardar en la lista
      Boolean bool = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 34567 );
      String cadena = "hola";

      // insertar referencias a objetos en la lista
      lista.insertarAlFrente( bool );
      lista.imprimir();
      lista.insertarAlFrente( caracter );
      lista.imprimir();
      lista.insertarAlFinal( entero );
      lista.imprimir();
      lista.insertarAlFinal( cadena );
      lista.imprimir();

      // eliminar objetos de la lista; imprimir después de cada remoción
      try { 
         Object objetoEliminado = lista.eliminarDelFrente();
         System.out.println( objetoEliminado.toString() + " eliminado" );
         lista.imprimir();

         objetoEliminado = lista.eliminarDelFrente();
         System.out.println( objetoEliminado.toString() + " eliminado" );
         lista.imprimir();

         objetoEliminado = lista.eliminarDelFinal();
         System.out.println( objetoEliminado.toString() + " eliminado" );
         lista.imprimir();

         objetoEliminado = lista.eliminarDelFinal();
         System.out.println( objetoEliminado.toString() + " eliminado" );
         lista.imprimir();

      } // fin del bloque try

      // atrapar excepción si se intenta eliminar en una Lista vacía 
      catch ( ExcepcionListaVacia excepcionListaVacia ) {
         excepcionListaVacia.printStackTrace();
      }
   }

} // fin de la clase PruebaLista


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
