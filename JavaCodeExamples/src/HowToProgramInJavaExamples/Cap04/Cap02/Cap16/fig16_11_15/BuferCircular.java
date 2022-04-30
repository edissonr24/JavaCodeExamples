// Fig. 16.14: BuferCircular.java
// BuferCircular sincroniza el acceso a un arreglo de búferes compartidos.
import javax.swing.*;

public class BuferCircular implements Bufer {

   // cada elemento del arreglo es un búfer 
   private int buferes[] = { -1, -1, -1 };
    
   // cuentaBuferesOcupados mantiene la cuenta de búferes ocupados
   private int cuentaBuferesOcupados = 0;
    
   // variables que mantienen las ubicaciones de lectura y escritura en el búfer
   private int ubicacionLectura = 0, ubicacionEscritura = 0;
    
   // referencia al componente de la GUI que muestra la salida
   private JTextArea areaSalida;
    
   // constructor
   public BuferCircular( JTextArea salida )
   {
      areaSalida = salida;
   }
   
   // colocar valor en bufer
   public synchronized void establecer( int valor )
   {
      // obtener nombre del subproceso que llamó a este método, para mostrarlo en pantalla
      String nombre = Thread.currentThread().getName();

      // mientras no haya ubicaciones vacías, colocar subproceso en estado de espera
      while ( cuentaBuferesOcupados == buferes.length ) {
         
         // mostrar información de subproceso y de bufer, después esperar
         try {
            SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
               "\nTodos los búferes llenos. " + nombre + " espera." ) );                
            wait();
         }

         // si se interrumpió el proceso en espera, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion )
         {
            excepcion.printStackTrace();
         }

      } // fin de  instrucción while
        
      // colocar valor en ubicacionEscritura de búferes
      buferes[ ubicacionEscritura ] = valor;
        
      // actualizar componente de la GUI de Swing con el valor producido
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         "\n" + nombre + " escribe " + buferes[ ubicacionEscritura ] + " ") );
        
      // acaba de producir un valor, por lo que se incrementa el número de búferes ocupados
      ++cuentaBuferesOcupados;
        
      // actualizar ubicacionEscritura para la siguiente operación de escritura
      ubicacionEscritura = ( ubicacionEscritura + 1 ) % buferes.length;
        
      // mostrar contenido de búferes compartidos
      SwingUtilities.invokeLater( new SalidaRunnable( 
         areaSalida, crearSalidaEstado() ) );
        
      notify(); // regresar el subproceso en espera (si hay uno) al estado listo
        
   } // fin del método establecer
   
   // devolver valor de bufer
   public synchronized int obtener()
   {  
      // obtener nombre del subproceso que llamó a este método, para mostrarlo en pantalla
      String nombre = Thread.currentThread().getName();

      // mientras no haya datos que leer, colocar el subproceso en estado de espera
      while ( cuentaBuferesOcupados == 0 ) {
        
         // mostrar información de subproceso y de bufer, después esperar
         try {
            SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
               "\nTodos los búferes vacios. " + nombre + " espera.") );
            wait();
         }
            
         // si se interrumpió el subproceso en espera, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion ) {
            excepcion.printStackTrace();
         }

      } // fin de instrucción while
        
      // obtener valor en ubicacionLectura actual
      int valorLectura = buferes[ ubicacionLectura ];
        
      // actualizar componente de la GUI de Swing con el valor consumido
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         "\n" + nombre + " lee " + valorLectura + " ") );
        
      // acaba de consumir un valor, por lo que se decrementa el número de búferes ocupados
      --cuentaBuferesOcupados;
        
      // actualizar ubicacionLectura para la siguiente operación de lectura
      ubicacionLectura = ( ubicacionLectura + 1 ) % buferes.length;

      // mostrar contenido de búferes compartidos
      SwingUtilities.invokeLater( new SalidaRunnable( 
         areaSalida, crearSalidaEstado() ) );
             
      notify(); // regresar el subproceso en espera (si hay uno) al estado listo
        
      return valorLectura;
        
   } // fin del método obtener
    
   // crear salida de estado
   public String crearSalidaEstado()
   {
      // primera línea de información de estado
      String salida = 
         "(búferes ocupados: " + cuentaBuferesOcupados + ")\nbúferes: ";

      for ( int i = 0; i < buferes.length; i++ )
         salida += " " + buferes[ i ] + "  ";

      // segunda línea de información de estado
      salida += "\n         ";

      for ( int i = 0; i < buferes.length; i++ )
         salida += "---- ";

      // tercera línea de información de estado
      salida += "\n         ";

      // anexar indicadores de ubicacionLectura (L) y ubicacionEscritura (E)
      // debajo de las ubicaciones de búfer apropiadas
      for ( int i = 0; i < buferes.length; i++ )

         if ( i == ubicacionEscritura && ubicacionEscritura == ubicacionLectura )
            salida += " EL  ";
         else if ( i == ubicacionEscritura )
            salida += " E   ";
         else if ( i == ubicacionLectura )
            salida += "  L  ";
         else 
            salida += "     ";

      salida += "\n";

      return salida;

   } // fin del método crearSalidaEstado
    
} // fin de la clase BuferCircular



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