// Fig. 20.10: HerenciaPila.java
// Derivada de la clase Lista.
package com.deitel.cpej5.cap20;

public class HerenciaPila extends Lista {

   // construir pila
   public HerenciaPila() 
   { 
      super( "pila" ); 
   }

   // agregar objeto a la pila
   public synchronized void push( Object objeto )
   { 
      insertarAlFrente( objeto ); 
   }

   // eliminar objeto de la pila
   public synchronized Object pop() throws ExcepcionListaVacia
   { 
      return eliminarDelFrente(); 
   }

} // fin de la clase HerenciaPila


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
