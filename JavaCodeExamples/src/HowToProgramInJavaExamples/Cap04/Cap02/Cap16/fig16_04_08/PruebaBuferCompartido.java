// Fig. 16.8: PruebaBuferCompartido.java
// PruebaBuferCompartido crea los subprocesos productor y consumidor.

public class PruebaBuferCompartido {

    public static void main( String [] args )
    {
        // crear el objeto compartido utilizado por los subprocesos
        Bufer ubicacionCompartida = new BuferNoSincronizado();

        // crear objetos productor y consumidor
        Productor productor = new Productor( ubicacionCompartida );
        Consumidor consumidor = new Consumidor( ubicacionCompartida );

        productor.start();  // iniciar subproceso productor
        consumidor.start();  // iniciar subproceso consumidor

    } // fin de main

} // fin de la clase PruebaBuferCompartido



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
