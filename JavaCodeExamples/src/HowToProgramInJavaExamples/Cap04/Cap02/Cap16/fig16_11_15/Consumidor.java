// Fig. 16.13: Consumidor.java
// El método run de Consumidor controla un subproceso que itera diez
// veces y lee un valor de ubicacionCompartida cada vez.
import javax.swing.*;

public class Consumidor extends Thread {
   private Bufer ubicacionCompartida; // referencia al objeto compartido
   private JTextArea areaSalida;
    
   // constructor
   public Consumidor( Bufer compartido, JTextArea salida )
   {
      super( "Consumidor" );
      ubicacionCompartida = compartido;
      areaSalida = salida;
   }
    
   // leer el valor de ubicacionCompartida diez veces y sumar los valores
   public void run()
   {
      int suma = 0;

      for ( int cuenta = 1; cuenta <= 10; cuenta++ ) {
         
         // estar inactivo de 0 a 3 segundos, leer el valor de Bufer y sumarlo a suma
         try {
            Thread.sleep( ( int ) ( Math.random() * 3001 ) );    
            suma += ubicacionCompartida.obtener();
         }

         // si se interrumpió el subproceso inactivo, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion ) {
            excepcion.printStackTrace();
         }
      }
        
      String nombre = getName();
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         "\nTotal que consumió " + nombre + ": " + suma + ".\n" + 
         nombre + " terminado.\n ") );
        
   } // fin del método run
    
} // fin de la clase Consumidor


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
