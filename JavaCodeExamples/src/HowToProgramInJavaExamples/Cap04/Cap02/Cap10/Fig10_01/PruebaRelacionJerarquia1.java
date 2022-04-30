package Cap10.Fig10_01;

// Fig. 10.1: PruebaRelacionJerarquia1.java
// Asignación de referencias de superclases y subclases a variables tipo
// superclase y subclase.
import javax.swing.JOptionPane;

public class PruebaRelacionJerarquia1 { 

   public static void main( String[] args ) 
   {
      // asignar a la variable tipo superclase, la referencia a la superclase
      Punto3 punto = new Punto3( 30, 50 );                      

      // asignar a la referencia de la subclase, la variable tipo subclase
      Circulo4 circulo = new Circulo4( 120, 89, 2.7 );         

      // invocar a toString en objeto de superclase usando variable de superclase
      String salida = "Llamar a toString de Punto3 con la referencia a la" +
         " superclase apuntando al objeto de la superclase: \n" + punto.toString();

      // invocar a toString en objeto de subclase usando variable de subclase      
      salida += "\n\nLlamar a toString de Circulo4 con la referencia a la" +
         " subclase apuntando al objeto de la subclase: \n" + circulo.toString();

      // invocar a toString en objeto de subclase utilizando variable de superclase
      Punto3 refPunto = circulo; 
      salida += "\n\nLlamar a toString de Circulo4 con la referencia a la" +
         " superclase apuntando al objeto de la subclase: \n" + refPunto.toString();

      JOptionPane.showMessageDialog( null, salida );  // mostrar la salida

      System.exit( 0 );

   } // fin de main

} // fin de la clase PruebaRelacionJerarquia1

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
