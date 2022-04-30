// Fig. 16.12: Productor.java
// El método run de Productor controla un subproceso que 
// almacena valores de 11 a 20 en ubicacionCompartida.
import javax.swing.*;

public class Productor extends Thread {
   private Bufer ubicacionCompartida;
   private JTextArea areaSalida;
    
   // constructor
   public Productor( Bufer compartido, JTextArea salida )
   {
      super( "Productor" );
      ubicacionCompartida = compartido;
      areaSalida = salida;
   }
    
   // almacenar valores de 11 a 20 en el búfer de ubicacionCompartida
   public void run()
   {
      for ( int cuenta = 11; cuenta <= 20; cuenta ++ ) {
        
         // estar inactivo de 0 a 3 segundos, después colocar valor en Bufer
         try {
            Thread.sleep( ( int ) ( Math.random() * 3000 ) );
            ubicacionCompartida.establecer( cuenta );
         }

         // si se interrumpió el subproceso inactivo, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion ) {
            excepcion.printStackTrace();
         }
      }
        
      String nombre = getName();
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, "\n" + 
         nombre + " terminó de producir.\n" + nombre + " terminado.\n" ) );
        
   } // fin del método run
    
} // fin de la clase Productor


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
