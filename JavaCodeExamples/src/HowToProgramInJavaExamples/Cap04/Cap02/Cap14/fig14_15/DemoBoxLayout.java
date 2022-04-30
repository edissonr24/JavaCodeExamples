// Fig. 14.15: DemoBoxLayout.java
// Demostración de BoxLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoBoxLayout extends JFrame {

   // configurar GUI
   public DemoBoxLayout()
   {
      super( "Demo de BoxLayout" );

      // crear contenedores Box con esquema BoxLayout
      Box horizontal1 = Box.createHorizontalBox();
      Box vertical1 = Box.createVerticalBox();
      Box horizontal2 = Box.createHorizontalBox();
      Box vertical2 = Box.createVerticalBox();

      final int TAMANIO = 3; // número de botones en cada contenedor Box

      // agregar botones al objeto Box horizontal1
      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ )
         horizontal1.add( new JButton( "Botón " + cuenta ) );

      // crear montante y agregar botones al objeto Box vertical1
      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
         vertical1.add( Box.createVerticalStrut( 25 ) );
         vertical1.add( new JButton( "Botón " + cuenta ) );
      }

      // crear pegamento horizontal y agregar botones al objeto Box horizontal2
      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
         horizontal2.add( Box.createHorizontalGlue() );
         horizontal2.add( new JButton( "Botón " + cuenta ) );
      }

      // crear área rígida y agregar botones al objeto Box vertical2
      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
         vertical2.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
         vertical2.add( new JButton( "Botón " + cuenta ) );
      }

      // crear pegamento vertical y agregar botones al panel
      JPanel panel = new JPanel();
      panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );

      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
         panel.add( Box.createGlue() );
         panel.add( new JButton( "Botón " + cuenta ) );
      }

      // crear un objeto JTabbedPane
      JTabbedPane fichas = new JTabbedPane( 
         JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT ); 

      // colocar cada contendor en panel con fichas
      fichas.addTab( "Cuadro horizontal", horizontal1 );
      fichas.addTab( "Cuadro vertical con montantes", vertical1 );
      fichas.addTab( "Cuadro horizontal con pegamento", horizontal2 );
      fichas.addTab( "Cuadro vertical con áreas rígidas", vertical2 );
      fichas.addTab( "Cuadro vertical con pegamento", panel );

      getContentPane().add( fichas );  // colocar panel con fichas en el panel de contenido

      setSize( 400, 220 );
      setVisible( true );

   } // fin del constructor

   public static void main( String args[] )
   {
      DemoBoxLayout aplicacion = new DemoBoxLayout();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoBoxLayout

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
