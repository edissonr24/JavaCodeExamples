// Fig. 17.10: ConsultaCreditos.java
// Este programa lee un archivo en forma secuencial y muestra su contenido en un 
// �rea de texto, con base en el tipo de cuenta que el usuario solicita 
// (saldo con cr�dito, saldo con d�bito o saldo en ceros).
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

import com.deitel.cpej5.cap17.RegistroCuentas;

public class ConsultaCreditos extends JFrame {  
   private JTextArea areaMostrarRegistros;
   private JButton botonAbrir, botonCredito, botonDebito, botonCeros;
   private JPanel panelBotones; 
        
   private ObjectInputStream entrada;
   private FileInputStream entradaArchivo;
   private File nombreArchivo;
   private String tipoCuenta;
   
   static private DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

   // configurar GUI
   public ConsultaCreditos()
   {
      super( "Programa de consulta de cr�ditos" );

      Container contenedor = getContentPane();

      panelBotones = new JPanel(); // configurar panel para agregarle botones
      
      // crear y configurar bot�n para abrir el archivos
      botonAbrir = new JButton( "Abrir archivo" );
      panelBotones.add( botonAbrir );

      // registrar componente de escucha de botonAbrir
      botonAbrir.addActionListener(

         // clase interna an�nima para manejar evento de botonAbrir
         new ActionListener() {

            // abrir archivo para procesarlo
            public void actionPerformed( ActionEvent evento )
            {
               abrirArchivo();
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addActionListener

      // crear y configurar bot�n para obtener cuentas con saldos con cr�dito
      botonCredito = new JButton( "Saldos con cr�dito" );
      panelBotones.add( botonCredito );
      botonCredito.addActionListener( new ManejadorBotones() );

      // crear y configurar bot�n para obtener cuentas con saldos con d�bito
      botonDebito = new JButton( "Saldos con d�bito" );
      panelBotones.add( botonDebito );
      botonDebito.addActionListener( new ManejadorBotones() );

      // crear y configurar bot�n para obtener cuentas con saldos en ceros
      botonCeros = new JButton( "Saldos en ceros" );
      panelBotones.add( botonCeros );
      botonCeros.addActionListener( new ManejadorBotones() );

      // establecer �rea para mostrar resultados
      areaMostrarRegistros = new JTextArea();
      JScrollPane desplazador = new JScrollPane( areaMostrarRegistros );

      // adjuntar componentes al panel de contenido
      contenedor.add( desplazador, BorderLayout.CENTER );
      contenedor.add( panelBotones, BorderLayout.SOUTH );

      botonCredito.setEnabled( false ); // deshabilitar botonCredito
      botonDebito.setEnabled( false );  // deshabilitar botonDebito
      botonCeros.setEnabled( false );   // deshabilitar botonCeros

      // registrar componente de escucha de ventana
      addWindowListener(

         // clase interna an�nima para evento windowClosing
         new WindowAdapter() {

            // cerrar archivo y terminar el programa
            public void windowClosing( WindowEvent evento )
            {
               cerrarArchivo();
               System.exit( 0 );
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addWindowListener

      pack(); // empaquetar componentes y mostrar ventana
      setSize( 600, 250 );
      setVisible( true );

   } // fin del constructor de ConsultaCreditos

   // permitir al usuario seleccionar el archivo a abrir
   private void abrirArchivo()
   {
      // mostrar cuadro de di�logo, para que el usuario pueda seleccionar el archivo
      JFileChooser selectorArchivo = new JFileChooser();
      selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );

      int resultado = selectorArchivo.showOpenDialog( this );

      // si el usuario hizo clic en el bot�n Cancelar del cuadro de di�logo, regresar
      if ( resultado == JFileChooser.CANCEL_OPTION )
         return;

      nombreArchivo = selectorArchivo.getSelectedFile(); // obtener archivo seleccionado

      // mostrar error si el nombre de archivo es incorrecto
      if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) )
         JOptionPane.showMessageDialog( this, "Nombre de archivo incorrecto", 
            "Nombre de archivo incorrecto", JOptionPane.ERROR_MESSAGE );

      // abrir el archivo
      try {

         // cerrar archivo de la operaci�n anterior
         if ( entrada != null )  
            entrada.close();   

         entradaArchivo = new FileInputStream( nombreArchivo );
         entrada = new ObjectInputStream( entradaArchivo );
         botonAbrir.setEnabled( false );
         botonCredito.setEnabled( true );
         botonDebito.setEnabled( true );
         botonCeros.setEnabled( true );
      }

      // atrapar problemas que pueden ocurrir al manipular el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "El archivo no existe", 
            "Nombre de archivo incorrecto", JOptionPane.ERROR_MESSAGE );
      }

   } // fin del m�todo abrirArchivo
  
   // cerrar archivo antes de que termine la aplicaci�n
   private void cerrarArchivo()
   {
      // cerrar el archivo
      try {
          if ( entrada != null )
             entrada.close();
      }

      // procesar excepciones que puedan ocurrir al cerrar el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al cerrar el archivo",
            "Error", JOptionPane.ERROR_MESSAGE );

         System.exit( 1 );
      }

   } // fin del m�todo cerrarArchivo

   // leer registros del archivo y mostrar s�lo los registros del tipo apropiado
   private void leerRegistros()
   {      
      RegistroCuentas registro;
      
      // leer registros
      try {
          
          if ( entrada != null )
             entrada.close();
      
         entradaArchivo = new FileInputStream( nombreArchivo );
         entrada = new ObjectInputStream( entradaArchivo );

         areaMostrarRegistros.setText( "Las cuentas son:\n" );

         // recibir como entrada los valores del archivo
         while ( true ) {

            // leer un RegistroCuentas
            registro = ( RegistroCuentas ) entrada.readObject();

            // si es el tipo de cuenta apropiado, mostrar el registro
            if ( debeMostrarse( registro.obtenerSaldo() ) )
               areaMostrarRegistros.append( registro.obtenerCuenta() + "\t" + 
                  registro.obtenerPrimerNombre() + "\t" + registro.obtenerApellidoPaterno() + 
                  "\t" + dosDigitos.format( registro.obtenerSaldo() ) + "\n" );
         }  
         
      } // fin del bloque try

      // cerrar archivo cuando se llega al fin de archivo
      catch ( EOFException excepcionEOF ) {
         cerrarArchivo();
      }

      // mostrar error si no se puede leer el objeto por no encontrar la clase
      catch ( ClassNotFoundException claseNoEncontrada ) {
         JOptionPane.showMessageDialog( this, "No se pudo crear el objeto",
            "Clase no encontrada", JOptionPane.ERROR_MESSAGE );
      }

      // mostrar error si no se puede leer debido a un problema con el archivo
      catch ( IOException excepcionES ) {
         JOptionPane.showMessageDialog( this, "Error al leer del archivo",
            "Error", JOptionPane.ERROR_MESSAGE );
      }

   } // fin del m�todo leerRegistros

   // use el tipo del registro para determinar si el registro debe mostrarse
   private boolean debeMostrarse( double saldo )
   {
      if ( tipoCuenta.equals( "Saldos con cr�dito" ) && saldo < 0 )
         return true;

      else if ( tipoCuenta.equals( "Saldos con d�bito" ) && saldo > 0 )
         return true;

      else if ( tipoCuenta.equals( "Saldos en ceros" ) && saldo == 0 )
         return true;

      return false;
   }
   
   public static void main( String args[] )
   {
      new ConsultaCreditos();
   }
 
   // clase para el manejo de eventos de botonCredito, botonDebito y botonCeros
   private class ManejadorBotones implements ActionListener {

      // leer registros del archivo
      public void actionPerformed( ActionEvent evento )
      {
         tipoCuenta = evento.getActionCommand();
         leerRegistros();
      }

   } // fin de la clase ManejadorBotones

} // fin de la clase ConsultaCreditos

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
