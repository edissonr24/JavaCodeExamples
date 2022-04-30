// Fig. 5.19: OperadoresLogicos.java
// Operadores l�gicos.
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

      // crear la tabla de verdad para el operador & (AND l�gico booleano)
      salida += "\n\nAND l�gico booleano (&)" +
         "\nfalse & false: " + ( false & false ) +
         "\nfalse & true: " + ( false & true ) +
         "\ntrue & false: " + ( true & false ) +
         "\ntrue & true: " + ( true & true );

      // crear la tabla de verdad para el operador | (OR inclusivo l�gico booleano)
      salida += "\n\nOR inclusive l�gico booleano (|)" +
         "\nfalse | false: " + ( false | false ) +
         "\nfalse | true: " + ( false | true ) +
         "\ntrue | false: " + ( true | false ) +
         "\ntrue | true: " + ( true | true );

      // crear la tabla de verdad para el operador ^ (OR exclusivo l�gico booleano)
      salida += "\n\nOR exclusivo l�gico booleano (^)" +
         "\nfalse ^ false: " + ( false ^ false ) +
         "\nfalse ^ true: " + ( false ^ true ) +
         "\ntrue ^ false: " + ( true ^ false ) +
         "\ntrue ^ true: " + ( true ^ true );

      // crear la tabla de verdad para el operador ! (negaci�n l�gica)
      salida += "\n\nNOT l�gico (!)" +
         "\n!false: " + ( !false ) + 
         "\n!true: " + ( !true );

      areaSalida.setText( salida );  // colocar los resultados en el objeto JTextArea

      JOptionPane.showMessageDialog( null, desplazador,
         "Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );  // terminar la aplicaci�n

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
