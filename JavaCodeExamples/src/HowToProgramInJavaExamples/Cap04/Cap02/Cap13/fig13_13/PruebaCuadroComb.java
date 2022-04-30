// Fig. 13.13: PruebaCuadroComb.java
// Uso de un objeto JComboBox para seleccionar una imagen a mostrar.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaCuadroComb extends JFrame {
   private JComboBox cuadroCombImagenes;
   private JLabel etiqueta;

   private String nombres[] = 
      { "insecto1.gif", "insecto2.gif",  "insectoviaje.gif", "insectanim.gif" };
   private Icon iconos[] = { new ImageIcon( nombres[ 0 ] ),
      new ImageIcon( nombres[ 1 ] ), new ImageIcon( nombres[ 2 ] ),
      new ImageIcon( nombres[ 3 ] ) };

   // configurar GUI
   public PruebaCuadroComb()
   {
      super( "Prueba de JComboBox" );
    
      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );      

      // establecer objeto JComboBox y registrar su manejador de eventos
      cuadroCombImagenes = new JComboBox( nombres );
      cuadroCombImagenes.setMaximumRowCount( 3 );
      cuadroCombImagenes.addItemListener(

         new ItemListener() {  // clase interna anónima 

            // manejar evento para JComboBox
            public void itemStateChanged( ItemEvent evento )
            {
               // determinar si la casilla de verificación está seleccionada
			   if ( evento.getStateChange() == ItemEvent.SELECTED )
                  etiqueta.setIcon( iconos[ 
                     cuadroCombImagenes.getSelectedIndex() ] );
            }

         }  // fin de la clase interna anónima

      ); // fin de la llamada a addItemListener

      contenedor.add( cuadroCombImagenes );

      // establecer objeto JLabel para mostrar objetos ImageIcon
      etiqueta = new JLabel( iconos[ 0 ] );
      contenedor.add( etiqueta );

      setSize( 350, 150 );
      setVisible( true );

   } // fin del constructor de PruebaCuadroComb

   public static void main( String args[] )
   { 
      PruebaCuadroComb aplicacion = new PruebaCuadroComb();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaCuadroComb


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
