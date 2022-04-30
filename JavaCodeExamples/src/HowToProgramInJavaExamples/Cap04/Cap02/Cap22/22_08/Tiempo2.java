// Fig. 8.6: Tiempo2.java
// Definición de la clase Tiempo2 con métodos establecer y obtener

// paquetes de Java
import java.text.DecimalFormat;  

public class Tiempo2 {
   private int hora;     // 0 - 23
   private int minuto;   // 0 - 59
   private int segundo;   // 0 - 59

   // el constructor de Tiempo2 inicializa cada variable de instancia
   // en cero. Se asegura que el objeto Tiempo2 empiece en un 
   // estado consistente.
   public Tiempo2() 
   { 
      establecerTiempo( 0, 0, 0 ); 
   }

   // constructor de Tiempo2: se proporciona hora; minuto y segundo
   // con valor predeterminado de 0
   public Tiempo2( int h ) 
   { 
      establecerTiempo( h, 0, 0 ); 
   }

   // constructor de Tiempo2: se proporcionan hora y minuto; segundo
   // con valor predeterminado de 0
   public Tiempo2( int h, int m ) 
   { 
      establecerTiempo( h, m, 0 ); 
   }

   // constructor de Tiempo2: se proporcionan hora, minuto y segundo
   public Tiempo2( int h, int m, int s ) 
   { 
      establecerTiempo( h, m, s ); 
   }

   // constructor de Tiempo2: se proporciona otro objeto Tiempo3
   public Tiempo2( Tiempo2 tiempo )
   {
      establecerTiempo( tiempo.obtenerHora(), tiempo.obtenerMinuto(),
         tiempo.obtenerSegundo() );
   }

   // Métodos establecer
   // Establecer un nuevo valor para tiempo, utilizando la hora universal. Realizar 
   // comprobaciones de validez en los datos. Establecer valores inválidos en cero
   public void establecerTiempo( int h, int m, int s )
   {
      establecerHora( h );    // establecer la hora
      establecerMinuto( m );  // establecer el minuto
      establecerSegundo( s );  // establecer el segundo
   }

   // validar y establecer hora 
   public void establecerHora( int h ) 
   { 
      hora = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   }

   // validar y establecer minuto 
   public void establecerMinuto( int m ) 
   { 
      minuto = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   }

   // validar y establecer segundo 
   public void establecerSegundo( int s ) 
   { 
      segundo = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   }

   // Métodos obtener
   // obtener valor de hora
   public int obtenerHora() 
   { 
      return hora; 
   }

   // obtener valor de minuto
   public int obtenerMinuto() 
   { 
      return minuto; 
   }

   // obtener valor de segundo
   public int obtenerSegundo() 
   { 
      return segundo; 
   }

   // convertir a objeto String en formato de hora universal
   public String toString()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );

      return dosDigitos.format( obtenerHora() ) + ":" +
         dosDigitos.format( obtenerMinuto() ) + ":" +
         dosDigitos.format( obtenerSegundo() );
   }

}  // fin de la clase Tiempo2

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
 