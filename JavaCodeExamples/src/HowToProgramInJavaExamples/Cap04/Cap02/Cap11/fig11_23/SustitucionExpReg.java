// Fig. 11.23: SustitucionExpReg.java
// Uso de los métodos replaceFirst, replaceAll y split.
import javax.swing.*;

public class SustitucionExpReg
{
   public static void main( String args[] )
   {
      String primerString = "Este enunciado termina con 5 estrellas *****";
      String segundoString = "1, 2, 3, 4, 5, 6, 7, 8";
         
      String salida = "String original 1: " + primerString;

      // reemplazar '*' con '^'
      primerString = primerString.replaceAll( "\\*", "^" );

      salida += "\n^ reemplazó a *: " + primerString;

      // reemplazar 'estrellas' con 'intercaladores'
      primerString = primerString.replaceAll( "estrellas", "intercaladores" );

      salida += "\n\"intercaladores\" reemplazan a \"estrellas\": " + primerString;

      // reemplazar palabras con 'palabra'
      salida += "\nCada palabra reemplazada por \"palabra\": " + 
         primerString.replaceAll( "\\w+", "palabra" );

      salida += "\n\nString original 2: " + segundoString;

      // reemplazar primeros tres dígitos con 'digito'     
      for ( int i = 0; i < 3; i++ )
         segundoString = segundoString.replaceFirst( "\\d", "digito" );

      salida += "\nPrimeros 3 dígitos reemplazados por \"digito\" : " + 
         segundoString;
      salida += "\nString dividido en las comas: [";

      String[] resultados = segundoString.split( ",\\s*" ); // dividir en comas

      for ( int i = 0; i < resultados.length; i++ )
         salida += "\"" + resultados[ i ] + "\", "; // mostrar resultados

      // eliminar la coma adicional y agregar un corchete
      salida = salida.substring( 0, salida.length() - 2 ) + "]";

      JOptionPane.showMessageDialog( null, salida ); 
      System.exit( 0 );

   } // fin del método main

} // fin de la clase SustitucionExpReg

/*
 **************************************************************************
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
 **************************************************************************
*/


