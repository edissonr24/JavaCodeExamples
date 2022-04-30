// Fig. 10.22: VentanaPruebaTiempo.java
// Declaraciones de clase interna utilizadas para crear manejadores de eventos.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPruebaTiempo extends JFrame {
   private Tiempo tiempo;
   private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
   private JTextField horaCampo, minutoCampo, segundoCampo, pantallaCampo;
   private JButton salirBoton;

   // configurar GUI
   public VentanaPruebaTiempo()
   {
      // llamar al constructor de JFrame para establecer cadena de barra de t�tulo
      super( "Demostraci�n de clase interna" );  

      tiempo = new Tiempo();  // crear objeto Tiempo

      // usar m�todo heredado getContentPane para obtener panel de contenido de la ventana
      Container contenedor = getContentPane();  
      contenedor.setLayout( new FlowLayout() );  // cambiar esquema

      // preparar horaEtiqueta y horaCampo
      horaEtiqueta = new JLabel( "Ajuste hora" );
      horaCampo = new JTextField( 10 );
      contenedor.add( horaEtiqueta );
      contenedor.add( horaCampo );

      // preparar minutoEtiqueta y minutoCampo
      minutoEtiqueta = new JLabel( "Ajuste minuto" );
      minutoCampo = new JTextField( 10 );
      contenedor.add( minutoEtiqueta );
      contenedor.add( minutoCampo );

      // preparar segundoEtiqueta y segundoCampo
      segundoEtiqueta = new JLabel( "Ajuste segundo" );
      segundoCampo = new JTextField( 10 );
      contenedor.add( segundoEtiqueta );
      contenedor.add( segundoCampo );

      // establecer pantallaCampo
      pantallaCampo = new JTextField( 30 );
      pantallaCampo.setEditable( false );
      contenedor.add( pantallaCampo );

      // establecer salirBoton
      salirBoton = new JButton( "Salir" );
      contenedor.add( salirBoton );

      // crear una instancia de la clase interna ActionEventHandler
      ActionEventHandler manejador = new ActionEventHandler();

      // registrar manejadores de eventos; el objeto referenciado por manejador 
      // es el ActionListener, el cual contiene el m�todo actionPerformed 
      // que ser� llamado para manejar los eventos de acci�n generados por 
      // horaCampo, minutoCampo, segundoCampo y salirBoton
      horaCampo.addActionListener( manejador ); 
      minutoCampo.addActionListener( manejador );
      segundoCampo.addActionListener( manejador );
      salirBoton.addActionListener( manejador );

   } // fin del constructor

   // mostrar tiempo en pantallaCampo
   public void mostrarTiempo()
   {
      pantallaCampo.setText( "La hora es: " + tiempo );
   }

   // iniciar aplicaci�n: crear, ajustar tama�o y mostrar VentanaPruebaTiempo; 
   // cuando main termina, el programa continua ejecut�ndose ya que 
   // se muestra una ventana mediante las instrucciones en main
   public static void main( String args[] )
   {
      VentanaPruebaTiempo ventana = new VentanaPruebaTiempo();

      ventana.setSize( 400, 140 );
      ventana.setVisible( true );

   } // fin de main

   // declaraci�n de clase interna para manejar eventos JTextField y JButton
   private class ActionEventHandler implements ActionListener {

      // m�todo para manejar eventos de acci�n 
      public void actionPerformed( ActionEvent evento )
      {
         // el usuario oprimi� salirBoton
         if ( evento.getSource() == salirBoton )
            System.exit( 0 );   // terminar la aplicaci�n

         // el usuario oprimi� tecla Intro en horaCampo
         else if ( evento.getSource() == horaCampo ) {
            tiempo.establecerHora( Integer.parseInt( 
               evento.getActionCommand() ) );
            horaCampo.setText( "" );
         }

         // el usuario oprimi� tecla Intro en minutoCampo
         else if ( evento.getSource() == minutoCampo ) {
            tiempo.establecerMinuto( Integer.parseInt( 
               evento.getActionCommand() ) );
            minutoCampo.setText( "" );
         }

         // el usuario oprimi� tecla Intro en segundoCampo
         else if ( evento.getSource() == segundoCampo ) {
            tiempo.establecerSegundo( Integer.parseInt( 
               evento.getActionCommand() ) );
            segundoCampo.setText( "" );
         }

         mostrarTiempo();  // llamar a un m�todo de la clase externa

      } // fin del m�todo actionPerformed

   } // fin de la clase interna ActionEventHandler

} // fin de la clase VentanaPruebaTiempo


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
