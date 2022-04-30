// Fig. 8.9: Fecha.java 
// Declaración de la clase Fecha.

public class Fecha {
   private int mes;  // 1-12
   private int dia;    // 1-31 con base en el mes
   private int anio;   // cualquier año

   // constructor: llama a comprobarMes para confirmar el valor apropiado de mes; 
   // llama a comprobarDia para confirmar el valor apropiado de dia
   public Fecha( int elMes, int elDia, int elAnio )
   {
      mes = comprobarMes( elMes ); // validar mes
      anio = elAnio;                 // podría validar anio
      dia = comprobarDia( elDia );       // validar dia

      System.out.println( "Constructor de objeto Fecha para la fecha " + 
         aStringFecha() );

   } // fin del constructor de Fecha

   // método utilitario para confirmar el valor apropiado del mes
   private int comprobarMes( int mesPrueba )
   {
      if ( mesPrueba > 0 && mesPrueba <= 12 )  // validar mes
         return mesPrueba;

      else { // mes es inválido
         System.out.println( "Mes inválido (" + mesPrueba + 
            ") se establece en 1." );
         return 1;  // mantener el objeto en estado consistente
      }

   } // fin del método comprobarMes

   // método utilitario para confirmar valor apropiado de dia, con base en mes y anio
   private int comprobarDia( int diaPrueba )
   {
      int diasPorMes[] = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
      // comprobar si el dia está dentro del rango del mes
      if ( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
         return diaPrueba;
   
      // comprobar si es año bisiesto
      if ( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || 
           ( anio % 4 == 0 && anio % 100 != 0 ) ) )
         return diaPrueba;
   
      System.out.println( "Día inválido (" + diaPrueba + ") se establece en 1." );
   
      return 1;  // mantener el objeto en estado consistente

   } // fin del método comprobarDia
   
   // devolver un String de la forma mes/día/año
   public String aStringFecha()
   { 
      return mes + "/" + dia + "/" + anio; 
   }

} // fin de la clase Fecha


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
