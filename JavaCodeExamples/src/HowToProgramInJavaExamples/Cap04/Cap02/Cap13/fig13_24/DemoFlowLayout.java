// Fig. 13.24: DemoFlowLayout.java
// Demostración de las alineaciones de FlowLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoFlowLayout extends JFrame {
   private JButton botonIzquierda, botonCentro, botonDerecho;
   private Container contenedor;
   private FlowLayout esquema;
   
   // configurar GUI y registrar componentes de escucha de los botones
   public DemoFlowLayout()
   {
      super( "Demostración de FlowLayout" );

      esquema = new FlowLayout();

      // obtener panel de contenido y establecer su esquema
      contenedor = getContentPane();
      contenedor.setLayout( esquema );

      // establecer objeto botonIzquierda y registrar componente de escucha
      botonIzquierda = new JButton( "Izquierda" );
      contenedor.add( botonIzquierda );
      botonIzquierda.addActionListener(

         new ActionListener() {  // clase interna anónima

            // procesar evento de botonIzquierda 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.LEFT );

               // realinear componentes adjuntos
               esquema.layoutContainer( contenedor );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      // establecer objeto botonCentro y registrar componente de escucha
      botonCentro = new JButton( "Centro" );
      contenedor.add( botonCentro );
      botonCentro.addActionListener(

         new ActionListener() {  // clase interna anónima

            // procesar evento de botonCentro 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.CENTER );

               // realinear componentes adjuntos
               esquema.layoutContainer( contenedor );
            }
         }
      );

      // establecer objeto botonDerecho y registrar componente de escucha
      botonDerecho = new JButton( "Derecha" );
      contenedor.add( botonDerecho );
      botonDerecho.addActionListener(

         new ActionListener() {  // clase interna anónima

            // procesar evento de botonDerecho 
            public void actionPerformed( ActionEvent evento )
            {
               esquema.setAlignment( FlowLayout.RIGHT );

               // realinear componentes adjuntos
               esquema.layoutContainer( contenedor );
            }
         }
      );

      setSize( 300, 75 );
      setVisible( true );

   } // fin del constructor DemoFlowLayout
  
   public static void main( String args[] )
   { 
      DemoFlowLayout aplicacion = new DemoFlowLayout();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoFlowLayout


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
