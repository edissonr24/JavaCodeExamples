package Cap11.fig11_03;

// Fig. 11.3: CompararString.java
// Los métodos equals, equalsIgnoreCase, compareTo y regionMatches de String.
import javax.swing.JOptionPane;

public class CompararString {

   public static void main( String args[] )
   {
      String s1 = new String( "hola" );  // s1 es una copia de "hola"
      String s2 = "adiós";
      String s3 = "Feliz Cumpleaños";
      String s4 = "feliz cumpleaños";

      String salida = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + 
         "\ns4 = " + s4 + "\n\n";

      // probar igualdad
      if ( s1.equals( "hola" ) )  // true
         salida += "s1 es igual a \"hola\"\n";
      else
         salida += "s1 es distinta de \"hola\"\n"; 

      // probar igualdad con ==
      if ( s1 == "hola" )  // false; no son el mismo objeto
         salida += "s1 es igual a \"hola\"\n";
      else
         salida += "s1 es distinta de \"hola\"\n";

      // probar igualdad (ignorar mayúsculas)
      if ( s3.equalsIgnoreCase( s4 ) )  // true
         salida += "s3 es igual a s4\n";
      else
         salida += "s3 es distinta de s4\n";

      // probar compareTo
      salida += "\ns1.compareTo( s2 ) es " + s1.compareTo( s2 ) +
         "\ns2.compareTo( s1 ) es " + s2.compareTo( s1 ) +
         "\ns1.compareTo( s1 ) es " + s1.compareTo( s1 ) +
         "\ns3.compareTo( s4 ) es " + s3.compareTo( s4 ) +
         "\ns4.compareTo( s3 ) es " + s4.compareTo( s3 ) + "\n\n";

      // probar regionMatches (susceptible a mayúsculas)
      if ( s3.regionMatches( 0, s4, 0, 5 ) )
         salida += "Los primeros 5 caracteres de s3 y s4 concuerdan\n";
      else
         salida += "Los primeros 5 caracteres de s3 y s4 no concuerdan\n";

      // probar regionMatches (ignorar mayúsculas)
      if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
         salida += "Los primeros 5 caracteres de s3 y s4 concuerdan";
      else
         salida += "Los primeros 5 caracteres de s3 y s4 no concuerdan";

      JOptionPane.showMessageDialog( null, salida,
         "Comparaciones entre cadenas", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase CompararString

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
