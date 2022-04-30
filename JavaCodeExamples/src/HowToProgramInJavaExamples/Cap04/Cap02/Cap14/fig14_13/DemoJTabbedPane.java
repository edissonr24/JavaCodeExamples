// Fig. 14.13: DemoJTabbedPane.java
// Demostración de JTabbedPane.
import java.awt.*;
import javax.swing.*;

public class DemoJTabbedPane extends JFrame  {

   // configurar GUI
   public DemoJTabbedPane()
   {
      super( "Demo de JTabbedPane " );

      // crear objeto JTabbedPane 
      JTabbedPane panelConFichas = new JTabbedPane();

      // establecer pane11 y agregarlo al objeto JTabbedPane 
      JLabel etiqueta1 = new JLabel( "panel uno", SwingConstants.CENTER );
      JPanel panel1 = new JPanel();
      panel1.add( etiqueta1 ); 
      panelConFichas.addTab( "Ficha uno", null, panel1, "Primer panel" ); 
      
      // establecer panel2 y agregarlo al objeto JTabbedPane
      JLabel etiqueta2 = new JLabel( "panel dos", SwingConstants.CENTER );
      JPanel panel2 = new JPanel();
      panel2.setBackground( Color.YELLOW );
      panel2.add( etiqueta2 );
      panelConFichas.addTab( "Ficha dos", null, panel2, "Segundo panel" ); 

      // establecer panel3 y agregarlo al objeto JTabbedPane
      JLabel etiqueta3 = new JLabel( "panel tres" );
      JPanel panel3 = new JPanel();
      panel3.setLayout( new BorderLayout() );  
      panel3.add( new JButton( "Norte" ), BorderLayout.NORTH );
      panel3.add( new JButton( "Oeste" ), BorderLayout.WEST );
      panel3.add( new JButton( "Este" ), BorderLayout.EAST );
      panel3.add( new JButton( "Sur" ), BorderLayout.SOUTH );
      panel3.add( etiqueta3, BorderLayout.CENTER );
      panelConFichas.addTab( "Ficha tres", null, panel3, "Tercer panel" );

      // agregar objeto JTabbedPane al contenedor
      getContentPane().add( panelConFichas );

      setSize( 250, 200 );
      setVisible( true );

   } // fin del constructor

   public static void main( String args[] )
   {
      DemoJTabbedPane demoPanelConFichas = new DemoJTabbedPane();
      demoPanelConFichas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoJTabbedPane

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
