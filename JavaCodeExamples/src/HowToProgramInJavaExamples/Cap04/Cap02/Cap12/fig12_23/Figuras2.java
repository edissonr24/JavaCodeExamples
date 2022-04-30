// Fig. 12.23: Figuras2.java
// Demostración de una ruta general.
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Figuras2 extends JFrame {

   // establecer cadena de barra de título, color de fondo y dimensiones de la ventana
   public Figuras2()
   {
      super( "Dibujo de figuras 2D" );

      getContentPane().setBackground( Color.WHITE );
      setSize( 400, 400 );
      setVisible( true );
   }

   // dibujar rutas generales
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint de la superclase

      int puntosX[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
      int puntosY[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

      Graphics2D g2d = ( Graphics2D ) g;
      GeneralPath estrella = new GeneralPath();  // crear objeto GeneralPath

      // establecer la coordenada inicial de la ruta general
      estrella.moveTo( puntosX[ 0 ], puntosY[ 0 ] );

      // crear la estrella--esto no la dibuja
      for ( int cuenta = 1; cuenta < puntosX.length; cuenta++ )
         estrella.lineTo( puntosX[ cuenta ], puntosY[ cuenta ] );

      estrella.closePath();  // cerrar la figura

      g2d.translate( 200, 200 );  // trasladar el origen a (200, 200)

      // girar alrededor del origen y dibujar estrellas en colores aleatorios
      for ( int cuenta = 1; cuenta <= 20; cuenta++ ) {
         g2d.rotate( Math.PI / 10.0 );  // girar el sistema de coordenadas

         // establecer color de dibujo al azar
         g2d.setColor( new Color( ( int ) ( Math.random() * 256 ),
            ( int ) ( Math.random() * 256 ),              
            ( int ) ( Math.random() * 256 ) ) );

         g2d.fill( estrella );  // dibujar estrella rellena
      }

   } // fin del método paint
 
   // ejecutar la aplicación
   public static void main( String args[] )
   {
      Figuras2 aplicacion = new Figuras2();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
  
} // fin de la clase Figuras2

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
