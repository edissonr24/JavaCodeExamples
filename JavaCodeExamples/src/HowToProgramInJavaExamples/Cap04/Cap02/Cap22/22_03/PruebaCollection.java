// Fig. 22.3: PruebaCollection.java
// Uso de la interfaz Collection.
import java.awt.Color;
import java.util.*;

public class PruebaCollection {
   private static final String colores[] = { "rojo", "blanco", "azul" };

   // crear objeto ArrayList, agregarle objetos y manipularlo
   public PruebaCollection()
   {
      List lista = new ArrayList();             

      // agregar objetos a lista
      lista.add( Color.MAGENTA );     // agregar un objeto color

      for ( int cuenta = 0; cuenta < colores.length; cuenta++ )
         lista.add( colores[ cuenta ] );         

      lista.add( Color.CYAN );        // agregar un objeto color

      // mostrar contenido de lista
      System.out.println( "\nArrayList: " );

      for ( int cuenta = 0; cuenta < lista.size(); cuenta++ )
         System.out.print( lista.get( cuenta ) + " " );

      // eliminar todos los objetos String
      eliminarObjetosString( lista );

      // mostrar contenido de lista
      System.out.println( "\n\nArrayList despues de llamar a eliminarObjetosString: " );

      for ( int cuenta = 0; cuenta < lista.size(); cuenta++ )
         System.out.print( lista.get( cuenta ) + " " );

   } // fin del constructor PruebaCollection

   // eliminar objetos String del objeto Collection
   private void eliminarObjetosString( Collection coleccion )
   {
      Iterator iterador = coleccion.iterator(); // obtener iterador

      // iterar mientras coleccion tenga elementos
      while ( iterador.hasNext() )         

         if ( iterador.next() instanceof String )
            iterador.remove();  // eliminar objeto String
   }

   public static void main( String args[] )
   {
      new PruebaCollection();
   } 

} // fin de la clase PruebaCollection


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
