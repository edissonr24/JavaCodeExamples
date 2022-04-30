// Fig. 7.12: BusquedaBinaria.java
// Búsqueda binaria en un arreglo.
import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;

public class BusquedaBinaria extends JApplet implements ActionListener {
   JLabel escribirEtiqueta, resultadoEtiqueta;
   JTextField escribirCampo, resultadoCampo;
   JTextArea salida;

   int arreglo[];
   String pantalla = "";

   // configurar GUI del subprograma
   public void init()
   {
      // obtener panel de contenido y configurar su esquema como FlowLayout
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // configurar JLabel y JTextField para la entrada del usuario
      escribirEtiqueta = new JLabel( "Escriba clave de búsqueda (entero)" );
      contenedor.add( escribirEtiqueta );

      escribirCampo = new JTextField( 10 );
      contenedor.add( escribirCampo );

      // registrar este subprograma para escuchar acciones de escribirCampo
      escribirCampo.addActionListener( this );

      // configurar JLabel y JTextField para mostrar los resultados
      resultadoEtiqueta = new JLabel( "Resultado" );
      contenedor.add( resultadoEtiqueta );

      resultadoCampo = new JTextField( 20 );
      resultadoCampo.setEditable( false );
      contenedor.add( resultadoCampo );

      // configurar JTextArea para mostrar datos de comparación
      salida = new JTextArea( 6, 60 );
      salida.setFont( new Font( "Monospaced", Font.PLAIN, 12 ) );
      contenedor.add( salida );

      // crear arreglo y llenarlo con enteros pares de 0 a 28
      arreglo = new int[ 15 ];

      for ( int contador = 0; contador < arreglo.length; contador++ )
         arreglo[ contador ] = 2 * contador;

   } // fin del método init

   // obtener entrada del usuario y llamar al método busquedaBinaria
   public void actionPerformed( ActionEvent actionEvent )
   {
      // la entrada también puede obtenerse mediante escribirCampo.getText()
      String claveBusqueda = actionEvent.getActionCommand();

      // inicializar cadena pantalla para la nueva búsqueda
      pantalla = "Porciones del arreglo buscadas\n";

      // realizar búsqueda binaria
      int elemento = busquedaBinaria( arreglo, Integer.parseInt( claveBusqueda ) );

      salida.setText( pantalla );

      // mostrar resultado de la búsqueda
      if ( elemento != -1 )
         resultadoCampo.setText( "Valor encontrado en el elemento " + elemento );
      else
         resultadoCampo.setText( "Valor no encontrado" );

   } // fin del método actionPerformed

   // método para realizar la búsqueda binaria en un arreglo
   public int busquedaBinaria( int arreglo2[], int clave ) 
   {
      int inferior = 0;                   // índice del elemento inferior
      int superior = arreglo2.length - 1;  // índice del elemento superior
      int medio;                    // índice del elemento medio

      // iterar hasta que el índice inferior sea mayor que el superior
      while ( inferior <= superior ) {
         medio = ( inferior + superior ) / 2;  // determinar índice medio

         // mostrar subconjunto de elementos del arreglo utilizados en esta 
         // iteración del ciclo de búsqueda binaria
         crearSalida( arreglo2, inferior, medio, superior ); 

         // si clave concuerda con elemento medio, devolver su ubicación
         if ( clave == arreglo[ medio ] )  
            return medio;

         // si clave es menor que elemento medio, establecer nuevo elemento superior
         else if ( clave < arreglo[ medio ] )
            superior = medio - 1;  

         // clave mayor que elemento medio, establecer nuevo elemento inferior
         else
            inferior = medio + 1;  
         
      } // fin de instrucción while

      return -1;   // clave no encontrada
   
   } // fin del método busquedaBinaria

   // crear fila de salida mostrando subconjunto de elementos del arreglo 
   // que se están procesando
   void crearSalida( int arreglo3[], int inferior, int medio, int superior )
   {
      // crear formato numérico entero de 2 dígitos
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      // iterar a través de los elementos del arreglo
      for ( int contador = 0; contador < arreglo3.length; contador++ ) {

         // si contador está fuera de subconjunto actual del arreglo, anexar
         // espacios de relleno al String pantalla
         if ( contador < inferior || contador > superior )
            pantalla += "    ";

         // si elemento medio, anexar elemento al String pantalla 
         // seguido de un asterisco (*), para indicar el elemento medio
         else if ( contador == medio ) 
            pantalla += twoDigits.format( arreglo3[ contador ] ) + "* ";

         else // anexar elemento al String pantalla 
            pantalla += twoDigits.format( arreglo3[ contador ] ) + "  ";

      } // fin de instrucción for 

      pantalla += "\n";
   
   } // fin del método crearSalida
   
} // fin de la clase BusquedaBinaria


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
