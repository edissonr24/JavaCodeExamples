// Fig. 22.9: Cartas.java
// Uso del algoritmo shuffle.
import java.util.*;

// clase para representar un objeto Carta en un mazo de cartas
class Carta {
   private String cara;
   private String palo;

   // inicializar un objeto Carta
   public Carta( String caraInicial, String paloInicial )
   {
      cara = caraInicial;
      palo = paloInicial;
   }

   // devolver cara de objeto Carta
   public String obtenerCara() 
   { 
      return cara; 
   }

   // devolver palo de objeto Carta
   public String obtenerPalo() 
   { 
      return palo; 
   }

   // devolver representación String de objeto Carta
   public String toString()
   {
      StringBuffer bufer = new StringBuffer( cara + " de " + palo );
      bufer.setLength( 20 );

      return bufer.toString();
   }

} // fin de la clase Carta

// declaración de la clase Cartas
public class Cartas {
   private static final String palos[] = 
      { "Corazones", "Treboles", "Diamantes", "Espadas" };
   private static final String caras[] = { "As", "Dos", "Tres",
      "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
      "Joto", "Quina", "Rey" };
   private List lista;

   // configurar mazo de Cartas y barajar
   public Cartas()
   {
      Carta mazo[] = new Carta[ 52 ];

      for ( int cuenta = 0; cuenta < mazo.length; cuenta++ )
         mazo[ cuenta ] = new Carta( caras[ cuenta % 13 ],
            palos[ cuenta / 13 ] );

      lista = Arrays.asList( mazo );   // obtener objeto List
      Collections.shuffle( lista );    // barajar mazo
   }

   // mostrar mazo
   public void imprimirCartas()
   {
      int mitad = lista.size() / 2 - 1;

      for ( int i = 0, j = mitad + 1; i <= mitad; i++, j++ )
         System.out.println( lista.get( i ).toString() + lista.get( j ) );
   }

   public static void main( String args[] )
   {
      new Cartas().imprimirCartas();
   }    
                                       
} // fin de la clase Cartas

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
