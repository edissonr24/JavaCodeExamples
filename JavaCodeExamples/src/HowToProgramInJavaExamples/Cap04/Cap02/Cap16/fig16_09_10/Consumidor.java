// Fig. 16.6: Consumidor.java
// El método run de Consumidor controla un subproceso que itera cuatro
// veces y lee un valor de ubicacionCompartida cada vez.

public class Consumidor extends Thread { 
   private Bufer ubicacionCompartida; // referencia al objeto compartido

   // constructor
   public Consumidor( Bufer compartido )
   {
      super( "Consumidor" );
      ubicacionCompartida = compartido;
   }

   // leer el valor de ubicacionCompartida cuatro veces y sumar los valores
   public void run()
   {
      int suma = 0;

      for ( int cuenta = 1; cuenta <= 4; cuenta++ ) {
         
         // estar inactivo de 0 a 3 segundos, leer un valor de Bufer y agregarlo a suma
         try {
            Thread.sleep( ( int ) ( Math.random() * 3001 ) );    
            suma += ubicacionCompartida.obtener();
         }

         // si se interrumpió el subproceso inactivo, imprimir rastreo de la 
         catch ( InterruptedException excepcion ) {
            excepcion.printStackTrace();
         }
      }

      System.err.println( getName() + " leyo valores, dando un total de: " + suma + 
         ".\nTerminando " + getName() + ".");

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