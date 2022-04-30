// Fig. 8.5: Tiempo2.java
// Declaración de la clase Tiempo2 con constructores sobrecargados.  
import java.text.DecimalFormat;  

public class Tiempo2 {
   private int hora;    // 0 - 23
   private int minuto;  // 0 - 59
   private int segundo;  // 0 - 59

   // El constructor de Tiempo2 inicializa cada variable de instancia en cero;
   // asegura que el objeto Tiempo2 empiece en un estado consistente
   public Tiempo2() 
   { 
      this( 0, 0, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   }

   // Constructor de Tiempo2: se proporciona hora; minuto y segundo con valor predeterminado de 0
   public Tiempo2( int h ) 
   { 
      this( h, 0, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   }

   // Constructor de Tiempo2: se proporcionan hora y minuto; segundo con valor predeterminado de 0
   public Tiempo2( int h, int m ) 
   { 
      this( h, m, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   }

   // Constructor de Tiempo2: se proporcionan hora, minuto y segundo
   public Tiempo2( int h, int m, int s ) 
   { 
      establecerHora( h, m, s ); // invoca a establecerHora para validar la hora
   }

   // Constructor de Tiempo2: se proporciona otro objeto Tiempo2
   public Tiempo2( Tiempo2 tiempo )
   {
      // invocar al constructor de Tiempo2 con tres argumentos
      this( tiempo.hora, tiempo.minuto, tiempo.segundo );
   }

   // establecer un nuevo valor de hora, utilizando la hora universal; realizar 
   // comprobaciones de validez en los datos; establecer valores inválidos en cero
   public void establecerHora( int h, int m, int s )
   {
      hora = ( ( h >= 0 && h < 24 ) ? h : 0 );
      minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
      segundo = ( ( s >= 0 && s < 60 ) ? s : 0 );
   }

   // convertir a String en formato de hora universal
   public String aStringUniversal()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );

      return dosDigitos.format( hora ) + ":" +
         dosDigitos.format( minuto ) + ":" + dosDigitos.format( segundo );
   }

   // convertir a String en formato de hora estándar
   public String aStringEstandar()
   {
      DecimalFormat dosDigitos = new DecimalFormat( "00" );
      
      return ( (hora == 12 || hora == 0) ? 12 : hora % 12 ) + ":" + 
         dosDigitos.format( minuto ) + ":" + dosDigitos.format( segundo ) +
         ( hora < 12 ? " AM" : " PM" );
   }

} // fin de la clase Tiempo2


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
