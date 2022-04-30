// Fig. 19.6: CargarAudioYReproducir.java
// Cargar un clip de audio y reproducirlo.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CargarAudioYReproducir extends JApplet {
   private AudioClip sonido1, sonido2, sonidoActual;  
   private JButton reproducirSonido, sonidoContinuo, detenerSonido;
   private JComboBox seleccionarSonido;

   // cargar la imagen cuando el subprograma empiece a ejecutarse
   public void init()
   {
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      String opciones[] = { "Welcome", "Hi" };
      seleccionarSonido = new JComboBox( opciones );

      seleccionarSonido.addItemListener(

         new ItemListener() {

            // detener sonido y cambiarlo por el que seleccionó el usuario
            public void itemStateChanged( ItemEvent e )
            {
               sonidoActual.stop();

               sonidoActual =
                  seleccionarSonido.getSelectedIndex() == 0 ? sonido1 : sonido2;
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada al método addItemListener

      contenedor.add( seleccionarSonido );

      // establecer botones y manejador de eventos de botón
      ButtonHandler manejador = new ButtonHandler();

      reproducirSonido = new JButton( "Reproducir" );
      reproducirSonido.addActionListener( manejador );
      contenedor.add( reproducirSonido );

      sonidoContinuo = new JButton( "Continuo" );
      sonidoContinuo.addActionListener( manejador );
      contenedor.add( sonidoContinuo );

      detenerSonido = new JButton( "Detener" );
      detenerSonido.addActionListener( manejador );
      contenedor.add( detenerSonido );

      // cargar sonidos y establecer sonidoActual
      sonido1 = getAudioClip( getDocumentBase(), "welcome.wav" );
      sonido2 = getAudioClip( getDocumentBase(), "hi.au" );
      sonidoActual = sonido1;

   } // fin del método init

   // detener el sonido cuando el usuario cambie de página Web
   public void stop()
   {
      sonidoActual.stop();
   }

   // clase interna privada para manejar eventos de botón
   private class ButtonHandler implements ActionListener {

      // procesar eventos de reproducir, sonido continuo y detener
      public void actionPerformed( ActionEvent eventoAccion )
      {
         if ( eventoAccion.getSource() == reproducirSonido ) 
            sonidoActual.play();

         else if ( eventoAccion.getSource() == sonidoContinuo ) 
            sonidoActual.loop();

         else if ( eventoAccion.getSource() == detenerSonido ) 
            sonidoActual.stop();
      }

   } // fin de la clase ButtonHandler

} // fin de la clase CargarAudioYReproducir

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
