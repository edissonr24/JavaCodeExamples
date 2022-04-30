// Fig. 16.14: BuferCircular.java
// BuferCircular sincroniza el acceso a un arreglo de b�feres compartidos.
import javax.swing.*;

public class BuferCircular implements Bufer {

   // cada elemento del arreglo es un b�fer 
   private int buferes[] = { -1, -1, -1 };
    
   // cuentaBuferesOcupados mantiene la cuenta de b�feres ocupados
   private int cuentaBuferesOcupados = 0;
    
   // variables que mantienen las ubicaciones de lectura y escritura en el b�fer
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
      // obtener nombre del subproceso que llam� a este m�todo, para mostrarlo en pantalla
      String nombre = Thread.currentThread().getName();

      // mientras no haya ubicaciones vac�as, colocar subproceso en estado de espera
      while ( cuentaBuferesOcupados == buferes.length ) {
         
         // mostrar informaci�n de subproceso y de bufer, despu�s esperar
         try {
            SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
               "\nTodos los b�feres llenos. " + nombre + " espera." ) );                
            wait();
         }

         // si se interrumpi� el proceso en espera, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion )
         {
            excepcion.printStackTrace();
         }

      } // fin de  instrucci�n while
        
      // colocar valor en ubicacionEscritura de b�feres
      buferes[ ubicacionEscritura ] = valor;
        
      // actualizar componente de la GUI de Swing con el valor producido
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         "\n" + nombre + " escribe " + buferes[ ubicacionEscritura ] + " ") );
        
      // acaba de producir un valor, por lo que se incrementa el n�mero de b�feres ocupados
      ++cuentaBuferesOcupados;
        
      // actualizar ubicacionEscritura para la siguiente operaci�n de escritura
      ubicacionEscritura = ( ubicacionEscritura + 1 ) % buferes.length;
        
      // mostrar contenido de b�feres compartidos
      SwingUtilities.invokeLater( new SalidaRunnable( 
         areaSalida, crearSalidaEstado() ) );
        
      notify(); // regresar el subproceso en espera (si hay uno) al estado listo
        
   } // fin del m�todo establecer
   
   // devolver valor de bufer
   public synchronized int obtener()
   {  
      // obtener nombre del subproceso que llam� a este m�todo, para mostrarlo en pantalla
      String nombre = Thread.currentThread().getName();

      // mientras no haya datos que leer, colocar el subproceso en estado de espera
      while ( cuentaBuferesOcupados == 0 ) {
        
         // mostrar informaci�n de subproceso y de bufer, despu�s esperar
         try {
            SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
               "\nTodos los b�feres vacios. " + nombre + " espera.") );
            wait();
         }
            
         // si se interrumpi� el subproceso en espera, imprimir el rastreo de la pila
         catch ( InterruptedException excepcion ) {
            excepcion.printStackTrace();
         }

      } // fin de instrucci�n while
        
      // obtener valor en ubicacionLectura actual
      int valorLectura = buferes[ ubicacionLectura ];
        
      // actualizar componente de la GUI de Swing con el valor consumido
      SwingUtilities.invokeLater( new SalidaRunnable( areaSalida, 
         "\n" + nombre + " lee " + valorLectura + " ") );
        
      // acaba de consumir un valor, por lo que se decrementa el n�mero de b�feres ocupados
      --cuentaBuferesOcupados;
        
      // actualizar ubicacionLectura para la siguiente operaci�n de lectura
      ubicacionLectura = ( ubicacionLectura + 1 ) % buferes.length;

      // mostrar contenido de b�feres compartidos
      SwingUtilities.invokeLater( new SalidaRunnable( 
         areaSalida, crearSalidaEstado() ) );
             
      notify(); // regresar el subproceso en espera (si hay uno) al estado listo
        
      return valorLectura;
        
   } // fin del m�todo obtener
    
   // crear salida de estado
   public String crearSalidaEstado()
   {
      // primera l�nea de informaci�n de estado
      String salida = 
         "(b�feres ocupados: " + cuentaBuferesOcupados + ")\nb�feres: ";

      for ( int i = 0; i < buferes.length; i++ )
         salida += " " + buferes[ i ] + "  ";

      // segunda l�nea de informaci�n de estado
      salida += "\n         ";

      for ( int i = 0; i < buferes.length; i++ )
         salida += "---- ";

      // tercera l�nea de informaci�n de estado
      salida += "\n         ";

      // anexar indicadores de ubicacionLectura (L) y ubicacionEscritura (E)
      // debajo de las ubicaciones de b�fer apropiadas
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

   } // fin del m�todo crearSalidaEstado
    
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