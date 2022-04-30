// Fig. 7.15: ArregloDoble.java
// Ejemplo de arreglo bidimensional.
import java.awt.*;
import javax.swing.*;

public class ArregloDoble extends JApplet {
   int calificaciones[][] = { { 77, 68, 86, 73 }, 
                      { 96, 87, 89, 81 },
                      { 70, 90, 86, 81 } };

   int estudiantes, examenes;
   String salida;
   JTextArea areaSalida;

   // inicializar campos
   public void init()
   {
      estudiantes = calificaciones.length;     // n�mero de estudiantes
      examenes = calificaciones[ 0 ].length;   // n�mero de ex�menes

      // crear objeto JTextArea y adjuntarlo al subprograma
      areaSalida = new JTextArea();
      Container contenedor = getContentPane();
      contenedor.add( areaSalida );

      // crear cadena de salida
      salida = "El arreglo es:\n";
      crearCadena();

      // llamar a los m�todos minima y maxima
      salida += "\n\nCalificaci�n m�s baja: " + minima() +
         "\nCalificaci�n m�s alta: " + maxima() + "\n";

      // llamar al m�todo promedio para calcular el promedio de cada estudiante
      for ( int contador = 0; contador < estudiantes; contador++ ) 
         salida += "\nEl promedio del estudiante " + contador + " es " +
            promedio( calificaciones[ contador ] ); // pasar fila arreglo calificaciones 
      // cambiar el tipo de letra a mostrar de areaSalida
      areaSalida.setFont( new Font( "Monospaced", Font.PLAIN, 12 ) );

      // colocar la cadena salida en areaSalida
      areaSalida.setText( salida );

   } // fin del m�todo init

   // buscar calificaci�n m�nima
   public int minima()
   { 
      // suponer que el primer elemento del arreglo calificaciones es el menor
      int califBaja = calificaciones[ 0 ][ 0 ];

      // iterar a trav�s de las filas del arreglo calificaciones
      for ( int fila = 0; fila < estudiantes; fila++ ) 

         // iterar a trav�s de las columnas de la fila actual
         for ( int columna = 0; columna < examenes; columna++ ) 

            // si la calificacion es menor que califBaja, asignarla a califBaja
            if ( calificaciones[ fila ][ columna ] < califBaja )
               califBaja = calificaciones[ fila ][ columna ];

      return califBaja;  // devolver la calificaci�n m�s baja

   } // fin del m�todo minima

   // buscar calificaci�n m�xima
   public int maxima()
   { 
      // suponer que el primer elemento del arreglo calificaciones es el mayor
      int califAlta = calificaciones[ 0 ][ 0 ];

      // iterar a trav�s de las filas del arreglo calificaciones
      for ( int fila = 0; fila < estudiantes; fila++ ) 

         // iterar a trav�s de las columnas de la fila actual
         for ( int columna = 0; columna < examenes; columna++ ) 

            // si la calificaci�n es mayor que califAlta, asignarla a califAlta
            if ( calificaciones[ fila ][ columna ] > califAlta )
               califAlta = calificaciones[ fila ][ columna ];

      return califAlta;  // devolver la calificaci�n m�s alta

   } // fin del m�todo maxima

   // determinar la calificaci�n promedio para un estudiante (o conjunto de calif.)
   public double promedio( int conjuntoDeCalificaciones[] )
   {
      int total = 0;  // inicializar el total
 
      // sumar calificaciones para un estudiante
      for ( int cuenta = 0; cuenta < conjuntoDeCalificaciones.length; cuenta++ )
         total += conjuntoDeCalificaciones[ cuenta ];

      // devolver el promedio de calificaciones
      return ( double ) total / conjuntoDeCalificaciones.length;

   } // fin del m�todo promedio

   // crear cadena de salida
   public void crearCadena()
   {
      salida += "           ";  // se usa para alinear los encabezados de columnas

      // crear encabezados de columnas
      for ( int contador = 0; contador < examenes; contador++ ) 
         salida += "[" + contador + "]  ";

      // crear filas/columnas de texto que representan el arreglo calificaciones
      for ( int fila = 0; fila < estudiantes; fila++ ) {
         salida += "\ncalificaciones[" + fila + "]   ";

         for ( int columna = 0; columna < examenes; columna++ ) 
            salida += calificaciones[ fila ][ columna ] + "   ";
      }

   } // fin del m�todo crearCadena

} // fin de la clase ArregloDoble


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
