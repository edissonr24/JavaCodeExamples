// Fig. 20.17: Arbol.java
// Definición de las clases NodoArbol y Arbol.
package com.deitel.cpej5.cap20;

// definición de la clase NodoArbol
class NodoArbol {

   // miembros de acceso del paquete
   NodoArbol nodoIzquierdo;   
   int datos;        
   NodoArbol nodoDerecho;  

   // inicializar datos y hacer de este nodo un nodo hoja
   public NodoArbol( int datosNodo )
   { 
      datos = datosNodo;              
      nodoIzquierdo = nodoDerecho = null;  // el nodo no tiene hijos
   }

   // localizar punto de inserción e insertar nuevo nodo; ignorar valores duplicados
   public synchronized void insertar( int valorInsertar )
   {
      // insertar en subárbol izquierdo
      if ( valorInsertar < datos ) {

         // insertar nuevo NodoArbol
         if ( nodoIzquierdo == null )
            nodoIzquierdo = new NodoArbol( valorInsertar );

         else // continuar recorriendo subárbol izquierdo
            nodoIzquierdo.insertar( valorInsertar ); 
      }

      // insertar en subárbol derecho
      else if ( valorInsertar > datos ) {

         // insertar nuevo NodoArbol
         if ( nodoDerecho == null )
            nodoDerecho = new NodoArbol( valorInsertar );

         else // continuar recorriendo subárbol derecho
            nodoDerecho.insertar( valorInsertar ); 
      }

   } // fin del método insertar

} // fin de la clase NodoArbol

// definición de la clase Arbol
public class Arbol {
   private NodoArbol raiz;

   // construir un objeto Arbol vacío de enteros
   public Arbol() 
   { 
      raiz = null; 
   }

   // insertar un nuevo nodo en el árbol de búsqueda binaria
   public synchronized void insertarNodo( int valorInsertar )
   {
      if ( raiz == null )
         raiz = new NodoArbol( valorInsertar ); // crear el nodo raiz aquí

      else
         raiz.insertar( valorInsertar ); // llamar al método insertar
   }

   // empezar recorrido preorden
   public synchronized void recorridoPreorden()
   { 
      ayudantePreorden( raiz ); 
   }

   // método recursivo para realizar recorrido preorden
   private void ayudantePreorden( NodoArbol nodo )
   {
      if ( nodo == null )
         return;

      System.out.print( nodo.datos + " " ); // mostrar datos del nodo
      ayudantePreorden( nodo.nodoIzquierdo );     // recorrer subárbol izquierdo
      ayudantePreorden( nodo.nodoDerecho );    // recorrer subárbol derecho
   }

   // empezar recorrido inorden
   public synchronized void recorridoInorden()
   { 
      ayudanteInorden( raiz ); 
   }

   // método recursivo para realizar recorrido inorden
   private void ayudanteInorden( NodoArbol nodo )
   {
      if ( nodo == null )
         return;

      ayudanteInorden( nodo.nodoIzquierdo );      // recorrer subárbol izquierdo
      System.out.print( nodo.datos + " " ); // mostrar datos del nodo
      ayudanteInorden( nodo.nodoDerecho );     // recorrer subárbol derecho
   }

   // empezar recorrido postorden
   public synchronized void recorridoPostorden()
   { 
      ayudantePostorden( raiz ); 
   }

   // método recursivo para realizar recorrido postorden
   private void ayudantePostorden( NodoArbol nodo )
   {
      if ( nodo == null )
         return;
  
      ayudantePostorden( nodo.nodoIzquierdo );    // recorrer subárbol izquierdo
      ayudantePostorden( nodo.nodoDerecho );   // recorrer subárbol derecho
      System.out.print( nodo.datos + " " ); // mostrar datos del nodo
   }

} // fin de la clase Arbol

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
