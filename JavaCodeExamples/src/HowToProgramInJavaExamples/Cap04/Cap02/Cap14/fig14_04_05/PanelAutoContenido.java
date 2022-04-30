// Fig. 14.4: PanelAutoContenido.java
// Una clase JPanel autocontenida que maneja sus propios eventos de ratón.
package com.deitel.cpej5.cap14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelAutoContenido extends JPanel {
   private int x1, y1, x2, y2;

   // establecer manejo de eventos de ratón para PanelAutoContenido
   public PanelAutoContenido()
   {
      // establecer componente de escucha de eventos de ratón
      addMouseListener(

         new MouseAdapter() {  // clase interna anónima 

            // manejar evento de oprimir botón del ratón
            public void mousePressed( MouseEvent evento )
            {
               x1 = evento.getX();
               y1 = evento.getY();
            }

            // manejar evento de soltar botón del ratón
            public void mouseReleased( MouseEvent evento )
            {
               x2 = evento.getX();
               y2 = evento.getY();
               repaint();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addMouseListener

      // establecer componente de escucha de movimientos del ratón
      addMouseMotionListener(

         new MouseMotionAdapter() {  // clase interna anónima
 
            // manejar evento de arrastrar el ratón
            public void mouseDragged( MouseEvent evento )
            {
               x2 = evento.getX();
               y2 = evento.getY();
               repaint();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addMouseMotionListener

   } // fin del constructor de PanelAutoContenido

   // devolver anchura y altura preferidas de PanelAutoContenido
   public Dimension getPreferredSize()
   {
      return new Dimension( 150, 100 );
   }

   // pintar un óvalo en las coordenadas especificadas
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      g.drawOval( Math.min( x1, x2 ), Math.min( y1, y2 ),
         Math.abs( x1 - x2 ), Math.abs( y1 - y2 ) );
   }

} // fin de la clase PanelAutoContenido


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
