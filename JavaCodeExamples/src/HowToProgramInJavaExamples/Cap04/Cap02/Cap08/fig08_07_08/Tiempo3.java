// Fig. 8.7: Tiempo3.java
// Declaración de la clase Tiempo3 con métodos establecer y obtener.
import java.text.DecimalFormat;  

public class Tiempo3 {
   private int hora;     // 0 - 23
   private int minuto;   // 0 - 59
   private int segundo;   // 0 - 59

   // El constructor de Tiempo3 inicializa cada variable de instancia en cero;
   // asegura que el objeto Tiempo3 inicie en un estado consistente
   public Tiempo3() 
   { 
      this( 0, 0, 0 ); // invoca al constructor de Tiempo3 con tres argumentos
   }

   // Constructor de Tiempo3: se proporciona hora; minuto y segundo con valor predeterminado de 0
   public Tiempo3( int h ) 
   { 
      this( h, 0, 0 ); // invoca al constructor de Tiempo3 con tres argumentos
   }

   // Constructor de Tiempo3: se proporcionan hora y minuto; segundo con valor predeterminado de 0
   public Tiempo3( int h, int m ) 
   { 
      this( h, m, 0 ); // invoca al constructor de Tiempo3 con tres argumentos
   }

   // Constructor de Tiempo3: se proporcionan hora, minuto y segundo
   public Tiempo3( int h, int m, int s ) 
   { 
      establecerHora( h, m, s ); 
   }

   // Constructor de Tiempo3: se proporciona otro objeto Tiempo3
   public Tiempo3( Tiempo3 tiempo )
   {
      // invocar al constructor de Tiempo3 con tres argumentos
      this( tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo() );
   }

   // Métodos establecer
   // establecer un nuevo valor de hora usando hora universal; realizar 
   // comprobaciones de validez en los datos; establecer valores inválidos en cero
   public void establecerHora( int h, int m, int s )
   {
      establecerHora( h );   // establecer la hora
      establecerMinuto( m ); // establecer el minuto
      establecerSegundo( s ); // establecer el segundo
   }

   // validar y establecer la hora
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
   // obtener el valor de hora
   public int obtenerHora() 
   { 
      return hora; 
   }

   // obtener el valor de minuto
   public int obtenerMinuto() 
   { 
      return minuto; 
   }

   // obtener el valor de segundo
   public int obtenerSegundo() 
   { 
      return segundo; 
   }

   // convertir a String en formato de hora universal
   public String aStringUniversal()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );

      return dosDigitos.format( obtenerHora() ) + ":" +
         dosDigitos.format( obtenerMinuto() ) + ":" +
         dosDigitos.format( obtenerSegundo() );
   }

   // convertir a String en formato de hora estándar
   public String aStringEstandar()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );

      return ( ( obtenerHora() == 12 || obtenerHora() == 0 ) ? 
         12 : obtenerHora() % 12 ) + ":" + dosDigitos.format( obtenerMinuto() ) +
         ":" + dosDigitos.format( obtenerSegundo() ) + 
         ( obtenerHora() < 12 ? " AM" : " PM" );
   }

} // fin de la clase Tiempo3


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
