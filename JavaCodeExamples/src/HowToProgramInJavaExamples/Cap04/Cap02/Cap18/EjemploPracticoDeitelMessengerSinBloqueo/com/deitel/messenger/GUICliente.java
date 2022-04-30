// GUICliente.java
// GUICliente proporciona una interfaz de usuario para enviar y recibir
// mensajes hacia y desde el ServidorDeitelMessenger.
package com.deitel.messenger;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GUICliente extends JFrame {
   
   // objeto JMenu para conectarse al/desconectarse del servidor
   private JMenu menuServidor;
   
   // objetos JTextArea para mostrar e introducir mensajes
   private JTextArea areaMensajes;
   private JTextArea areaIntroducir;   
 
   // objetos JButton y JMenuItem para conectarse y desconectarse
   private JButton botonConectar;
   private JMenuItem elementoMenuConectar;   
   private JButton botonDesconectar;
   private JMenuItem elementoMenuDesconectar;
   
   // objeto JButton para enviar mensajes
   private JButton botonEnviar;
   
   // objeto JLabel para mostar el estado de la conexión
   private JLabel barraEstado;
   
   // nombreUsuario que se va a agregar a los mensajes salientes
   private String nombreUsuario;
   
   // objeto AdministradorMensajes para comunicarse con el servidor
   private AdministradorMensajes administradorMensajes;
   
   // objeto EscuchaMensajes para recibir los mensajes entrantes
   private EscuchaMensajes escuchaMensajes;
 
   // constructor de GUICliente
   public GUICliente(AdministradorMensajes administrador) 
   {       
      super( "Deitel Messenger" );
      
      // establecer el objeto AdministradorMensajes
      administradorMensajes = administrador;
      
      // crear objeto MiEscuchaMensajes para recibir mensajes
      escuchaMensajes = new MiEscuchaMensajes();
      
      // crear objeto JMenu Servidor      
      menuServidor = new JMenu ( "Servidor" );   
      menuServidor.setMnemonic( 'S' );
      JMenuBar barraMenus = new JMenuBar();
      barraMenus.add( menuServidor );
      setJMenuBar( barraMenus );  
      
      // crear objeto ImageIcon para botones conectar
      Icon iconoConectar = new ImageIcon( 
         getClass().getResource( "imagenes/Conectar.gif" ) );
      
      // crear botonConectar y elementoMenuConectar
      botonConectar = new JButton( "Conectar", iconoConectar );
      elementoMenuConectar = new JMenuItem( "Conectar", iconoConectar );  
      elementoMenuConectar.setMnemonic( 'C' );
      
      // crear objeto EscuchaConectar para botones conectar
      ActionListener escuchaConectar = new EscuchaConectar();
      botonConectar.addActionListener( escuchaConectar );
      elementoMenuConectar.addActionListener( escuchaConectar ); 
      
      // crear objeto ImageIcon para botones desconectar
      Icon iconoDesconectar = new ImageIcon( 
         getClass().getResource( "imagenes/Desconectar.gif" ) );
      
      // crear botonDesconectar y elementoMenuDesconectar
      botonDesconectar = new JButton( "Desconectar", iconoDesconectar );
      elementoMenuDesconectar = new JMenuItem( "Desconectar", iconoDesconectar );      
      elementoMenuDesconectar.setMnemonic( 'D' );
      
      // deshabilitar botones desconectar
      botonDesconectar.setEnabled( false );
      elementoMenuDesconectar.setEnabled( false );
      
      // crear objeto EscuchaDesconectar para botones desconectar
      ActionListener escuchaDesconectar = new EscuchaDesconectar();
      botonDesconectar.addActionListener( escuchaDesconectar );
      elementoMenuDesconectar.addActionListener( escuchaDesconectar );
      
      // agregar objetos JMenuItem para conectar y desconectar a objeto menuServidor
      menuServidor.add( elementoMenuConectar );
      menuServidor.add( elementoMenuDesconectar );           
  
      // agregar objetos JButton para conectar y desconectar a panelBotones
      JPanel panelBotones = new JPanel();
      panelBotones.add( botonConectar );
      panelBotones.add( botonDesconectar );
     
      // crear objeto JTextArea para mostrar mensajes
      areaMensajes = new JTextArea();
      
      // deshabilitar edición y habilitar envoltura de palabras al final de la línea
      areaMensajes.setEditable( false );
      areaMensajes.setWrapStyleWord( true );
      areaMensajes.setLineWrap( true );
      
      // colocar areaMensajes en objeto JScrollPane para habilitar capacidad de desplazamiento
      JPanel panelMensajes = new JPanel();
      panelMensajes.setLayout( new BorderLayout( 10, 10 ) );
      panelMensajes.add( new JScrollPane( areaMensajes ), 
         BorderLayout.CENTER );
      
      // crear objeto JTextArea para introducir nuevos mensajes
      areaIntroducir = new JTextArea( 4, 20 );
      areaIntroducir.setWrapStyleWord( true );
      areaIntroducir.setLineWrap( true );
      areaIntroducir.setEditable( false );
      
      // crear objeto Icon para botonEnviar
      Icon iconoEnviar = new ImageIcon( 
         getClass().getResource( "imagenes/Enviar.gif" ) );
      
      // crear botonEnviar y deshabilitarlo
      botonEnviar = new JButton( "Enviar", iconoEnviar );
      botonEnviar.setEnabled( false );
      botonEnviar.addActionListener(

         new ActionListener() {
            
            // enviar nuevo mensaje cuando el usuario active botonEnviar
            public void actionPerformed( ActionEvent evento )
            {
               administradorMensajes.enviarMensaje( nombreUsuario, 
                  areaIntroducir.getText());
               
               // borrar areaIntroducir
               areaIntroducir.setText("");
            }
         } 
      );
      
      // distribuir areaIntroducir y botonEnviar en objeto BoxLayout y 
      // agregar objeto Box a panelMensajes
      Box cuadro = new Box( BoxLayout.X_AXIS );
      cuadro.add( new JScrollPane( areaIntroducir ) );
      cuadro.add( botonEnviar );
      panelMensajes.add( cuadro, BorderLayout.SOUTH );
      
      // crear objeto JLabel para barraEstado con un borde empotrado
      barraEstado = new JLabel( "Sin conexión" );
      barraEstado.setBorder( new BevelBorder( BevelBorder.LOWERED ) );

      // distribuir componentes en objeto JFrame
      Container contenedor = getContentPane();
      contenedor.add( panelBotones, BorderLayout.NORTH );
      contenedor.add( panelMensajes, BorderLayout.CENTER );
      contenedor.add( barraEstado, BorderLayout.SOUTH );
      
      // agregar objeto WindowListener para desconectarse cuando el usuario salga
      addWindowListener ( 

         new WindowAdapter () {
            
            // desconectarse del servidor y salir de la aplicación
            public void windowClosing ( WindowEvent evento ) 
            {
               administradorMensajes.desconectar( escuchaMensajes );
               System.exit( 0 );
            }
         }
      );

   } // fin del constructor de GUICliente
   
   // objeto EscuchaConectar que escucha las peticiones de los usuarios para conectarse al servidor
   private class EscuchaConectar implements ActionListener {
      
      // conectarse al servidor y habilitar/deshabilitar los componentes de GUI
      public void actionPerformed( ActionEvent evento )
      {
         // conectarse con el servidor y enrutar mensajes hacia escuchaMensajes
         administradorMensajes.conectar( escuchaMensajes ); 

         // pedir el nombre del usuario
         nombreUsuario = JOptionPane.showInputDialog( 
            GUICliente.this, "Escriba el nombre de usuario:" );
         
         // borrar areaMensajes
         areaMensajes.setText( "" );

         // actualizar componentes de GUI
         botonConectar.setEnabled( false );
         elementoMenuConectar.setEnabled( false );
         botonDesconectar.setEnabled( true );
         elementoMenuDesconectar.setEnabled( true );
         botonEnviar.setEnabled( true );
         areaIntroducir.setEditable( true );
         areaIntroducir.requestFocus();  
         barraEstado.setText( "Conectado: " + nombreUsuario );                
      }   
      
   } // fin de la clase interna EscuchaConectar
   
   // EscuchaDesconectar escucha las peticiones de los usuarios para desconectarse
   // del objeto ServidorDeitelMessenger
   private class EscuchaDesconectar implements ActionListener {
      
      // desconectarse del servidor y habilitar/deshabilitar los componentes de GUI
      public void actionPerformed( ActionEvent evento )
      {
         // desconectarse del servidor y dejar de enrutar los mensajes
         // hacia escuchaMensajes
         administradorMensajes.desconectar( escuchaMensajes );

         // actualizar componentes de GUI
         botonEnviar.setEnabled( false );
         botonDesconectar.setEnabled( false );
         elementoMenuDesconectar.setEnabled( false );
         areaIntroducir.setEditable( false );
         botonConectar.setEnabled( true );         
         elementoMenuConectar.setEnabled( true );
         barraEstado.setText( "Sin conexión" );         
      }
      
   } // fin de la clase interna EscuchaDesconectar
   
   // MiEscuchaMensajes escucha los nuevos mensajes del objeto AdministradorMensajes y 
   // muestra los mensajes en areaMensajes, utilizando MostradorMensajes.
   private class MiEscuchaMensajes implements EscuchaMensajes {

      // al recibirlos, mostrar nuevos mensajes en areaMensajes
      public void mensajeRecibido( String de, String mensaje ) 
      {
         // anexar mensaje utilizando objeto MostradorMensajes e
         // invokeLater, asegurando un acceso a areaMensajes seguro para los subprocesos
         SwingUtilities.invokeLater( 
            new MostradorMensajes( de, mensaje ) );
      } 
   }  
   
   // MostradorMensajes muestra un nuevo mensaje, anexando el mensaje al 
   // objeto JTextArea llamado areaMensajes. Este objeto Runnable debe ejecutarse 
   // solamente en el subproceso Event, ya que modifica a un componente de Swing activo
   private class MostradorMensajes implements Runnable {
      private String deUsuario;
      private String cuerpoMensaje;
      
      // constructor de MostradorMensajes
      public MostradorMensajes( String de, String cuerpo )
      {
         deUsuario = de;
         cuerpoMensaje = cuerpo;
      }
      
      // mostrar nuevo mensaje en areaMensajes
      public void run() 
      {
         // anexar nuevo mensaje
         areaMensajes.append( "\n" + deUsuario + "> " + cuerpoMensaje );   

         // desplazar signo de intercalación al final de areaMensajes para asegurar que 
         // el nuevo mensaje pueda verse en la pantalla
         areaMensajes.setCaretPosition( areaMensajes.getText().length() );                          
      }      
      
   } // fin de la clase interna MostradorMensajes

} // fin de la clase GUICliente


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