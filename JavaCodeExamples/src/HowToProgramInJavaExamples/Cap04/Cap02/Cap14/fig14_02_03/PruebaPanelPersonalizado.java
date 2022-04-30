// Fig. 14.3: PruebaPanelPersonalizado.java
// Uso de un objeto JPanel personalizado.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaPanelPersonalizado extends JFrame {
   private JPanel panelBotones;
   private PanelPersonalizado miPanel;
   private JButton botonCirculo, botonCuadrado;

   // configurar GUI
   public PruebaPanelPersonalizado()
   {
      super( "Prueba de PanelPersonalizado" );

      // crear área personalizada de dibujo
      miPanel = new PanelPersonalizado();   
      miPanel.setBackground( Color.GREEN );

      // establecer botonCuadrado
      botonCuadrado = new JButton( "Cuadrado" );
      botonCuadrado.addActionListener(

         new ActionListener() {  // clase interna anónima 

            // dibujar un cuadrado
            public void actionPerformed( ActionEvent evento )
            {
               miPanel.dibujar( PanelPersonalizado.CUADRADO );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      botonCirculo = new JButton( "Círculo" );
      botonCirculo.addActionListener(

         new ActionListener() {  // clase interna anónima 

            // dibujar un círculo
            public void actionPerformed( ActionEvent evento )
            {
               miPanel.dibujar( PanelPersonalizado.CIRCULO );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      // establecer panel con botones
      panelBotones = new JPanel();
      panelBotones.setLayout( new GridLayout( 1, 2 ) );
      panelBotones.add( botonCirculo );
      panelBotones.add( botonCuadrado );

      // adjuntar panel de botones y área personalizada de dibujo al panel de contenido
      Container contenedor = getContentPane();
      contenedor.add( miPanel, BorderLayout.CENTER );  
      contenedor.add( panelBotones, BorderLayout.SOUTH );

      setSize( 300, 150 );
      setVisible( true );

   } // fin del constructor PruebaPanelPersonalizado

   public static void main( String args[] )
   {
      PruebaPanelPersonalizado aplicacion = new PruebaPanelPersonalizado();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaPanelPersonalizado

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
