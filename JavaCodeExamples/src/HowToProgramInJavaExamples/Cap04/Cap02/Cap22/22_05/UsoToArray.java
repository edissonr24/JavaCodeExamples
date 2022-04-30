// Fig. 22.5: UsoToArray.java
// Uso del método toArray.
import java.util.*;

public class UsoToArray {
                     
   // crear objeto LinkedList, agregar elementos y convertir en arreglo
   public UsoToArray()
   {
      String colores[] = { "negro", "azul", "amarillo" };

      LinkedList enlaces = new LinkedList( Arrays.asList( colores ) );

      enlaces.addLast( "rojo" );   // agregar como último elemento
      enlaces.add( "rosa" );      // agregar al final
      enlaces.add( 3, "verde" );  // agregar en el 3er índice
      enlaces.addFirst( "cyan" ); // agregar como primer elemento      

      // obtener elementos de objeto LinkedList como un arreglo 
      colores = ( String [] ) enlaces.toArray( new String[ enlaces.size() ] );

      System.out.println( "colores: " );

      for ( int cuenta = 0; cuenta < colores.length; cuenta++ )
         System.out.println( colores[ cuenta ] );
   }

   public static void main( String args[] )
   {
      new UsoToArray();
   }  
                                         
} // fin de la clase UsoToArray


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
