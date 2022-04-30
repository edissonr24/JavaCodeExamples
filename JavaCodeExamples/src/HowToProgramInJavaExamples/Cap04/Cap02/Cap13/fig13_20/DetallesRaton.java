// Fig. 13.20: DetallesRaton.java
// Demostración de los clics de ratón y cómo diferenciar entre los botones del ratón.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DetallesRaton extends JFrame {
   private int xPos, yPos;

   // establecer cadena barra título; registrar escucha ratón; ajustar tamaño y mostrar ventana
   public DetallesRaton()
   {
      super( "Clics y botones del ratón" );

      addMouseListener( new ManejadorClicsRaton() ); 

      setSize( 350, 150 );
      setVisible( true );
   }

   // dibujar objeto String en la ubicación donde se hizo clic con el ratón
   public void paint( Graphics g )
   {
      // llamar al método paint de la superclase
      super.paint( g );

      g.drawString( "Se hizo clic en: [" + xPos + ", " + yPos + "]", 
         xPos, yPos );
   }

   public static void main( String args[] )
   {
      DetallesRaton aplicacion = new DetallesRaton();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // clase interna para manejar eventos de ratón
   private class ManejadorClicsRaton extends MouseAdapter {

      // manejar evento de clic del ratón y determinar cuál botón se oprimió
      public void mouseClicked( MouseEvent evento )
      {
         xPos = evento.getX();
         yPos = evento.getY();

         String titulo = "Se hizo clic " + evento.getClickCount() + " Veces";
      
         if ( evento.isMetaDown() )  // botón derecho del ratón 
            titulo += " con el botón derecho del ratón";
      
         else if ( evento.isAltDown() )  // botón de en medio del ratón
            titulo += " con el botón central del ratón";
      
         else  // botón izquierdo del ratón                       
            titulo += " con el botón izquierdo del ratón";

         setTitle( titulo );  // establecer barra de título de la ventana
         repaint();

      } // fin del método mouseClicked

   } // fin de la clase interna privada ManejadorClicsRaton

} // fin de la clase DetallesRaton


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
