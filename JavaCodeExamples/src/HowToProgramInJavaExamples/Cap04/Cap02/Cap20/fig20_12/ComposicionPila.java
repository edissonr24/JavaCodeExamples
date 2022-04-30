// Fig. 20.12: ComposicionPila.java
// Definición de la clase ComposicionPila con objeto Lista compuesto.
package com.deitel.cpej5.cap20;

public class ComposicionPila {
   private Lista listaPila;

   // construir pila
   public ComposicionPila() 
   { 
      listaPila = new Lista( "pila" ); 
   }

   // agregar objeto a la pila
   public synchronized void push( Object objeto )
   { 
      listaPila.insertarAlFrente( objeto ); 
   }

   // eliminar objeto de la pila
   public synchronized Object pop() throws ExcepcionListaVacia
   { 
      return listaPila.eliminarDelFrente(); 
   }

   // determinar si la pila está vacía
   public synchronized boolean estaVacia() 
   { 
      return listaPila.estaVacia(); 
   }

   // mostrar el contenido de la pila
   public synchronized void imprimir() 
   { 
      listaPila.imprimir(); 
   }

} // fin de la clase ComposicionPila


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
