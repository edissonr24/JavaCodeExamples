// Fig. 13.4: PruebaEtiqueta.java
// Demostración de la clase JLabel.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEtiqueta extends JFrame {
   private JLabel etiqueta1, etiqueta2, etiqueta3;

   // configurar GUI
   public PruebaEtiqueta()
   {
      super( "Prueba de JLabel" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // constructor de JLabel con un argumento cadena
      etiqueta1 = new JLabel( "Etiqueta con texto" );
      etiqueta1.setToolTipText( "Esta es la etiqueta1" );
      contenedor.add( etiqueta1 );

      // constructor de JLabel con argumentos cadena, Icono y alineación
      Icon insecto = new ImageIcon( "insecto1.gif" );
      etiqueta2 = new JLabel( "Etiqueta con texto e icono", insecto, 
         SwingConstants.LEFT );
      etiqueta2.setToolTipText( "Esta es la etiqueta2" );
      contenedor.add( etiqueta2 );

      // constructor de JLabel sin argumentos
      etiqueta3 = new JLabel();
      etiqueta3.setText( "Etiqueta con icono y texto en parte inferior" );
      etiqueta3.setIcon( insecto );
      etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
      etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
      etiqueta3.setToolTipText( "Esta es la etiqueta3" );
      contenedor.add( etiqueta3 );

      setSize( 275, 170 );
      setVisible( true );

   } // fin del constructor

   public static void main( String args[] )
   { 
      PruebaEtiqueta aplicacion = new PruebaEtiqueta();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaEtiqueta


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
