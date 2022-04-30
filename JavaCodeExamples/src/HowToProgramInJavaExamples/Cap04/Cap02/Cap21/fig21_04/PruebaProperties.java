// Fig. 21.4: PruebaProperties.java
// Demuestra el uso de la clase Properties del paquete java.util.
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class PruebaProperties extends JFrame {
   private JLabel etiquetaEstado;
   private Properties tabla;
   private JTextArea areaPantalla;
   private JTextField campoValor, campoNombre;

   // configurar GUI para probar la tabla Properties
   public PruebaProperties()
   {
      super( "Prueba de Properties" );

      tabla = new Properties(); // crear tabla Properties

      Container contenedor = getContentPane();

      // establecer región NORTH del esquema BorderLayout de la ventana
      JPanel subPanelNorte = new JPanel(); 

      subPanelNorte.add( new JLabel( "Valor de propiedad" ) );
      campoValor = new JTextField( 10 );
      subPanelNorte.add( campoValor );

      subPanelNorte.add( new JLabel( "Nombre de propiedad (clave)" ) );
      campoNombre = new JTextField( 10 );
      subPanelNorte.add( campoNombre );

      JPanel northPanel = new JPanel();
      northPanel.setLayout( new BorderLayout() );
      northPanel.add( subPanelNorte, BorderLayout.NORTH );

      etiquetaEstado = new JLabel();
      northPanel.add( etiquetaEstado, BorderLayout.SOUTH );

      contenedor.add( northPanel, BorderLayout.NORTH );

      // establecer región CENTER del esquema BorderLayout de la ventana
      areaPantalla = new JTextArea( 4, 35 );     
      contenedor.add( new JScrollPane( areaPantalla ),
         BorderLayout.CENTER );

      // establecer región SOUTH del esquema BorderLayout de la ventana
      JPanel southPanel = new JPanel();
      southPanel.setLayout( new GridLayout( 1, 5 ) );

      // boton para colocar un nuevo par nombre-valor en la tabla Properties
      JButton botonColocar = new JButton( "Colocar" );
      southPanel.add( botonColocar );

      botonColocar.addActionListener(

         new ActionListener() { // clase interna anónima

            // colocar par nombre-valor en la tabla Properties
            public void actionPerformed( ActionEvent evento )
            {
               Object valor = tabla.setProperty(  
                  campoNombre.getText(), campoValor.getText() );

               if ( valor == null )
                  showstatus( "Colocar: " + campoNombre.getText() +
                     " " + campoValor.getText() );

               else
                  showstatus( "Colocar: " + campoNombre.getText() + " " + 
                     campoValor.getText() + "; Sustituye a: " + valor );

               listarPropiedades();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para vaciar el contenido de la tabla Properties
      JButton botonBorrar = new JButton( "Borrar" );
      southPanel.add( botonBorrar );

      botonBorrar.addActionListener(

         new ActionListener() { // clase interna anónima

            // usar el método clear para vaciar la tabla
            public void actionPerformed( ActionEvent evento )
            {
               tabla.clear();
               showstatus( "Se borró la tabla en memoria" );
               listarPropiedades();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para obtener el valor de una propiedad
      JButton botonObtenerPropiedad = new JButton( "Obtener propiedad" );
      southPanel.add( botonObtenerPropiedad );

      botonObtenerPropiedad.addActionListener(

         new ActionListener() { // clase interna anónima

            // usar método getProperty para obtener el valor de una propiedad
            public void actionPerformed( ActionEvent evento )
            {
               Object valor = tabla.getProperty( 
                  campoNombre.getText() );
             
               if ( valor != null )
                  showstatus( "Obtener propiedad: " + campoNombre.getText() + 
                     " " + valor.toString() );

               else
                  showstatus( "Obtener: " + campoNombre.getText() + 
                     " no se encuentra en la tabla" );

               listarPropiedades();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para guardar el contenido de la tabla Properties en un archivo
      JButton botonGuardar = new JButton( "Guardar" );
      southPanel.add( botonGuardar );

      botonGuardar.addActionListener(

         new ActionListener() { // clase interna anónima

            // usar el método save para colocar el contenido en un archivo
            public void actionPerformed( ActionEvent evento )
            {
               // guardar el contenido de la tabla
               try {
                  FileOutputStream salida =
                     new FileOutputStream( "props.dat" );
                  
                  tabla.store( salida, "Propiedades de ejemplo" );
                  salida.close();

                  listarPropiedades();
               }
           
               // procesar problemas con la salida al archivo
               catch( IOException excepcionES ) {
                  excepcionES.printStackTrace();
               }
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para cargar el contenido de la tabla Properties desde un archivo
      JButton botonCargar = new JButton( "Cargar" );
      southPanel.add( botonCargar );

      botonCargar.addActionListener(

         new ActionListener() { // clase interna anónima

            // usar el método load para leer el contenido del archivo
            public void actionPerformed( ActionEvent evento )
            {
               // cargar el contenido de la tabla
               try {
                  FileInputStream entrada = 
                     new FileInputStream( "props.dat" );
                  
                  tabla.load( entrada );
                  entrada.close();
                  listarPropiedades();
               }
           
               // procesar problemas con la entrada del archivo
               catch( IOException excepcionES ) {
                  excepcionES.printStackTrace();
               }
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      contenedor.add( southPanel, BorderLayout.SOUTH );

      setSize( 550, 225 );
      setVisible( true );

   } // fin del constructor

   // mostrar valores de las propiedades
   public void listarPropiedades()
   {
      StringBuffer bufer = new StringBuffer();
      String name, valor;

      Enumeration enumeracion = tabla.propertyNames();

      while ( enumeracion.hasMoreElements() ) {
         name = enumeracion.nextElement().toString();
         valor = tabla.getProperty( name );

         bufer.append( name ).append( '\t' );
         bufer.append( valor ).append( '\n' );
      }

      areaPantalla.setText( bufer.toString() );
   }

   // mostrar objeto String en la etiqueta etiquetaEstado
   public void showstatus( String s )
   {
      etiquetaEstado.setText( s );
   }

   public static void main( String args[] )
   {
      PruebaProperties aplicacion = new PruebaProperties();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaProperties

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
