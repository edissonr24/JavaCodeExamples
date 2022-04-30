// Fig. 8.4: PruebaThis.java
// Uso de la referencia this para hacer referencia a los campos y métodos.
import javax.swing.*;
import java.text.DecimalFormat;

public class PruebaThis {

   public static void main( String args[] )
   {
      HoraSimple hora = new HoraSimple( 12, 30, 19 );

      JOptionPane.showMessageDialog( null, hora.crearCadena(),
         "Demostración de la referencia \"this\"",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }

} // fin de la clase PruebaThis

// la clase HoraSimple demuestra el uso de la referencia "this"
class HoraSimple {
   private int hora;
   private int minuto;
   private int segundo;   

   // el constructor utiliza nombres de parámetros idénticos a los nombres de la variable
   // de instancia; se requiere la referencia "this" para diferenciar entre los nombres
   public HoraSimple( int hora, int minuto, int segundo )
   {
      this.hora = hora;      // establecer hora del objeto "this"
      this.minuto = minuto;  // establecer minuto del objeto "this"
      this.segundo = segundo;  // establecer segundo del objeto "this"
   }

   // usar "this" explícito e implícito para llamar al método aStringEstandar
   public String crearCadena()
   {
      return "this.aStringEstandar(): " + this.aStringEstandar() +
         "\naStringEstandar(): " + aStringEstandar();
   }

   // devolver la representación String de HoraSimple
   public String aStringEstandar()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );
      
      // "this" no se requiere aquí, ya que el método no tiene
      // variables locales con los mismos nombres que las variables de instancia
      return dosDigitos.format( this.hora ) + ":" +
         dosDigitos.format( this.minuto ) + ":" +
         dosDigitos.format( this.segundo );
   }

} // fin de la clase HoraSimple


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
