// Fig. 14.8: DemoSlider.java
// Uso de objetos JSlider para ajustar el tamaño de un óvalo.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DemoSlider extends JFrame {
   private JSlider sliderDiametro;
   private PanelOvalo miPanel;

   // configurar GUI
   public DemoSlider() 
   {
      super( "Demostración de JSlider" );

      // establecer PanelOvalo
      miPanel = new PanelOvalo();
      miPanel.setBackground( Color.YELLOW );

      // establecer objeto JSlider para controlar el valor del diámetro
      sliderDiametro = 
         new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
      sliderDiametro.setMajorTickSpacing( 10 );
      sliderDiametro.setPaintTicks( true );

      // registrar componente de escucha de eventos de JSlider
      sliderDiametro.addChangeListener(

         new ChangeListener() {  // clase interna anónima

            // manejar cambio en el valor del control deslizable
            public void stateChanged( ChangeEvent e )
            {
               miPanel.establecerDiametro( sliderDiametro.getValue() );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addChangeListener

      // adjuntar componentes al panel de contenido
      Container contenedor = getContentPane();
      contenedor.add( sliderDiametro, BorderLayout.SOUTH );
      contenedor.add( miPanel, BorderLayout.CENTER );

      setSize( 220, 270 );
      setVisible( true );

   } // fin del constructor de DemoSlider

   public static void main( String args[] )
   {
      DemoSlider aplicacion = new DemoSlider();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoSlider

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