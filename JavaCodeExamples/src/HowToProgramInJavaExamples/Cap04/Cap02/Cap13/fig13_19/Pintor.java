// Fig. 13.19: Pintor.java
// Uso de la clase MouseMotionAdapter.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pintor extends JFrame {
   private int cuentaPuntos = 0;

   // arreglo de 1000 referencias a java.awt.Point
   private Point puntos[] = new Point[ 1000 ];  

   // configurar GUI y registrar manejador de eventos de ratón
   public Pintor()
   {
      super( "Un programa simple de dibujo" );

      // crear una etiqueta y colocarla en la parte SOUTH del esquema BorderLayout
      getContentPane().add( new JLabel( "Arrastre el ratón para dibujar" ),
         BorderLayout.SOUTH );

      addMouseMotionListener(

         new MouseMotionAdapter() {  // clase interna anónima

            // almacenar coordenadas de arrastre y llamar a repaint
            public void mouseDragged( MouseEvent evento )
            {
               if ( cuentaPuntos < puntos.length ) {
                  puntos[ cuentaPuntos ] = evento.getPoint();
                  ++cuentaPuntos;
                  repaint();
               }
            }   
        
         } // fin de la clase interna anónima

      ); // fin de la llamada a addMouseMotionListener

      setSize( 300, 150 );  
      setVisible( true );  

   } // fin del constructor de Pintor

   // dibujar óvalo en un cuadro delimitador de 4 por 4 en ubicación especificada en ventana
   public void paint( Graphics g )
   {
      super.paint( g ); // borra el área de dibujo

      for ( int i = 0; i < puntos.length && puntos[ i ] != null; i++ )
         g.fillOval( puntos[ i ].x, puntos[ i ].y, 4, 4 );
   }

   public static void main( String args[] )
   {
      Pintor aplicacion = new Pintor();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase Pintor


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