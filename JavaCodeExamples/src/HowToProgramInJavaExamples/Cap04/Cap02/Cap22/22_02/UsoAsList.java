// Fig. 22.2: UsoAsList.java
// Uso del método asList.
import java.util.*;

public class UsoAsList {
   private static final String valores[] = { "rojo", "blanco", "azul" };
   private List lista;

   // inicializar objeto List y establecer valor en ubicación 1
   public UsoAsList()
   {
      lista = Arrays.asList( valores );   // obtener objeto List
      lista.set( 1, "verde" );           // cambiar un valor
   }

   // mostrar objeto List y arreglo
   public void imprimirElementos()
   {
      System.out.print( "Elementos del objeto List : " );

      for ( int cuenta = 0; cuenta < lista.size(); cuenta++ )
         System.out.print( lista.get( cuenta ) + " " );

      System.out.print( "\nElementos del arreglo: " );

      for ( int cuenta = 0; cuenta < valores.length; cuenta++ )
         System.out.print( valores[ cuenta ] + " " );

      System.out.println();
   }

   public static void main( String args[] )
   {
      new UsoAsList().imprimirElementos();
   }   
                                        
} // fin de la clase UsoAsList


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
