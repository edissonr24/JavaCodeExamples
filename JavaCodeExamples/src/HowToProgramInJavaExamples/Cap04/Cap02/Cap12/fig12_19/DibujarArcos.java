// Fig. 12.19: DibujarArcos.java
// Dibujo de arcos.
import java.awt.*;
import javax.swing.*;

public class DibujarArcos extends JFrame {

   // establecer cadena de barra de título y dimensiones de la ventana
   public DibujarArcos()
   {
      super( "Dibujo de arcos" );

      setSize( 300, 170 );
      setVisible( true );
   }

   // dibujar rectángulos y arcos
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint de la superclase

      // empezar en 0 y extenderse hasta 360 grados
      g.setColor( Color.YELLOW );
      g.drawRect( 15, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 15, 35, 80, 80, 0, 360 );

      // empezar en 0 y extenderse hasta 110 grados
      g.setColor( Color.YELLOW );
      g.drawRect( 100, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 100, 35, 80, 80, 0, 110 );

      // empezar en 0 y extenderse hasta -270 grados
      g.setColor( Color.YELLOW );
      g.drawRect( 185, 35, 80, 80 );
      g.setColor( Color.BLACK );
      g.drawArc( 185, 35, 80, 80, 0, -270 );

      // empezar en 0 y extenderse hasta 360 grados
      g.fillArc( 15, 120, 80, 40, 0, 360 );

      // empezar en 0 y extenderse hasta -90 grados
      g.fillArc( 100, 120, 80, 40, 270, -90 );
                 
      // empezar en 0 y extenderse hasta -270 grados
      g.fillArc( 185, 120, 80, 40, 0, -270 );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      DibujarArcos aplicacion = new DibujarArcos();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DibujarArcos

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
