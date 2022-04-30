// Fig. 18.2: SelectorSitios.java
// Este programa utiliza un botón para cargar un documento a partir de un URL.
import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.AppletContext;
import javax.swing.*;
import javax.swing.event.*;

public class SelectorSitios extends JApplet {
   private HashMap sitios;    // nombres y URLs de los sitios
   private Vector nombresSitios;   // nombres de los sitios
   private JList selectorSitios;  // lista de sitios a elegir

   // leer parámetros de HTML y configurar GUI
   public void init()
   {
      // crear HashMap y Vector
      sitios = new HashMap();
      nombresSitios = new Vector();

      // obtener los parámetros del documento HTML
      obtenerSitiosDeParametrosHTML();

      // crear componentes de GUI y preparar distribución de la interfaz
      Container contenedor = getContentPane();
      contenedor.add( new JLabel( "Seleccione un sitio para navegar" ),
         BorderLayout.NORTH );

      selectorSitios = new JList( nombresSitios );
      selectorSitios.addListSelectionListener(

         new ListSelectionListener() {

            // ir al sitio que seleccionó el usuario
            public void valueChanged( ListSelectionEvent evento )
            {
               // obtener nombre del sitio seleccionado
               Object objeto = selectorSitios.getSelectedValue();

               // usar nombre del sitio para localizar URL correspondiente
               URL nuevoDocumento = ( URL ) sitios.get( objeto );

               // obtener referencia al contenedor de subprogramas
               AppletContext navegador = getAppletContext();

               // indicar al contenedor de subprogramas para cambiar de página
               navegador.showDocument( nuevoDocumento );
            }

         } // fin de la clase interna

      ); // fin de la llamada a addListSelectionListener

      contenedor.add( new JScrollPane( selectorSitios ), 
         BorderLayout.CENTER );

   } // fin del método init

   // obtener parámetros del documento HTML
   private void obtenerSitiosDeParametrosHTML()
   {
      // buscar parámetros del subprograma en documento HTML y agregarlos a HashMap
      String titulo, ubicacion;
      URL url;
      int contador = 0;

      titulo = getParameter( "titulo" + contador ); // obtener título del primer sitio

      // iterar hasta que no haya más parámetros en el documento HTML
      while ( titulo != null ) {

         // obtener ubicación del sitio
         ubicacion = getParameter( "ubicacion" + contador );
            
         // colocar titulo/URL en HashMap y titulo en Vector
         try {
            url = new URL( ubicacion ); // convertir ubicacion a URL
            sitios.put( titulo, url );   // colocar titulo/URL en HashMap
            nombresSitios.add( titulo );    // colocar titulo en Vector
         }

         // procesar formato incorrecto de URL
         catch ( MalformedURLException excepcionURL ) {
            excepcionURL.printStackTrace();
         }

         ++contador;  
         titulo = getParameter( "titulo" + contador ); // obtener título del siguiente sitio

      } // fin de instrucción while

   } // fin del método obtenerSitiosDeParametrosHTML

} // fin de la clase SelectorSitios

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
