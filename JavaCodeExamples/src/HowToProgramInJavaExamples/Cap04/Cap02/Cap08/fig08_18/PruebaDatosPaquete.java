// Fig. 8.18: PruebaDatosPaquete.java
// Las clases en el mismo paquete (es decir, el mismo directorio) pueden
// utilizar los datos con acceso de paquete, de otras clases en el mismo paquete.
import javax.swing.JOptionPane;

public class PruebaDatosPaquete {

   public static void main( String args[] )
   {
      DatosPaquete datosPaquete = new DatosPaquete();

      // anexar representación String de datosPaquete a salida
      String salida = "Después de instanciar:\n" + 
         datosPaquete.aStringDatosPaquete();

      // cambiar los datos con acceso de paquete en el objeto datosPaquete
      datosPaquete.numero = 77;     
      datosPaquete.cadena = "Adiós";

      // anexar la representación String de datosPaquete a salida
      salida += "\nDespués de cambiar valores:\n" + 
         datosPaquete.aStringDatosPaquete();

      JOptionPane.showMessageDialog( null, salida, "Acceso a nivel de paquete", 
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase PruebaDatosPaquete

// la clase con variables de instancia con acceso de paquete
class DatosPaquete {
   int numero;     // variable de instancia con acceso de paquete
   String cadena;  // variable de instancia con acceso de paquete

   // constructor
   public DatosPaquete() 
   { 
      numero = 0; 
      cadena = "Hola";
   }               

   // devolver representación String del objeto DatosPaquete
   public String aStringDatosPaquete() 
   {
      return "numero: " + numero + "    cadena: " + cadena;
   }

} // fin de la clase DatosPaquete


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
