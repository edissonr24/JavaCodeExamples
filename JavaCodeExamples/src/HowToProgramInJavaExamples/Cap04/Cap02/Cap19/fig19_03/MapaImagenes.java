// Fig. 19.3: MapaImagenes.java
// Demostraci�n de un mapa de im�genes.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MapaImagenes extends JApplet {
   private ImageIcon imagenMapa;

   private static final String leyendas[] = { "Error com�n de programaci�n",
      "Buena pr�ctica de programaci�n", "Observaci�n de apariencia visual", 
      "Tip de rendimiento", "Tip de portabilidad", 
      "Observaci�n de ingenier�a de software", "Tip para prevenir errores" };

   // establecer componentes de escucha del rat�n
   public void init()
   {
      addMouseListener(

         new MouseAdapter() { // clase interna an�nima

            // indicar cuando el puntero del rat�n salga del �rea del subprograma
            public void mouseExited( MouseEvent evento )
            {
               showStatus( "Puntero fuera del subprograma" );
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addMouseListener

      addMouseMotionListener(

         new MouseMotionAdapter() { // clase interna an�nima

            // determinar el icono sobre el cual aparecer� el rat�n
            public void mouseMoved( MouseEvent evento )
            {
               showStatus( traducirPosicion(
                  evento.getX(), evento.getY() ) );
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addMouseMotionListener

      imagenMapa = new ImageIcon( "iconos.png" );  // obtener la imagen

   }  // fin del m�todo init

   // mostrar imagenMapa
   public void paint( Graphics g )
   {
      super.paint( g );
      imagenMapa.paintIcon( this, g, 0, 0 );
   }

   // devolver leyenda del tip correspondiente, con base en las coordenadas del rat�n
   public String traducirPosicion( int x, int y )
   {
      // si las coordenadas est�n fuera de la imagen, regresar inmediatamente
      if ( x >= imagenMapa.getIconWidth() || y >= imagenMapa.getIconHeight() ) 
         return "";

      // determinar n�mero de icono (0 - 6)
      int anchuraIcono = imagenMapa.getIconWidth() / 7;
      int numeroIcono = x / anchuraIcono;

      return leyendas[ numeroIcono ]; // devolver la leyenda del icono apropiado
   }

} // fin de la clase MapaImagenes

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
