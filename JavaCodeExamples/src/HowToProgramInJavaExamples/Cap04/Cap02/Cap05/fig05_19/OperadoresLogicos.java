// Fig. 5.19: OperadoresLogicos.java
// Operadores lógicos.
import javax.swing.*;

public class OperadoresLogicos {

   public static void main( String args[] )
   {
      // crear JTextArea para mostrar los resultados
      JTextArea areaSalida = new JTextArea( 17, 20 );

      // adjuntar JTextArea a un JScrollPane, para desplazarse por los resultados 
      JScrollPane desplazador = new JScrollPane( areaSalida );

      // crear la tabla de verdad para el operador && (AND condicional)
      String salida = "AND condicional (&&)" +  
         "\nfalse && false: " + ( false && false ) +
         "\nfalse && true: " + ( false && true ) +
         "\ntrue && false: " + ( true && false ) +
         "\ntrue && true: " + ( true && true );

      // crear la tabla de verdad para el operador || (OR condicional)
      salida += "\n\nOR condicional (||)" +
         "\nfalse || false: " + ( false || false ) +
         "\nfalse || true: " + ( false || true ) +
         "\ntrue || false: " + ( true || false ) +
         "\ntrue || true: " + ( true || true );

      // crear la tabla de verdad para el operador & (AND lógico booleano)
      salida += "\n\nAND lógico booleano (&)" +
         "\nfalse & false: " + ( false & false ) +
         "\nfalse & true: " + ( false & true ) +
         "\ntrue & false: " + ( true & false ) +
         "\ntrue & true: " + ( true & true );

      // crear la tabla de verdad para el operador | (OR inclusivo lógico booleano)
      salida += "\n\nOR inclusive lógico booleano (|)" +
         "\nfalse | false: " + ( false | false ) +
         "\nfalse | true: " + ( false | true ) +
         "\ntrue | false: " + ( true | false ) +
         "\ntrue | true: " + ( true | true );

      // crear la tabla de verdad para el operador ^ (OR exclusivo lógico booleano)
      salida += "\n\nOR exclusivo lógico booleano (^)" +
         "\nfalse ^ false: " + ( false ^ false ) +
         "\nfalse ^ true: " + ( false ^ true ) +
         "\ntrue ^ false: " + ( true ^ false ) +
         "\ntrue ^ true: " + ( true ^ true );

      // crear la tabla de verdad para el operador ! (negación lógica)
      salida += "\n\nNOT lógico (!)" +
         "\n!false: " + ( !false ) + 
         "\n!true: " + ( !true );

      areaSalida.setText( salida );  // colocar los resultados en el objeto JTextArea

      JOptionPane.showMessageDialog( null, desplazador,
         "Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicación

   } // fin de main

} // fin de la clase OperadoresLogicos


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
