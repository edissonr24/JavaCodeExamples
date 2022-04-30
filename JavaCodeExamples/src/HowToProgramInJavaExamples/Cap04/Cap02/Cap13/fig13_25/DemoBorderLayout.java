// Fig. 13.25: DemoBorderLayout.java
// Demostración de BorderLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoBorderLayout extends JFrame implements ActionListener {
   private JButton botones[];
   private final String nombres[] = { "Ocultar norte", "Ocultar sur", 
      "Ocultar este", "Ocultar oeste", "Ocultar centro" };
   private BorderLayout esquema;

   // configurar GUI y el manejo de eventos
   public DemoBorderLayout()
   {
      super( "Demostración de BorderLayout" );

      esquema = new BorderLayout( 5, 5 ); // espacios libres de 5 píxeles

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( esquema );

      // instanciar objetos botón
      botones = new JButton[ nombres.length ];

      for ( int cuenta = 0; cuenta < nombres.length; cuenta++ ) {
         botones[ cuenta ] = new JButton( nombres[ cuenta ] );
         botones[ cuenta ].addActionListener( this );
      }

      // colocar botones en BorderLayout; no importa el orden
      contenedor.add( botones[ 0 ], BorderLayout.NORTH ); 
      contenedor.add( botones[ 1 ], BorderLayout.SOUTH ); 
      contenedor.add( botones[ 2 ], BorderLayout.EAST );  
      contenedor.add( botones[ 3 ], BorderLayout.WEST );  
      contenedor.add( botones[ 4 ], BorderLayout.CENTER ); 

      setSize( 350, 200 );
      setVisible( true );

   } // fin del constructor de DemoBorderLayout

   // manejar eventos de botón
   public void actionPerformed( ActionEvent evento )
   {
      for ( int cuenta = 0; cuenta < botones.length; cuenta++ )

         if ( evento.getSource() == botones[ cuenta ] )
            botones[ cuenta ].setVisible( false );
         else
            botones[ cuenta ].setVisible( true );

      // re-esquematizar el panel de contenido
      esquema.layoutContainer( getContentPane() );
   }

   public static void main( String args[] )
   { 
      DemoBorderLayout aplicacion = new DemoBorderLayout();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoBorderLayout

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
