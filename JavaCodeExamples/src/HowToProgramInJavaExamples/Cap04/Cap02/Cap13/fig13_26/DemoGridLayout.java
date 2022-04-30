// Fig. 13.26: DemoGridLayout.java
// Demostración de GridLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoGridLayout extends JFrame implements ActionListener {
   private JButton botones[];
   private final String nombres[] = 
      { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
   private boolean alternar = true;
   private Container contenedor;
   private GridLayout cuadricula1, cuadricula2;

   // configurar GUI
   public DemoGridLayout()
   {
      super( "Demostración de GridLayout" );

      // establecer esquemas
      cuadricula1 = new GridLayout( 2, 3, 5, 5 );
      cuadricula2 = new GridLayout( 3, 2 );

      // obtener panel de contenido y establecer su esquema
      contenedor = getContentPane();
      contenedor.setLayout( cuadricula1 );

      // crear y agregar botones
      botones = new JButton[ nombres.length ];

      for ( int cuenta = 0; cuenta < nombres.length; cuenta++ ) {
         botones[ cuenta ] = new JButton( nombres[ cuenta ] );
         botones[ cuenta ].addActionListener( this );
         contenedor.add( botones[ cuenta ] );
      }

      setSize( 300, 150 );
      setVisible( true );

   } // fin del constructor de DemoGridLayout

   // manejar eventos de botón, alternando entre los esquemas
   public void actionPerformed( ActionEvent evento )
   { 
      if ( alternar )
         contenedor.setLayout( cuadricula2 );
      else
         contenedor.setLayout( cuadricula1 );

      alternar = !alternar;   // establecer alternar en el valor opuesto
      contenedor.validate();
   }

   public static void main( String args[] )
   {
      DemoGridLayout aplicacion = new DemoGridLayout();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } 

} // fin de la clase DemoGridLayout

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
