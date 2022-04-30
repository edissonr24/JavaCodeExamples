package Cap10.singleton;

// Singleton.java
// Demostración del patrón de diseño Singleton

public final class Singleton {

   // objeto Singleton que será devuelto por obtenerInstanciaSingleton
   private final static Singleton singleton = new Singleton();

   // el constructor privado evita el instanciamiento por otros objetos
   private Singleton()
   {
      System.err.println( "Objeto Singleton creado." );
   }

   // devolver objeto Singleton existente
   public static Singleton obtenerInstanciaSingleton()
   {
      return singleton;
   }
}


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
