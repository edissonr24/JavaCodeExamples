// Fig. 22.1: UsoArrays.java
// Uso de arreglos en Java.
import java.util.*;

public class UsoArrays {
   private int valoresInt[] = { 1, 2, 3, 4, 5, 6 };
   private double valoresDouble[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
   private int llenoInt[], copiaValoresInt[];

   // inicializar los arreglos
   public UsoArrays()
   {
      llenoInt = new int[ 10 ];
      copiaValoresInt = new int[ valoresInt.length ];

      Arrays.fill( llenoInt, 7 );   // llenar con 7s

      Arrays.sort( valoresDouble );   // ordenar valoresDouble en forma ascendente

      // copiar el arreglo valoresInt en el arreglo copiaValoresInt
      System.arraycopy( valoresInt, 0, copiaValoresInt,
         0, valoresInt.length );
   }

   // mostrar los valores en cada arreglo
   public void imprimirArreglos()
   {     
      System.out.print( "valoresDouble: " );

      for ( int cuenta = 0; cuenta < valoresDouble.length; cuenta++ )
         System.out.print( valoresDouble[ cuenta ] + " " );

      System.out.print( "\nvaloresInt: " );

      for ( int cuenta = 0; cuenta < valoresInt.length; cuenta++ )
         System.out.print( valoresInt[ cuenta ] + " " );

      System.out.print( "\nllenoInt: " );

      for ( int cuenta = 0; cuenta < llenoInt.length; cuenta++ )
         System.out.print( llenoInt[ cuenta ] + " " );

      System.out.print( "\ncopiaValoresInt: " );

      for ( int cuenta = 0; cuenta < copiaValoresInt.length; cuenta++ )
         System.out.print( copiaValoresInt[ cuenta ] + " " );

      System.out.println();

   } // fin del método imprimirArreglos

   // encontrar valor en el arreglo valoresInt
   public int buscarUnInt( int valor )
   {  
      return Arrays.binarySearch( valoresInt, valor );
   }

   // comparar el contenido de los arreglos
   public void imprimirIgualdad()
   {
      boolean b = Arrays.equals( valoresInt, copiaValoresInt );

      System.out.println( "valoresInt " + ( b ? "==" : "!=" ) +
         " copiaValoresInt" );

      b = Arrays.equals( valoresInt, llenoInt );

      System.out.println( "valoresInt " + ( b ? "==" : "!=" ) + 
         " llenoInt" );
   }

   public static void main( String args[] )
   {
      UsoArrays usoArrays = new UsoArrays();

      usoArrays.imprimirArreglos();
      usoArrays.imprimirIgualdad();

      int ubicacion = usoArrays.buscarUnInt( 5 );
      System.out.println( ( ubicacion >= 0 ? "Se encontro el 5 en el elemento " + 
         ubicacion : "No se encontro el 5" ) + " en valoresInt" );

      ubicacion = usoArrays.buscarUnInt( 8763 );
      System.out.println( ( ubicacion >= 0 ? "Se encontro el 8763 en el elemento " + 
         ubicacion : "No se encontro el 8763" ) + " en valoresInt" ); 
   }  
                                         
} // fin de la clase UsoArrays

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
