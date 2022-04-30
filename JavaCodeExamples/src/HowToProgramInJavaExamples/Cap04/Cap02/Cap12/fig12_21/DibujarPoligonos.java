// Fig. 12.21: DibujarPoligonos.java
// Dibujo de polígonos.
import java.awt.*;
import javax.swing.*;

public class DibujarPoligonos extends JFrame {

   // establecer cadena de barra de título y dimensiones de la ventana
   public DibujarPoligonos()
   {
      super( "Dibujo de polígonos" );

      setSize( 275, 230 );
      setVisible( true );
   }

   // dibujar polígonos y polilíneas
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint de la superclase

      int valoresX[] = { 20, 40, 50, 30, 20, 15 };
      int valoresY[] = { 50, 50, 60, 80, 80, 60 };
      Polygon poligono1 = new Polygon( valoresX, valoresY, 6 );

      g.drawPolygon( poligono1 );

      int valoresX2[] = { 70, 90, 100, 80, 70, 65, 60 };
      int valoresY2[] = { 100, 100, 110, 110, 130, 110, 90 };

      g.drawPolyline( valoresX2, valoresY2, 7 );

      int valoresX3[] = { 120, 140, 150, 190 };
      int valoresY3[] = { 40, 70, 80, 60 };

      g.fillPolygon( valoresX3, valoresY3, 4 );

      Polygon poligono2 = new Polygon();
      poligono2.addPoint( 165, 135 );
      poligono2.addPoint( 175, 150 );
      poligono2.addPoint( 270, 200 );
      poligono2.addPoint( 200, 220 );
      poligono2.addPoint( 130, 180 );

      g.fillPolygon( poligono2 );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      DibujarPoligonos aplicacion = new DibujarPoligonos();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DibujarPoligonos

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
