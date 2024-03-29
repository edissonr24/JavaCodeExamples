// Fig. 18.6: Servidor.java
// Servidor que recibe y env�a paquetes de/a un cliente.
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Servidor extends JFrame {
   private JTextArea areaPantalla;
   private DatagramSocket socket;

   // configurar GUI y DatagramSocket
   public Servidor()
   {
      super( "Servidor" );

      areaPantalla = new JTextArea();
      getContentPane().add( new JScrollPane( areaPantalla ),
         BorderLayout.CENTER );
      setSize( 400, 300 );
      setVisible( true );

      // crear objeto DatagramSocket para enviar y recibir paquetes
      try {
         socket = new DatagramSocket( 5000 );
      }

      // procesar los problemas que pueden ocurrir al crear el objeto DatagramSocket
      catch( SocketException excepcionSocket ) {
         excepcionSocket.printStackTrace();
         System.exit( 1 );
      }

   } // fin del constructor de Servidor

   // esperar a que lleguen los paquetes, mostrar los datos y repetir el paquete al cliente
   private void esperarPaquetes()
   {
      while ( true ) { // iterar infinitamente

         // recibir paquete, mostrar su contenido, devolver copia al cliente
         try {

            // establecer el paquete
            byte datos[] = new byte[ 100 ];
            DatagramPacket recibirPaquete = 
               new DatagramPacket( datos, datos.length );

            socket.receive( recibirPaquete ); // esperar el paquete

            // mostrar la informaci�n del paquete recibido 
            mostrarMensaje( "\nPaquete recibido:" + 
               "\nDel host: " + recibirPaquete.getAddress() + 
               "\nPuerto del host: " + recibirPaquete.getPort() + 
               "\nLongitud: " + recibirPaquete.getLength() + 
               "\nContenido:\n\t" + new String( recibirPaquete.getData(), 
                  0, recibirPaquete.getLength() ) );

            enviarPaqueteACliente( recibirPaquete ); // enviar paquete al cliente
         }

         // procesar los problemas que pueden ocurrir al manipular el paquete
         catch( IOException excepcionES ) {
            mostrarMensaje( excepcionES.toString() + "\n" );
            excepcionES.printStackTrace();
         }

      } // fin de instrucci�n while

   } // fin del m�todo esperarPaquetes

   // repetir el paquete al cliente
   private void enviarPaqueteACliente( DatagramPacket recibirPaquete ) 
      throws IOException
   {
      mostrarMensaje( "\n\nRepitiendo datos al cliente..." );

      // crear paquete a enviar
      DatagramPacket enviarPaquete = new DatagramPacket( 
         recibirPaquete.getData(), recibirPaquete.getLength(), 
         recibirPaquete.getAddress(), recibirPaquete.getPort() );

      socket.send( enviarPaquete ); // enviar el paquete
      mostrarMensaje( "Paquete enviado\n" );
   }

   // m�todo utilitario que es llamado desde otros subprocesos para manipular a 
   // areaPantalla en el subproceso despachador de eventos
   private void mostrarMensaje( final String mensajeAMostrar )
   {
      // mostrar el mensaje del subproceso de ejecuci�n despachador de eventos
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

   public static void main( String args[] )
   {
      Servidor aplicacion = new Servidor();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      aplicacion.esperarPaquetes();
   }

} // fin de la clase Servidor

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