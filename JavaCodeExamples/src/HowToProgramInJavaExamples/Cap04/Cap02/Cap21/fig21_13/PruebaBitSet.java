// Fig. 21.13: PruebaBitSet.java
// Uso de un objeto BitSet para demostrar la Criba de Eratóstenes.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PruebaBitSet extends JFrame {
   private BitSet criba;
   private JLabel etiquetaEstado;
   private JTextField campoEntrada;

   // configurar GUI
   public PruebaBitSet()
   {
      super( "Objetos BitSet" );

      criba = new BitSet( 1024 );

      Container contenedor = getContentPane();

      etiquetaEstado = new JLabel( "" );
      contenedor.add( etiquetaEstado, BorderLayout.SOUTH );

      JPanel panelEntrada = new JPanel();
      panelEntrada.add( new JLabel( "Escriba un valor entre 2 y 1023" ) );

      // campo de texto para que el usuario introduzca un valor entre 2 y 1023
      campoEntrada = new JTextField( 10 );
      panelEntrada.add( campoEntrada );
      contenedor.add( panelEntrada, BorderLayout.NORTH );

      campoEntrada.addActionListener(

         new ActionListener() { // clase interna

            // determinar si valor es número primo
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( campoEntrada.getText() );

               if ( criba.get( valor ) )
                  etiquetaEstado.setText( valor + " es un número primo" );

               else
                  etiquetaEstado.setText( valor + " no es un número primo" );
            }

         } // fin de la clase interna

      ); // fin de la llamada a addActionListener 

      JTextArea areaPrimos = new JTextArea();

      contenedor.add( new JScrollPane( areaPrimos ), BorderLayout.CENTER );

      int tamanio = criba.size(); // establecer todos los bits entre 2 y 1023

      for ( int i = 2; i < tamanio; i++ )
         criba.set( i );

      // ejecutar el método de la Criba de Eratóstenes
      int bitFinal = ( int ) Math.sqrt( tamanio);

      for ( int i = 2; i < bitFinal; i++ ) 

         if ( criba.get( i ) ) 

            for ( int j = 2 * i; j < tamanio; j += i ) 
               criba.clear( j );

      int contador = 0; // mostrar números primos entre 2 y 1023

      for ( int i = 2; i < tamanio; i++ )

         if ( criba.get( i ) ) {
            areaPrimos.append( String.valueOf( i ) );
            areaPrimos.append( ++contador % 7 == 0 ? "\n" : "\t" );
         }

      setSize( 600, 450 );
      setVisible( true );

   } // fin del constructor

   public static void main( String args[] )
   {
      PruebaBitSet aplicacion = new PruebaBitSet();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaBitSet

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
