// Fig. 12.12: Metrica.java
// M�todos de FontMetrics y Graphics �tiles para obtener m�trica de tipos de letra.
import java.awt.*;
import javax.swing.*;

public class Metrica extends JFrame {

   // establecer cadena de la barra de t�tulo y dimensiones de la ventana
   public Metrica()
   {
      super( "Demostraci�n de FontMetrics" );
      
      setSize( 540, 210 );
      setVisible( true );
   }

   // mostrar m�trica del tipo de letra
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al m�todo paint de la superclase

      g.setFont( new Font( "SansSerif", Font.BOLD, 12 ) );
      FontMetrics metrica = g.getFontMetrics();
      g.drawString( "Tipo de letra actual: " + g.getFont(), 10, 40 );
      g.drawString( "Ascenso: " + metrica.getAscent(), 10, 55 );
      g.drawString( "Descenso: " + metrica.getDescent(), 10, 70 );
      g.drawString( "Altura: " + metrica.getHeight(), 10, 85 );
      g.drawString( "Interlineado: " + metrica.getLeading(), 10, 100 );

      Font font = new Font( "Serif", Font.ITALIC, 14 );
      metrica = g.getFontMetrics( font );
      g.setFont( font );
      g.drawString( "Tipo de letra actual: " + font, 10, 130 );
      g.drawString( "Ascenso: " + metrica.getAscent(), 10, 145 );
      g.drawString( "Descenso: " + metrica.getDescent(), 10, 160 );
      g.drawString( "Altura: " + metrica.getHeight(), 10, 175 );
      g.drawString( "Interlineado: " + metrica.getLeading(), 10, 190 );
   
   } // fin del m�todo paint

   // ejecutar la aplicaci�n
   public static void main( String args[] )
   {
      Metrica aplicacion = new Metrica();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase Metrica

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
