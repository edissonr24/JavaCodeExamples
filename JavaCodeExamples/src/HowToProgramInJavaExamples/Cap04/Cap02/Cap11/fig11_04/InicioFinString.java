// Fig. 11.4: InicioFinString.java
// String methods startsWith and endsWith.
import javax.swing.*;

public class InicioFinString {

   public static void main( String args[] )
   {
      String cadenas[] = { "empezó", "empezando", "terminó", "terminando" };
      String salida = "";

      // probar el método startsWith
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].startsWith( "em" ) )
            salida += "\"" + cadenas[ cuenta ] + "\" empieza con \"em\"\n";

      salida += "\n";

      // probar método startsWith, empezando desde la posición
      // 2 de la cadena
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].startsWith( "pez", 2 ) ) 
            salida += "\"" + cadenas[ cuenta ] +
               "\" empieza con \"pez\" en la posición 2\n";

      salida += "\n";

      // probar el método endsWith
      for ( int cuenta = 0; cuenta < cadenas.length; cuenta++ )

         if ( cadenas[ cuenta ].endsWith( "do" ) )
            salida += "\"" + cadenas[ cuenta ] + "\" termina con \"do\"\n";

      JOptionPane.showMessageDialog( null, salida,
         "Comparaciones con la clase String", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase InicioFinString

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
