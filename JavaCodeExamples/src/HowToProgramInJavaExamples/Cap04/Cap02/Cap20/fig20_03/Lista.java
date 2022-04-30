// Fig. 20.3: Lista.java
// Definiciones de las clases NodoLista y Lista.
package com.deitel.cpej5.cap20;

// clase para representar un nodo en una lista
class NodoLista {

   // miembros de acceso del paquete; Lista puede utilizarlos directamente
   Object datos;    
   NodoLista siguienteNodo;

   // crear un objeto NodoLista que haga referencia a objeto 
   NodoLista( Object objeto ) 
   { 
      this( objeto, null ); 
   }

   // crear objeto NodoLista que haga referencia al objeto Object y al siguiente objeto NodoLista
   NodoLista( Object objeto, NodoLista nodo )
   {
      datos = objeto;    
      siguienteNodo = nodo;  
   }

   // devolver referencia a datos en nodo
   Object obtenerObjeto() 
   { 
      return datos; // devolver objeto Object en este nodo
   }

   // devolver referencia al siguiente nodo en la lista
   NodoLista obtenerSiguiente() 
   { 
      return siguienteNodo; // obtener el siguiente nodo
   }

} // fin de la clase NodoLista

// definición de la clase Lista
public class Lista {
   private NodoLista primerNodo;
   private NodoLista ultimoNodo;
   private String nombre;  // cadena como "lista", utilizada para imprimir

   // construir Lista vacía con "lista" como nombre
   public Lista() 
   { 
      this( "lista" ); 
   }  

   // construir una Lista vacía con un nombre
   public Lista( String nombreLista )
   {
      nombre = nombreLista;
      primerNodo = ultimoNodo = null;
   }

   // insertar objeto Object al frente de Lista
   public synchronized void insertarAlFrente( Object elementoInsertar )
   {
      if ( estaVacia() ) // primerNodo y ultimoNodo hacen referencia al mismo objeto Object
         primerNodo = ultimoNodo = new NodoLista( elementoInsertar );

      else // primerNodo hace referencia a un nuevo nodo
         primerNodo = new NodoLista( elementoInsertar, primerNodo );
   }

   // insertar objeto Object al final de la Lista
   public synchronized void insertarAlFinal( Object elementoInsertar )
   {
      if ( estaVacia() ) // primerNodo y ultimoNodo hacen referencia al mismo objeto Object
         primerNodo = ultimoNodo = new NodoLista( elementoInsertar );

      else // el objeto siguienteNodo que va después de ultimoNodo hace referencia a un nuevo nodo
         ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista( elementoInsertar );
   }

   // eliminar primer nodo de la Lista
   public synchronized Object eliminarDelFrente() throws ExcepcionListaVacia
   {
      if ( estaVacia() ) // lanzar excepción si Lista está vacía
         throw new ExcepcionListaVacia( nombre );

      Object elementoEliminado = primerNodo.datos; // recuperar los datos que se van a eliminar

      // actualizar las referencias primerNodo y ultimoNodo 
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;
      else
         primerNodo = primerNodo.siguienteNodo;

      return elementoEliminado; // devolver datos del nodo eliminado

   } // fin del método eliminarDelFrente

   // eliminar último nodo de la Lista
   public synchronized Object eliminarDelFinal() throws ExcepcionListaVacia
   {
      if ( estaVacia() ) // lanzar excepción si Lista está vacía
         throw new ExcepcionListaVacia( nombre );

      Object elementoEliminado = ultimoNodo.datos; // recuperar los datos que se van a eliminar

      // actualizar las referencias primerNodo y ultimoNodo
      if ( primerNodo == ultimoNodo )
         primerNodo = ultimoNodo = null;

      else { // localizar nuevo último nodo
         NodoLista actual = primerNodo;

         // iterar mientras nodo actual no haga referencia al últimoNodo
         while ( actual.siguienteNodo != ultimoNodo )
            actual = actual.siguienteNodo;
   
         ultimoNodo = actual; // actual es el nuevo ultimoNodo
         actual.siguienteNodo = null;
      }

      return elementoEliminado; // devolver datos del nodo eliminado

   } // fin del método eliminarDelFinal

   // determinar si la lista está vacía
   public synchronized boolean estaVacia()
   { 
      return primerNodo == null; // devolver true si la Lista está vacía
   }

   // mostrar el contenido de la Lista
   public synchronized void imprimir()
   {
      if ( estaVacia() ) {
         System.out.println( nombre + " vacia" );
         return;
      }

      System.out.print( "La " + nombre + " es: " );
      NodoLista actual = primerNodo;

      // mientras no se encuentre al final de la lista, imprimir los datos del nodo actual
      while ( actual != null ) {
         System.out.print( actual.datos.toString() + " " );
         actual = actual.siguienteNodo;
      }

      System.out.println( "\n" );
   }

} // fin de la clase Lista

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
