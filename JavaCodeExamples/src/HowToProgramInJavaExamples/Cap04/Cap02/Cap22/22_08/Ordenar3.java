// Fig. 22.8: Ordenar3.java
// Creación de una clase Comparator personalizada.
import java.util.*;

public class Ordenar3 {

   public void imprimirElementos()
   {
      List lista = new ArrayList();

      lista.add( new Tiempo2(  6, 24, 34 ) );
      lista.add( new Tiempo2( 18, 14, 05 ) );
      lista.add( new Tiempo2( 12, 07, 58 ) );
      lista.add( new Tiempo2(  6, 14, 22 ) );
      lista.add( new Tiempo2(  8, 05, 00 ) );
      
      // mostrar los elementos del objeto List
      System.out.println( "Elementos desordenados en la lista:\n" + lista );

      // ordenar utilizando un comparador
      Collections.sort( lista, new ComparadorTiempo() ); 

      // mostrar los elementos del objeto List
      System.out.println( "Elementos ordenados en la lista:\n" + lista );
   }
 
   public static void main( String args[] )
   {
      new Ordenar3().imprimirElementos();
   } 
   
   private class ComparadorTiempo implements Comparator {
      int compararHora, compararMinuto, compararSegundo;
      Tiempo2 tiempo1, tiempo2;
      
      public int compare( Object objeto1, Object objeto2 )
      {
         // convertir los objetos
         tiempo1 = ( Tiempo2 ) objeto1;
         tiempo2 = ( Tiempo2 ) objeto2;
         
         compararHora = new Integer( tiempo1.obtenerHora() ).compareTo( 
                       new Integer( tiempo2.obtenerHora() ) );
         
         // probar la hora primero
         if ( compararHora != 0 )
            return compararHora;
         
         compararMinuto = new Integer( tiempo1.obtenerMinuto() ).compareTo( 
                         new Integer( tiempo2.obtenerMinuto() ) );
         
         // después probar el minuto
         if ( compararMinuto != 0 )
            return compararMinuto;
         
         compararSegundo = new Integer( tiempo1.obtenerSegundo() ).compareTo( 
                         new Integer( tiempo2.obtenerSegundo() ) );

         return compararSegundo; // devolver el resultado de comparar los segundos      
      }
      
   } // fin de la clase ComparadorTiempo
                                          
} // fin de la clase Ordenar3


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
