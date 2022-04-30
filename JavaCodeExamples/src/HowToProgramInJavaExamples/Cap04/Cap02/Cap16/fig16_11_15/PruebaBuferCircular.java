// Fig. 16.15: PruebaBuferCircular.java
// PruebaBuferCircular muestra a dos subprocesos manipulando un búfer circular.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// establecer los subprocesos productor y consumidor e iniciarlos
public class PruebaBuferCircular extends JFrame {
   JTextArea areaSalida;

   // configurar la GUI
   public PruebaBuferCircular()
   {
      super( "Demostración de sincronización de subprocesos" );
        
      areaSalida = new JTextArea( 20,30 );
      areaSalida.setFont( new Font( "Monospaced", Font.PLAIN, 12 ) );
      getContentPane().add( new JScrollPane( areaSalida ) );
        
      setSize( 350, 500 );
      setVisible( true );
        
      // crear objeto compartido utilizado por los subprocesos; utilizamos una referencia
      // BuferCircular en vez de una referencia Bufer, para poder invocar al 
      // método crearSalidaEstado de BuferCircular
      BuferCircular ubicacionCompartida = new BuferCircular( areaSalida );

      // mostrar el estado inicial de los búferes en BuferCircular
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         ubicacionCompartida.crearSalidaEstado() ) );

      // establecer subprocesos
      Productor productor = new Productor( ubicacionCompartida, areaSalida );
      Consumidor consumidor = new Consumidor( ubicacionCompartida, areaSalida );
        
      productor.start();  // iniciar subproceso productor
      consumidor.start();  // iniciar subproceso consumidor

   } // fin del constructor
    
   public static void main ( String args[] )
   {
      PruebaBuferCircular aplicacion = new PruebaBuferCircular();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaBuferCircular


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
