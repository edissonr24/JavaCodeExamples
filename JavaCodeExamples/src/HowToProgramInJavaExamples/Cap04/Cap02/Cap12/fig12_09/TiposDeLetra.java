// Fig. 12.9: TiposDeLetra.java
// Uso de los tipos de letra.
import java.awt.*;
import javax.swing.*;

public class TiposDeLetra extends JFrame {

   // establecer barra de título y dimensiones de la ventana
   public TiposDeLetra()
   {
      super( "Uso de los tipos de letra" );

      setSize( 450, 125 );
      setVisible( true );
   }

   // mostrar cadenas en distintos tipos de letra y colores
   public void paint( Graphics g )
   {
      // llamar al método paint de la superclase
      super.paint( g );

      // cambiar tipo de letra a Serif (Times), negrita, 12pts y dibujar una cadena 
      g.setFont( new Font( "Serif", Font.BOLD, 12 ) );
      g.drawString( "Serif 12 puntos, negrita.", 20, 50 );

      // cambiar tipo de letra a Monospaced (Courier), cursiva, 24pts y dibujar una cadena 
      g.setFont( new Font( "Monospaced", Font.ITALIC, 24 ) );
      g.drawString( "Monospaced 24 puntos, cursiva.", 20, 70 );

      // cambiar tipo de letra a SansSerif (Helvetica), simple, 14pts y dibujar una cadena 
      g.setFont( new Font( "SansSerif", Font.PLAIN, 14 ) );
      g.drawString( "SansSerif 14 puntos, simple.", 20, 90 );

      // cambiar tipo de letra a Serif (Times), negrita/cursiva, 18pts y dibujar una cadena
      g.setColor( Color.RED );
      g.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
      g.drawString( g.getFont().getName() + " " + g.getFont().getSize() +
         " puntos, negrita cursiva.", 20, 110 );

   } // fin del método paint

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      TiposDeLetra aplicacion = new TiposDeLetra();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase TiposDeLetra

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
