// Fig. 20.13: Cola.java
// La clase Cola.
package com.deitel.cpej5.cap20;

public class Cola {
   private Lista listaCola;

   // construir cola
   public Cola() 
   { 
      listaCola = new Lista( "cola" ); 
   }

   // agregar objeto a la cola
   public synchronized void enqueue( Object objeto )
   { 
      listaCola.insertarAlFinal( objeto ); 
   }

   // eliminar objeto de la cola
   public synchronized Object dequeue() throws ExcepcionListaVacia
   { 
      return listaCola.eliminarDelFrente(); 
   }

   // determinar si la cola está vacía
   public synchronized boolean estaVacia()
   {
      return listaCola.estaVacia();
   }

   // mostrar el contenido de la cola
   public synchronized void imprimir()
   {
      listaCola.imprimir();
   }

} // fin de la clase Cola


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
