// Fig. 13.27: DemoPanel.java
// Uso de un objeto JPanel para ayudar a distribuir los componentes.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoPanel extends JFrame {
   private JPanel panelBotones;
   private JButton botones[];

   // configurar GUI
   public DemoPanel()
   {
      super( "Demostración JPanel" );

      // obtener panel de contenido
      Container contenedor = getContentPane();

      // crear arreglo botones
      botones = new JButton[ 5 ];

      // configurar panel y establecer su esquema
      panelBotones = new JPanel();
      panelBotones.setLayout( new GridLayout( 1, botones.length ) );

      // crear y agregar botones
      for ( int cuenta = 0; cuenta < botones.length; cuenta++ ) {
         botones[ cuenta ] = new JButton( "Botón " + ( cuenta + 1 ) );
         panelBotones.add( botones[ cuenta ] );
      }

      contenedor.add( panelBotones, BorderLayout.SOUTH );

      setSize( 425, 150 );
      setVisible( true );

   } // fin del constructor de DemoPanel

   public static void main( String args[] )
   {
      DemoPanel aplicacion = new DemoPanel();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoPanel


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
