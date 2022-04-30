// Fig. 17.8: CrearArchivoSecuencial.java
// Escribir objetos secuencialmente en un archivo, mediante la clase ObjectOutputStream.
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.deitel.cpej5.cap17.IUBanco;
import com.deitel.cpej5.cap17.RegistroCuentas;

public class CrearArchivoSecuencial extends JFrame {
   private ObjectOutputStream salida;
   private IUBanco interfazUsuario;
   private JButton botonIntro, botonAbrir;

   // configurar GUI
   public CrearArchivoSecuencial()
   {
      super( "Creación de un archivo secuencial de objetos" );

      // crear instancia de interfaz de usuario reutilizable
      interfazUsuario = new IUBanco( 4 );  // cuatro campos de texto
      getContentPane().add( interfazUsuario, BorderLayout.CENTER );
      
      // configurar botón hacerTarea1 para usarlo en este programa
      botonAbrir = interfazUsuario.obtenerBotonHacerTarea1();
      botonAbrir.setText( "Guardar en archivo ..." );

      // registrar componente de escucha para llamar a abrirArchivo cuando se oprima el botón
      botonAbrir.addActionListener(

         // clase interna anónima para manejar evento de botonAbrir
         new ActionListener() {

            // llamar a abrirArchivo cuando se oprima el botón
            public void actionPerformed( ActionEvent evento )
            {
               abrirArchivo();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      // configurar botón hacerTarea2 para usarlo en este programa
      botonIntro = interfazUsuario.obtenerBotonHacerTarea2();
      botonIntro.setText( "Introducir" );
      botonIntro.setEnabled( false );  // deshabilitar botón

      // registrar componente de escucha para llamar a agregarRegistro cuando se oprima el botón
      botonIntro.addActionListener(

         // clase interna anónima para manejar evento de botonIntro
         new ActionListener() {

            // llamar a agregarRegistro cuando se oprima el botón
            public void actionPerformed( ActionEvent evento )
            {
               agregarRegistro();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      // registrar componente de escucha de ventana para manejar evento de cierre de ventana
      addWindowListener(

         // clase interna anónima para manejar evento windowClosing
         new WindowAdapter() {

            // agregar registro actual en la GUI al archivo, después cerrar el archivo
            public void windowClosing( WindowEvent evento )
            {
               if ( salida != null )
                  agregarRegistro();

               cerrarArchivo();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addWindowListener

      setSize( 300, 200 );
      setVisible( true );

   } // fin del constructor de CrearArchivoSecuencial

   // permitir al usuario especificar el nombre del archivo
   private void abrirArchivo()
   {
      // mostrar cuadro de diálogo de archivo, para que el usuario pueda elegir el archivo a abrir
      JFileChooser selectorArchivo = new JFileChooser();
      selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
      
      int resultado = selectorArchivo.showSaveDialog( this );

      // si el usuario hizo clic en el botón Cancelar del cuadro de diálogo, regresar
      if ( resultado == JFileChooser.CANCEL_OPTION )
         return;

      File nombreArchivo = selectorArchivo.getSelectedFile(); // obtener archivo seleccionado
      
      // mostrar error si es inválido
      if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) )
         JOptionPane.showMessageDialog( this, "Nombre de archivo inválido", 
            "Nombre de archivo inválido", JOptionPane.ERROR_MESSAGE );

      else {

         // abrir archivo
         try {
            salida = new ObjectOutputStream(
               new FileOutputStream( nombreArchivo ) );

            botonAbrir.setEnabled( false );
            botonIntro.setEnabled( true );
         }

         // procesar excepciones que pueden ocurrir al abrir el archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( this, "Error al abrir el archivo", 
               "Error", JOptionPane.ERROR_MESSAGE );
         }  
         
      } // fin de instrucción else
  
   } // fin del método abrirArchivo

   // cerrar archivo y terminar la aplicación 
   private void cerrarArchivo() 
   {
      // cerrar el archivo 
      try {
         salida.close();
         System.exit( 0 );
      }

      // procesar excepciones que pueden ocurrir al cerrar el archivo 
      catch( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al cerrar el archivo", 
            "Error", JOptionPane.ERROR_MESSAGE );
         System.exit( 1 );
      }

   } // fin del método cerrarArchivo

   // agregar registro al archivo
   public void agregarRegistro()
   {
      int numeroCuenta = 0;
      RegistroCuentas registro;
      String valoresCampos[] = interfazUsuario.obtenerValoresCampos();
     
      // si el valor del campo cuenta no está vacío
      if ( ! valoresCampos[ IUBanco.CUENTA ].equals( "" ) ) {

         // escribir valores en el archivo
         try {
            numeroCuenta = Integer.parseInt(
               valoresCampos[ IUBanco.CUENTA ] );

            if ( numeroCuenta > 0 ) {

               // crear nuevo registro
               registro = new RegistroCuentas( numeroCuenta,
                  valoresCampos[ IUBanco.PRIMERNOMBRE ],
                  valoresCampos[ IUBanco.APELLIDO ],
                  Double.parseDouble( valoresCampos[ IUBanco.SALDO ] ) );

               // escribir el registro y vaciar el búfer
               salida.writeObject( registro );
               salida.flush();
            }
            else
            {
                JOptionPane.showMessageDialog( this,
                   "El número de cuenta debe ser mayor que 0",
                   "Número de cuenta incorrecto", JOptionPane.ERROR_MESSAGE );
            }

            // borrar campos de texto
            interfazUsuario.borrarCampos();

         } // fin de bloque try

         // procesar formato inválido de número de cuenta o saldo
         catch ( NumberFormatException excepcionFormato ) {
            JOptionPane.showMessageDialog( this,
               "Número de cuenta o saldo incorrecto", "Formato de número incorrecto",
               JOptionPane.ERROR_MESSAGE );
         }

         // procesar excepciones que pueden ocurrir al escribir en el archivo
         catch ( IOException excepcionES ) {
             JOptionPane.showMessageDialog( this, "Error al escribir en el archivo",
                "Excepción de ES", JOptionPane.ERROR_MESSAGE );
            cerrarArchivo();
         }

      } // fin de instrucción if

   } // fin del método agregarRegistro

   public static void main( String args[] )
   {
      new CrearArchivoSecuencial();
   }

} // fin de la clase CrearArchivoSecuencial

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
