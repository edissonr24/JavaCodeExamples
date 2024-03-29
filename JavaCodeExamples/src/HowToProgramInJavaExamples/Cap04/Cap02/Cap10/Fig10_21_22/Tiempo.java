// Fig. 10.21: Tiempo.java
// Declaraci�n de la clase Tiempo con m�todos establecer y obtener.
import java.text.DecimalFormat;  

public class Tiempo {
   private int hora;     // 0 - 23
   private int minuto;   // 0 - 59
   private int segundo;   // 0 - 59

   // un objeto de formato para compartir en toString y aStringUniversal
   private static DecimalFormat dosDigitos = new DecimalFormat( "00" );

   // el constructor de Tiempo inicializa cada variable de instancia en cero;
   // se asegura que cada objeto Tiempo inicie en un estado consistente
   public Tiempo() 
   { 
      this( 0, 0, 0 ); // invocar al constructor de Tiempo con tres argumentos
   }

   // constructor de Tiempo: se proporciona hora; minuto y segundo con valor predeterminado de 0
   public Tiempo( int h ) 
   { 
      this( h, 0, 0 ); // invocar al constructor de Tiempo con tres argumentos
   }

   // constructor de Tiempo: se proporcionan hora y minuto, segundo con valor predeterminado de 0
   public Tiempo( int h, int m ) 
   { 
      this( h, m, 0 ); // invocar al constructor de Tiempo con tres argumentos
   }

   // constructor de Tiempo: se proporcionan hora, minuto y segundo
   public Tiempo( int h, int m, int s ) 
   { 
      establecerTiempo( h, m, s ); 
   }

   // constructor de Tiempo: se suministra otro objeto Tiempo3
   public Tiempo( Tiempo tiempo )
   {
      // invocar al constructor de Tiempo con tres argumentos
      this( tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo() );
   }

   // M�todos Establecer
   // establecer un nuevo valor de tiempo, utilizando la hora universal; realizar 
   // comprobaciones de validez en los datos; establecer valores inv�lidos en cero
   public void establecerTiempo( int h, int m, int s )
   {
      establecerHora( h );   // establecer la hora
      establecerMinuto( m ); // establecer el minuto
      establecerSegundo( s ); // establecer el segundo
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

   // M�todos Obtener
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

   // convertir a String en formato de hora universal
   public String aStringUniversal()
   {
      return dosDigitos.format( obtenerHora() ) + ":" +
         dosDigitos.format( obtenerMinuto() ) + ":" +
         dosDigitos.format( obtenerSegundo() );
   }

   // convertir a String en formato de hora est�ndar
   public String toString()
   {
      return ( ( obtenerHora() == 12 || obtenerHora() == 0 ) ? 
         12 : obtenerHora() % 12 ) + ":" + dosDigitos.format( obtenerMinuto() ) +
         ":" + dosDigitos.format( obtenerSegundo() ) + 
         ( obtenerHora() < 12 ? " AM" : " PM" );
   }

} // fin de la clase Tiempo


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
