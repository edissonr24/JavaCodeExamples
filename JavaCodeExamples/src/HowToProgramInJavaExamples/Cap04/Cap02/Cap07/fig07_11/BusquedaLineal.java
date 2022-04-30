// Fig. 7.11: BusquedaLineal.java
// B�squeda lineal en un arreglo.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BusquedaLineal extends JApplet implements ActionListener {

   JLabel escribirEtiqueta, resultadoEtiqueta;
   JTextField escribirCampo, resultadoCampo;
   int arreglo[];

   // configurar GUI del subprograma
   public void init()
   {
      // obtener panel de contenido y configurar su esquema como FlowLayout
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // configurar JLabel y JTextField para la entrada del usuario
      escribirEtiqueta = new JLabel( "Escriba clave de b�squeda (entero)" );
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

      // crear arreglo y llenarlo con enteros pares de 0 a 198
      arreglo = new int[ 100 ];

      for ( int contador = 0; contador < arreglo.length; contador++ )
         arreglo[ contador ] = 2 * contador;

   } // fin del m�todo init

   // buscar en arreglo el valor clave especificado
   public int busquedaLineal( int arreglo2[], int clave ) 
   {   
      // iterar a trav�s de los elementos del arreglo
      for ( int contador = 0; contador < arreglo2.length; contador++ )

         // si el elemento del arreglo es igual al valor de la clase, devolver ubicaci�n
         if ( arreglo2[ contador ] == clave )
            return contador;

      return -1;  // clave no encontrada

   } // fin del m�todo busquedaLineal

   // obtener entrada del usuario y llamar al m�todo busquedaLineal
   public void actionPerformed( ActionEvent actionEvent )
   {
      // la entrada puede obtenerse tambi�n mediante escribirCampo.getText()
      String claveBusqueda = actionEvent.getActionCommand();

      // pasar referencia de arreglo a busquedaLineal; generalmente se pasa la referencia
      // a un arreglo a un m�todo, para buscar el objeto arreglo correspondiente
      int elemento = busquedaLineal( arreglo, Integer.parseInt( claveBusqueda ) );

      // mostrar el resultao de la b�squeda
      if ( elemento != -1 )
         resultadoCampo.setText( "Valor encontrado en el elemento " + elemento );
      else
         resultadoCampo.setText( "Valor no encontrado" );

   } // fin del m�todo actionPerformed

} // fin de la clase BusquedaLineal


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
