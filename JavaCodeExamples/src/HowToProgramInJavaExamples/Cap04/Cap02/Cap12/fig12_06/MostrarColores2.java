// Fig. 12.6: MostrarColores2.java
// Seleccionar colores con JColorChooser.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MostrarColores2 extends JFrame {
   private JButton cambiarColorBoton;
   private Color color = Color.LIGHT_GRAY;
   private Container contenedor;

   // configurar GUI
   public MostrarColores2()
   {
      super( "Uso de JColorChooser" );

      contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // configurar cambiarColorBoton y registrar su manejador de eventos
      cambiarColorBoton = new JButton( "Cambiar color" );
      cambiarColorBoton.addActionListener(

         new ActionListener() {  // clase interna anónima

            // mostrar JColorChooser cuando el usuario haga clic en el botón
            public void actionPerformed( ActionEvent evento )
            {
               color = JColorChooser.showDialog( 
                  MostrarColores2.this, "Seleccione un color", color );

               // establecer color predeterminado, si no se devuelve un color 
               if ( color == null )
                  color = Color.LIGHT_GRAY;

               // cambiar color de fondo del panel de contenido
               contenedor.setBackground( color );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener
 
      contenedor.add( cambiarColorBoton );

      setSize( 400, 130 );
      setVisible( true );

   } // fin del constructor de MostrarCOlores2

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      MostrarColores2 aplicacion = new MostrarColores2();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase MostrarColores2

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
