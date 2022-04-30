// Fig. 20.18: PruebaArbol.java
// Este programa prueba la clase Arbol.
import com.deitel.cpej5.cap20.Arbol;

public class PruebaArbol {

   public static void main( String args[] )
   {
      Arbol arbol = new Arbol();
      int valor;

      System.out.println( "Insertando los siguientes valores: " );

      // insertar 10 enteros aleatorios del 0 al 99 en arbol 
      for ( int i = 1; i <= 10; i++ ) {
         valor = ( int ) ( Math.random() * 100 );
         System.out.print( valor + " " );
         arbol.insertarNodo( valor );
      }

      System.out.println ( "\n\nRecorrido preorden" );
      arbol.recorridoPreorden(); // realizar recorrido preorden de arbol

      System.out.println ( "\n\nRecorrido inorden" );
      arbol.recorridoInorden(); // realizar recorrido inorden de arbol

      System.out.println ( "\n\nRecorrido postorden" );
      arbol.recorridoPostorden(); // realizar recorrido postorden de arbol
      System.out.println();
   }

} // fin de la clase PruebaArbol


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
