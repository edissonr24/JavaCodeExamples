// Fig. 13.20: DetallesRaton.java
// Demostraci�n de los clics de rat�n y c�mo diferenciar entre los botones del rat�n.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DetallesRaton extends JFrame {
   private int xPos, yPos;

   // establecer cadena barra t�tulo; registrar escucha rat�n; ajustar tama�o y mostrar ventana
   public DetallesRaton()
   {
      super( "Clics y botones del rat�n" );

      addMouseListener( new ManejadorClicsRaton() ); 

      setSize( 350, 150 );
      setVisible( true );
   }

   // dibujar objeto String en la ubicaci�n donde se hizo clic con el rat�n
   public void paint( Graphics g )
   {
      // llamar al m�todo paint de la superclase
      super.paint( g );

      g.drawString( "Se hizo clic en: [" + xPos + ", " + yPos + "]", 
         xPos, yPos );
   }

   public static void main( String args[] )
   {
      DetallesRaton aplicacion = new DetallesRaton();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // clase interna para manejar eventos de rat�n
   private class ManejadorClicsRaton extends MouseAdapter {

      // manejar evento de clic del rat�n y determinar cu�l bot�n se oprimi�
      public void mouseClicked( MouseEvent evento )
      {
         xPos = evento.getX();
         yPos = evento.getY();

         String titulo = "Se hizo clic " + evento.getClickCount() + " Veces";
      
         if ( evento.isMetaDown() )  // bot�n derecho del rat�n 
            titulo += " con el bot�n derecho del rat�n";
      
         else if ( evento.isAltDown() )  // bot�n de en medio del rat�n
            titulo += " con el bot�n central del rat�n";
      
         else  // bot�n izquierdo del rat�n                       
            titulo += " con el bot�n izquierdo del rat�n";

         setTitle( titulo );  // establecer barra de t�tulo de la ventana
         repaint();

      } // fin del m�todo mouseClicked

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
