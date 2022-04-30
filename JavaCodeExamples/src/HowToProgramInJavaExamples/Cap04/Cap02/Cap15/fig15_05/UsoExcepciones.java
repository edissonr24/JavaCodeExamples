// Fig. 15.5: UsoExcepciones.java
// Demostración de getMessage y printStackTrace de la clase Exception.
public class UsoExcepciones {

   public static void main( String args[] )
   {
      try { 
         metodo1(); // llamar a metodo1 
      }

      // atrapar las excepciones lanzadas desde metodo1
      catch ( Exception excepcion ) { 
         System.err.println( excepcion.getMessage() + "\n" );
         excepcion.printStackTrace();

         // obtener la información de rastreo de la pila
         StackTraceElement[] elementosRastreo = excepcion.getStackTrace();
         
         System.out.println(  "\nRastreo de pila proveniente de getStackTrace:" );
         System.out.println( "Clase\t\tArchivo\t\t\tLinea\tMetodo" );

         // iterar a través de elementosRastreo para obtener descripción de las excepciones
         for ( int i = 0; i < elementosRastreo.length; i++ ) {
            StackTraceElement elementoActual = elementosRastreo[ i ];
            System.out.print( elementoActual.getClassName() + "\t" );
            System.out.print( elementoActual.getFileName() + "\t" );
            System.out.print( elementoActual.getLineNumber() + "\t" );
            System.out.print( elementoActual.getMethodName() + "\n" );
         
         } // fin de la instrucción for

      } // fin de la instrucción catch

   } // fin del método main

   // llamar a metodo2; lanzar excepciones de vuelta hacia main
   public static void metodo1() throws Exception
   {
      metodo2();
   }

   // llamar al método3; lanzar excepciones de vuelta hacia metodo1
   public static void metodo2() throws Exception
   {
      metodo3();
   }

   // lanzar excepción de vuelta a metodo2
   public static void metodo3() throws Exception
   {
      throw new Exception( "La excepcion se lanzo en metodo3" );
   }

} // fin de la clase UsoExcepciones

