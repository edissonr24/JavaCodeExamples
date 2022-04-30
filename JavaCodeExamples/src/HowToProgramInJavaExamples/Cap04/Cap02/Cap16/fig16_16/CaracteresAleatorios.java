// Fig. 16.16: CaracteresAleatorios.java
// La clase CaracteresAleatorios demuestra el uso de la interfaz Runnable
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CaracteresAleatorios extends JApplet implements ActionListener {
   private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private final static int TAMANIO = 3;
   private JLabel salidas[];
   private JCheckBox casillasVerificacion[];   
   private Thread subprocesos[];
   private boolean suspendido[];

   // configurar la GUI y establecer arreglos
   public void init()
   {
      salidas = new JLabel[ TAMANIO ];
      casillasVerificacion = new JCheckBox[ TAMANIO ];
      subprocesos = new Thread[ TAMANIO ];
      suspendido = new boolean[ TAMANIO ];

      Container contenedor = getContentPane();
      contenedor.setLayout( new GridLayout( TAMANIO, 2, 5, 5 ) );

      // crear componentes de la GUI, registrar componentes de escucha y adjuntar 
      // componentes al panel de contenido
      for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
         salidas[ cuenta ] = new JLabel();
         salidas[ cuenta ].setBackground( Color.GREEN );
         salidas[ cuenta ].setOpaque( true );
         contenedor.add( salidas[ cuenta ] );

         casillasVerificacion[ cuenta ] = new JCheckBox( "Suspendido" );
         casillasVerificacion[ cuenta ].addActionListener( this );
         contenedor.add( casillasVerificacion[ cuenta ] );
      }

   } // fin del m�todo init
  
   // crear e iniciar subprocesos cada vez que se hace una llamada a start (es decir, despu�s de 
   // init y cuando el usuario vuelve a visitar la p�gina Web que contiene a este subprograma)
   public void start()
   {
      for ( int cuenta = 0; cuenta < subprocesos.length; cuenta++ ) {

         // crear objeto Thread; inicializar objeto que implementa a Runnable
         subprocesos[ cuenta ] = 
            new Thread( new ObjetoRunnable(), "Subproceso " + ( cuenta + 1 ) );

         subprocesos[ cuenta ].start(); // empezar la ejecuci�n del objeto Thread
      }
   }

   // determinar ubicaci�n del subproceso en el arreglo subprocesos
   private int obtenerIndice( Thread actual )
   {
      for ( int cuenta = 0; cuenta < subprocesos.length; cuenta++ )
         if ( actual == subprocesos[ cuenta ] )
            return cuenta;

      return -1; 
   }

   // este m�todo se llama cuando el usuario cambia de p�ginas Web; detiene todos los subprocesos
   public synchronized void stop()
   {
      // establecer referencias en null para terminar el m�todo run de cada subproceso
      for ( int cuenta = 0; cuenta < subprocesos.length; cuenta++ ) 
         subprocesos[ cuenta ] = null;
      
      notifyAll(); // notificar a todos los subprocesos en espera, para que puedan terminar
   }

   // manejar eventos de bot�n
   public synchronized void actionPerformed( ActionEvent evento )
   {
      for ( int cuenta = 0; cuenta < casillasVerificacion.length; cuenta++ ) {

         if ( evento.getSource() == casillasVerificacion[ cuenta ] ) {
            suspendido[ cuenta ] = !suspendido[ cuenta ];

            // cambiar color de la etiqueta al suspender/reanudar
            salidas[ cuenta ].setBackground(
               suspendido[ cuenta ] ? Color.RED : Color.GREEN );

            // si el subproceso se reanud�, asegurarse de que empiece a ejecutarse
            if ( !suspendido[ cuenta ] )
               notifyAll(); 

            return;
         }
      }

   } // fin del m�todo actionPerformed

   // clase interna privada que implementa a Runnable para controlar los subprocesos
   private class ObjetoRunnable implements Runnable {
   
      // colocar caracteres aleatorios en la GUI, las variables subprocesoActual e
      // indice son finales, para poder usarlas en una clase interna an�nima
      public void run()
      {
         // obtener referencia al subproceso en ejecuci�n
         final Thread subprocesoActual = Thread.currentThread();

         // determinar la posici�n del subproceso en el arreglo
         final int indice = obtenerIndice( subprocesoActual );

         // la condici�n del ciclo determina cu�ndo debe detenerse el subproceso; el ciclo 
         // termina cuando la referencia subprocesos[ indice ] se vuelve null
         while ( subprocesos[ indice ] == subprocesoActual ) {

            // estar inactivo de 0 a 1 segundo
            try {
               Thread.sleep( ( int ) ( Math.random() * 1000 ) );

               // determinar si el subproceso debe suspender su ejecuci�n;
               // sincronizar con el objeto de subprograma CaracteresAleatorios
               synchronized( CaracteresAleatorios.this ) {

                  while ( suspendido[ indice ] && 
                     subprocesos[ indice ] == subprocesoActual ) {

                     // suspender temporalmente la ejecuci�n del subproceso
                     CaracteresAleatorios.this.wait();  
                  }
               } // fin del bloque synchronized

            } // fin de bloque try

            // si el subproceso se interrumpi� durante su espera/inactividad, imprimir el rastreo de la pila
            catch ( InterruptedException excepcion ) {
               excepcion.printStackTrace();
            }
            
            // mostrar caracter en objeto JLabel correspondiente
            SwingUtilities.invokeLater( 
               new Runnable() {
                  
                  // elegir caracter aleatorio y mostrarlo
                  public void run() 
                  {
                     char mostrarChar = 
                        alfabeto.charAt( ( int ) ( Math.random() * 26 ) );

                     salidas[ indice ].setText( 
                        subprocesoActual.getName()  + ": " + mostrarChar );
                  }

               } // fin de la clase interna

            ); // fin de la llamada a SwingUtilities.invokeLater
            
         } // fin de instrucci�n while

         System.err.println( subprocesoActual.getName() + " terminando" );

      } // fin del m�todo run

   } // fin de la clase interna privada ObjetoRunnable

} // fin de la clase CaracteresAleatorios


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
