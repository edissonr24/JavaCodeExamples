// Fig. 18.3: LeerArchivoServidor.java
// Uso de un objeto JEditorPane para mostrar el contenido de un archivo en un servidor Web.
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class LeerArchivoServidor extends JFrame {
   private JTextField campoIntroducir;
   private JEditorPane areaContenido;

   // configurar GUI
   public LeerArchivoServidor()
   {
      super( "Navegador Web simple" );

      Container contenedor = getContentPane();

      // crear campoIntroducir y registrar su componente de escucha
      campoIntroducir = new JTextField( "Escriba aquí el URL del archivo" );
      campoIntroducir.addActionListener(
         new ActionListener() {

            // obtener el documento especificado por el usuario
            public void actionPerformed( ActionEvent evento )
            {
               obtenerLaPagina( evento.getActionCommand() );
            }

         } // fin de la clase interna

      ); // fin de la llamada a addActionListener

      contenedor.add( campoIntroducir, BorderLayout.NORTH );

      // crear areaContenido y registrar componente de escucha de evento HyperlinkEvent
      areaContenido = new JEditorPane();
      areaContenido.setEditable( false );
      areaContenido.addHyperlinkListener(
         new HyperlinkListener() {

            // si el usuario hizo clic en el hipervínculo, ir a la página especificada
            public void hyperlinkUpdate( HyperlinkEvent evento )
            {
               if ( evento.getEventType() == 
                    HyperlinkEvent.EventType.ACTIVATED )
                  obtenerLaPagina( evento.getURL().toString() );
            }

         } // fin de la clase interna

      ); // fin de la llamada a addHyperlinkListener

      contenedor.add( new JScrollPane( areaContenido ), 
         BorderLayout.CENTER );
      setSize( 400, 300 );
      setVisible( true );

   } // fin del constructor de LeerArchivoServidor

   // cargar documento
   private void obtenerLaPagina( String ubicacion )
   {
      // cargar documento y mostrar ubicación
      try {
         areaContenido.setPage( ubicacion );
         campoIntroducir.setText( ubicacion );
      }
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, 
            "Error al recuperar el URL especificado", "URL incorrecto", 
            JOptionPane.ERROR_MESSAGE );
      }

   } // fin del método obtenerLaPagina

   public static void main( String args[] )
   {
      LeerArchivoServidor aplicacion = new LeerArchivoServidor();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase LeerArchivoServidor


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
