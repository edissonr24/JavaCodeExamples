// Fig. 18.9: ClienteTresEnRaya.java
// Cliente que permite a un usuario jugar Tres en raya con otro usuario, a través de una red.
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class ClienteTresEnRaya extends JApplet implements Runnable {
   private JTextField campoID;
   private JTextArea areaPantalla;
   private JPanel panelTablero, panel2;
   private Cuadro tablero[][], cuadroActual;
   private Socket conexion;
   private DataInputStream entrada;
   private DataOutputStream salida;
   private char miMarca;
   private boolean miTurno;
   private final char MARCA_X = 'X', MARCA_O = 'O';

   // establecer interfaz de usuario y tablero
   public void init()
   {
      Container contenedor = getContentPane();
 
      // establecer objeto JTextArea para mostrar mensajes al usuario
      areaPantalla = new JTextArea( 4, 30 );
      areaPantalla.setEditable( false );
      contenedor.add( new JScrollPane( areaPantalla ), BorderLayout.SOUTH );

      // establecer panel para los cuadros en el tablero
      panelTablero = new JPanel();
      panelTablero.setLayout( new GridLayout( 3, 3, 0, 0 ) );

      // crear tablero
      tablero = new Cuadro[ 3 ][ 3 ];

      // Al crear un objeto Cuadro, el argumento posicion para el constructor 
      // es un valor entre 0 y 8, indicando la posición del objeto Cuadro en 
      // el tablero. Los valores 0,  y 2 son la primera fila, los valores 3, 4 
      // y 5 son la segunda fila. Los valores 6, 7 y 8 son la tercera fila.
      for ( int fila = 0; fila < tablero.length; fila++ ) {

         for ( int columna = 0; columna < tablero[ fila ].length; columna++ ) {

            // crear objeto Cuadro
            tablero[ fila ][ columna ] = new Cuadro( ' ', fila * 3 + columna );
            panelTablero.add( tablero[ fila ][ columna ] );        
         }
      }

      // campo de texto para mostrar la marca del jugador
      campoID = new JTextField();
      campoID.setEditable( false );
      contenedor.add( campoID, BorderLayout.NORTH );
      
      // establecer panel para contener a panelTablero (para su distribución en la pantalla)
      panel2 = new JPanel();
      panel2.add( panelTablero, BorderLayout.CENTER );
      contenedor.add( panel2, BorderLayout.CENTER );

   } // fin del método init

   // Realizar conexión con el servidor y obtener flujos asociados.
   // Iniciar subproceso separado para permitir a este subprograma
   // actualizar continuamente su salida en el área de texto de la pantalla.
   public void start()
   {
      // conectarse con el servidor, obtener los flujos e iniciar subprocesoSalida
      try {
         
         // realizar la conexión
         conexion = new Socket( getCodeBase().getHost(), 12345 );

         // obtener los flujos
         entrada = new DataInputStream( conexion.getInputStream() );
         salida = new DataOutputStream( conexion.getOutputStream() );
      }

      // atrapar los problemas que pueden ocurrir al establecer la conexión y los flujos
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();         
      }

      // crear e iniciar subproceso de salida
      Thread subprocesoSalida = new Thread( this );
      subprocesoSalida.start();

   } // fin del método start

   // controlar subproceso que permite actualización continua de areaPantalla
   public void run()
   {
      // obtener la marca del jugador (O o X)
      try {
         miMarca = entrada.readChar();

         // mostrar ID del jugador en subproceso despachador de eventos
         SwingUtilities.invokeLater( 
            new Runnable() {         
               public void run()
               {
                  campoID.setText( "Usted es el jugador \"" + miMarca + "\"" );
               }
            }
         ); 
         
         miTurno = ( miMarca == MARCA_X ? true : false );

         // recibir mensajes enviados al cliente y mostrarlos en pantalla
         while ( true ) {
            procesarMensaje( entrada.readUTF() );
         }

      } // fin del bloque try

      // procesar los problemas que pueden ocurrir al comunicarse con el servidor
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();         
      }

   }  // fin del método run

   // procesar los mensajes recibidos por el cliente
   private void procesarMensaje( String mensaje )
   {
      // ocurrió un movimiento válido
      if ( mensaje.equals( "Movimiento válido." ) ) {
         mostrarMensaje( "Movimiento válido, por favor espere.\n" );
         establecerMarca( cuadroActual, miMarca );
      }

      // ocurrió un movimiento inválido
      else if ( mensaje.equals( "Movimiento inválido, intente otra vez" ) ) {
         mostrarMensaje( mensaje + "\n" );
         miTurno = true;
      }

      // el oponente realizó un movimiento
      else if ( mensaje.equals( "El oponente hizo un movimiento" ) ) {

         // obtener posición del movimiento y actualizar el tablero
         try {
            int posicion = entrada.readInt();
            int fila = posicion / 3;
            int columna = posicion % 3;

            establecerMarca(  tablero[ fila ][ columna ], 
               ( miMarca == MARCA_X ? MARCA_O : MARCA_X ) );                  
            mostrarMensaje( "El oponente hizo un movimiento. Su turno.\n" );
            miTurno = true;

         } // fin del bloque try

         // procesar los problemas que pueden ocurrir al comunicarse con el servidor
         catch ( IOException excepcionES ) {
            excepcionES.printStackTrace();         
         }

      } // fin de la instrucción else if

      // mostrar simplemente el mensaje
      else
         mostrarMensaje( mensaje + "\n" );

   } // fin del método procesarMensaje

   // método utilitario que es llamado desde otros subprocesos para manipular a 
   // areaSalida en el subproceso despachador de eventos
   private void mostrarMensaje( final String mensajeAMostrar )
   {
      // mostrar mensaje del subproceso de ejecución despachador de eventos
      SwingUtilities.invokeLater(
         new Runnable() {  // clase interna para asegurar que la GUI se actualice apropiadamente

            public void run() // actualiza areaPantalla
            {
               areaPantalla.append( mensajeAMostrar );
               areaPantalla.setCaretPosition( 
                  areaPantalla.getText().length() );
            }

         }  // fin de la clase interna

      ); // fin de la llamada a SwingUtilities.invokeLater
   }

   // método utilitario para establecer la marca en el tablero, en el subproceso despachador de eventos
   private void establecerMarca( final Cuadro cuadroAMarcar, final char marca )
   {
      SwingUtilities.invokeLater(
         new Runnable() {
            public void run()
            {
               cuadroAMarcar.establecerMarca( marca );
            }
         }
      ); 
   }

   // enviar mensaje al servidor indicando el cuadro en el que se hizo clic
   public void enviarCuadroClic( int posicion )
   {
      if ( miTurno ) {

         // enviar posicion al servidor
         try {
            salida.writeInt( posicion );
            miTurno = false;
         }

         // procesar los problemas que pueden ocurrir al comunicarse con el servidor
         catch ( IOException excepcionES ) {
            excepcionES.printStackTrace();
         }
      }
   }

   // establecer el cuadro actual
   public void establecerCuadroActual( Cuadro cuadro )
   {
      cuadroActual = cuadro;
   }

   // clase interna privada para los cuadros en el tablero
   private class Cuadro extends JPanel {
      private char marca;
      private int posicion;
   
      public Cuadro( char marcaCuadro, int posicionCuadro )
      {
         marca = marcaCuadro;
         posicion = posicionCuadro;

         addMouseListener( 
            new MouseAdapter() {
               public void mouseReleased( MouseEvent e )
               {
                  establecerCuadroActual( Cuadro.this );
                  enviarCuadroClic( obtenerPosicionCuadro() );
               }
            }  
         ); 

      } // fin del constructor de Cuadro

      // devolver tamaño preferido del Cuadro
      public Dimension getPreferredSize() 
      { 
         return new Dimension( 30, 30 );
      }

      // devolver tamaño mínimo del Cuadro
      public Dimension getMinimumSize() 
      {
         return getPreferredSize();
      }

      // establecer marca para Cuadro
      public void establecerMarca( char nuevaMarca ) 
      { 
         marca = nuevaMarca; 
         repaint(); 
      }
   
      // devolver posición del Cuadro
      public int obtenerPosicionCuadro() 
      {
         return posicion; 
      }
   
      // dibujar el Cuadro
      public void paintComponent( Graphics g )
      {
         super.paintComponent( g );

         g.drawRect( 0, 0, 29, 29 );
         g.drawString( String.valueOf( marca ), 11, 20 );   
      }

   } // fin de la clase interna Cuadro
 
} // fin de la clase ClienteTresEnRaya

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
