// Fig. 16.7: BuferNoSincronizado.java
// BuferNoSincronizado representa a un solo entero compartido.

public class BuferNoSincronizado implements Bufer {
   private int bufer = -1; // compartido por los subprocesos productor y consumidor

   // colocar valor en bufer
   public void establecer( int valor )
   {
      System.err.println( Thread.currentThread().getName() +
         " escribe " + valor );

      bufer = valor;
   }

   // devolver valor de bufer
   public int obtener()
   {
      System.err.println( Thread.currentThread().getName() +
         " lee " + bufer );

      return bufer; 
   }

} // fin de la clase BuferNoSincronizado



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
