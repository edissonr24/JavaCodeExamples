// Fig. 16.10: PruebaBuferCompartido2.java
// PruebaBuferCompartido2 crea los subprocesos productor y consumidor.

public class PruebaBuferCompartido2 {

   public static void main( String [] args )
   {
      // crear objeto compartido utilizado por los subprocesos; usar una referencia
      // BuferSincronizado en vez de una referencia Bufer, para que podamos invocar  
      // al método mostrarEstado de BuferSincronizado desde main
      BuferSincronizado ubicacionCompartida = new BuferSincronizado();
        
      // Mostrar encabezados de columna para los resultados
      StringBuffer encabezadosColumna = new StringBuffer( "Operacion" );
      encabezadosColumna.setLength( 40 );
      encabezadosColumna.append( "Bufer\t\tCuenta ocupado" );
      System.err.println( encabezadosColumna );
      System.err.println();
      ubicacionCompartida.mostrarEstado( "Estado inicial" );
        
      // crear objetos productor y consumidor
      Productor productor = new Productor( ubicacionCompartida );
      Consumidor consumidor = new Consumidor( ubicacionCompartida );
        
      productor.start();  // iniciar subproceso productor
      consumidor.start();  // iniciar subproceso consumidor
        
   } // fin de main
    
} // fin de la clase PruebaBuferCompartido2


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
