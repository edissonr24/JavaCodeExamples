// Fig. 14.5: PruebaPanelAutoContenido.java
// Creación de una subclase autocontenida de JPanel que procesa 
// sus propios eventos de ratón.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.deitel.cpej5.cap14.PanelAutoContenido;

public class PruebaPanelAutoContenido extends JFrame {
   private PanelAutoContenido miPanel;

   // configurar GUI y manejadores de eventos de movimiento del ratón p/la ventana de la aplicación
   public PruebaPanelAutoContenido()
   {
      // establecer un PanelAutoContenido
      miPanel = new PanelAutoContenido();   
      miPanel.setBackground( Color.YELLOW );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );
      contenedor.add( miPanel );

      // establecer manejo de eventos de movimiento del ratón
      addMouseMotionListener(

         new MouseMotionListener() {  // clase interna anónima

            // manejar evento de arrastrar el ratón
            public void mouseDragged( MouseEvent evento )
            {
               setTitle( "Arrastrando: x=" + evento.getX() + 
                  "; y=" + evento.getY() );
            }

            // manejar evento de mover el ratón
            public void mouseMoved( MouseEvent evento )
            {
               setTitle( "Moviendo: x=" + evento.getX() +
                  "; y=" + evento.getY() );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addMouseMotionListener

      setSize( 300, 200 );
      setVisible( true );

   } // fin del constructor de PruebaPanelAutoContenido

   public static void main( String args[] )
   {
      PruebaPanelAutoContenido aplicacion = new PruebaPanelAutoContenido();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaPanelAutoContenido

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
