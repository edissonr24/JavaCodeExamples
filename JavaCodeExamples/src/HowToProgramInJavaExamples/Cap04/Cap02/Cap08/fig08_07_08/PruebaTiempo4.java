// Fig. 8.8: PruebaTiempo4.java
// Demostración de los métodos establecer y obtener de la clase Tiempo3.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaTiempo4 extends JApplet implements ActionListener {
   private Tiempo3 tiempo;

   private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
   private JTextField horaCampo, minutoCampo, segundoCampo, pantallaCampo;
   private JButton ticBoton;

   // crear objeto Tiempo3 y configurar GUI
   public void init()
   {
      tiempo = new Tiempo3();  // crear objeto Tiempo3

      // obtener el panel de contenido del subprograma y cambiar esquema a FlowLayout
      Container contenedor = getContentPane();  
      contenedor.setLayout( new FlowLayout() ); 

      // configurar horaEtiqueta y horaCampo
      horaEtiqueta = new JLabel( "Establecer hora" );
      horaCampo = new JTextField( 10 );
      contenedor.add( horaEtiqueta );
      contenedor.add( horaCampo );

      // configurar minutoEtiqueta y minutoCampo
      minutoEtiqueta = new JLabel( "Establecer minuto" );
      minutoCampo = new JTextField( 10 );
      contenedor.add( minutoEtiqueta );
      contenedor.add( minutoCampo );

      // configurar segundoEtiqueta y segundoCampo
      segundoEtiqueta = new JLabel( "Establecer segundo" );
      segundoCampo = new JTextField( 10 );
      contenedor.add( segundoEtiqueta );
      contenedor.add( segundoCampo );

      // configurar pantallaCampo
      pantallaCampo = new JTextField( 30 );
      pantallaCampo.setEditable( false );
      contenedor.add( pantallaCampo );

      // configurar ticBoton
      ticBoton = new JButton( "Agregar 1 a Segundo" );
      contenedor.add( ticBoton );

      // registrar los manejadores de eventos; este subprograma es el ActionListener, 
      // el cual contiene el método actionPerformed que será llamado para 
      // manejar los eventos de acción generados por horaCampo, minutoCampo, 
      // segundoCampo y ticBoton
      horaCampo.addActionListener( this ); 
      minutoCampo.addActionListener( this );
      segundoCampo.addActionListener( this );
      ticBoton.addActionListener( this );

      mostrarHora(); // actualizar texto en pantallaCampo y barra de estado

   } // fin del método init

   // manejador de eventos para los eventos de botón y campo de texto
   public void actionPerformed( ActionEvent evento )
   {
      // procesar evento de ticBoton
      if ( evento.getSource() == ticBoton )
         tic();

      // procesar evento de horaCampo
      else if ( evento.getSource() == horaCampo ) {
         tiempo.establecerHora( Integer.parseInt( evento.getActionCommand() ) );
         horaCampo.setText( "" );
      }

      // procesar evento de minutoCampo
      else if ( evento.getSource() == minutoCampo ) {
         tiempo.establecerMinuto( Integer.parseInt( evento.getActionCommand() ) );
         minutoCampo.setText( "" );
      }

      // procesar evento de segundoCampo
      else if ( evento.getSource() == segundoCampo ) {
         tiempo.establecerSegundo( Integer.parseInt( evento.getActionCommand() ) );
         segundoCampo.setText( "" );
      }

      mostrarHora(); // actualizar texto en pantallaCampo y barra de estado

   } // fin del método actionPerformed

   // actualizar pantallaCampo y barra de estado del contenedor de subprogramas
   public void mostrarHora()
   {
      pantallaCampo.setText( "Hora: " + tiempo.obtenerHora() + "; Minuto: " + 
         tiempo.obtenerMinuto() + "; Segundo: " + tiempo.obtenerSegundo() );

      showStatus( "La hora estándar es: " + tiempo.aStringEstandar() +
         "; la hora universal es: " + tiempo.aStringUniversal() );

   } // fin del método mostrarHora

   // sumar uno al segundo y actualizar la hora/minuto si es necesario 
   public void tic()
   {
      tiempo.establecerSegundo( ( tiempo.obtenerSegundo() + 1 ) % 60 );

      if ( tiempo.obtenerSegundo() == 0 ) {
         tiempo.establecerMinuto( ( tiempo.obtenerMinuto() + 1 ) % 60 );

         if ( tiempo.obtenerMinuto() == 0 )
            tiempo.establecerHora( ( tiempo.obtenerHora() + 1 ) % 24 );
      }

   } // fin del método tic

} // fin de la clase PruebaTiempo4


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
