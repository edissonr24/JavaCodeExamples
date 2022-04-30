// Fig. 17.9: LeerArchivoSecuencial.java
// Este programa lee un archivo de objetos en forma secuencial
// y muestra cada uno de los registros.
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.deitel.cpej5.cap17.*;

public class LeerArchivoSecuencial extends JFrame {
   private ObjectInputStream entrada;
   private IUBanco interfazUsuario;
   private JButton botonSiguiente, botonAbrir;

   // Constructor -- inicializar el marco 
   public LeerArchivoSecuencial()
   {
      super( "Leer un archivo secuencial de objetos" );

      // crear instancia de la interfaz de usuario reutilizable
      interfazUsuario = new IUBanco( 4 );  // cuatro campos de texto
      getContentPane().add( interfazUsuario, BorderLayout.CENTER );

      // obtener referencia al botón de tarea genérico hacerTarea1 de IUBanco
      botonAbrir = interfazUsuario.obtenerBotonHacerTarea1();
      botonAbrir.setText( "Abrir archivo" );

      // registrar componente de escucha para llamar a abrirArchivo cuando se oprima el botón
      botonAbrir.addActionListener(

         // clase interna anónima para manejar evento de botonAbrir
         new ActionListener() {

            // cerrar archivo y terminar la aplicación
            public void actionPerformed( ActionEvent evento )
            {
               abrirArchivo();
            }

         } // fin de la clase interna anónima
 
      ); // fin de la llamada a addActionListener
      
      // registrar componente de escucha de ventana para evento de cierre de ventana
      addWindowListener(

         // clase interna anónima para manejar evento windowClosing
         new WindowAdapter() {

            // cerrar el archivo y terminar la aplicación
            public void windowClosing( WindowEvent evento )
            {
               if ( entrada != null )
                  cerrarArchivo();

               System.exit( 0 );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addWindowListener

      // obtener referencia al botón de tarea genérico hacerTarea2 de IUBanco
      botonSiguiente = interfazUsuario.obtenerBotonHacerTarea2();
      botonSiguiente.setText( "Siguiente registro" );
      botonSiguiente.setEnabled( false );  
 
      // registrar componente de escucha para llamar a leerRegistro cuando se oprima el botón
      botonSiguiente.addActionListener(

         // clase interna anónima para manejar evento de siguienteRegistro
         new ActionListener() {

            // llamar a leerRegistro cuando el usuario haga clic en siguienteRegistro
            public void actionPerformed( ActionEvent evento )
            {               
               leerRegistro();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener
 
      pack();
      setSize( 300, 200 );
      setVisible( true );

   } // fin del constructor de LeerArchivoSecuencial

   // permitir al usuario seleccionar el archivo a abrir
   private void abrirArchivo()
   {
      // mostrar el cuadro de diálogo del archivo, para que el usuario pueda seleccionar el archivo a abrir
      JFileChooser selectorArchivo = new JFileChooser();
      selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );

      int resultado = selectorArchivo.showOpenDialog( this );
 
      // si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, regresar
      if ( resultado == JFileChooser.CANCEL_OPTION )
         return;

      // obtener el archivo seleccionado
      File nombreArchivo = selectorArchivo.getSelectedFile();
 
      // mostrar error si el nombre de archivo es incorrecto
      if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) )
         JOptionPane.showMessageDialog( this, "Nombre de archivo incorrecto", 
            "Nombre de archivo incorrecto", JOptionPane.ERROR_MESSAGE );

      else {

         // abrir archivo
         try {
            entrada = new ObjectInputStream(
               new FileInputStream( nombreArchivo ) );

            botonAbrir.setEnabled( false );
            botonSiguiente.setEnabled( true );
         }

         // procesar excepciones que pueden ocurrir al abrir el archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( this, "Error al abrir el archivo", 
               "Error", JOptionPane.ERROR_MESSAGE );
         }      

      } // fin de instrucción else

   } // fin del método abrirArchivo

   // leer registro del archivo
   public void leerRegistro()
   {
      RegistroCuentas registro;

      // leer los valores del archivo
      try {
         registro = ( RegistroCuentas ) entrada.readObject();

         // crear arreglo de objetos String a mostrar en la GUI
         String valores[] = { String.valueOf( registro.obtenerCuenta() ),
            registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
            String.valueOf( registro.obtenerSaldo() ) };

         // mostrar contenido del registro
         interfazUsuario.establecerValoresCampos( valores );
      }

      // mostrar mensaje al llegar al fin del archivo
      catch ( EOFException excepcionFinDeArchivo ) {
         botonSiguiente.setEnabled( false );

         JOptionPane.showMessageDialog( this, "No hay más registros en el archivo",
            "Fin del archivo", JOptionPane.ERROR_MESSAGE );
      }

      // mostrar mensaje de error si no se encuentra la clase
      catch ( ClassNotFoundException excepcionClaseNoEncontrada ) {
         JOptionPane.showMessageDialog( this, "No se pudo crear el objeto",
            "Clase no encontrada", JOptionPane.ERROR_MESSAGE );
      }

      // mostrar mensaje de error si no se puede leer debido a un problema con el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this,
            "Error al leer del archivo",
            "Error de lectura", JOptionPane.ERROR_MESSAGE );
      }

   } // fin del método leerRegistro

   // cerrar archivo y terminar la aplicación
   private void cerrarArchivo()
   {
      // cerrar archivo y salir
      try {
         entrada.close();
         System.exit( 0 );
      }

      // procesar excepción que puede ocurrir mientras se cierra el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al cerrar el archivo",
            "Error", JOptionPane.ERROR_MESSAGE );

         System.exit( 1 );
      }

   } // fin del método cerrarArchivo

   public static void main( String args[] )
   {
      new LeerArchivoSecuencial();
   }

} // fin de la clase LeerArchivoSecuencial

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
