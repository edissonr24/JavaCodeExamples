// Fig. 15.4: UsoExcepciones.java
// Demostración de la limpieza de la pila.
public class UsoExcepciones {

   public static void main( String args[] )
   {
      // llamar a lanzaExcepcion para demostrar la limpieza de la pila
      try { 
         lanzaExcepcion();
      }

      // atrapar excepción lanzada en lanzaExcepcion
      catch ( Exception excepcion ) {
         System.err.println( "La excepcion se manejo en main" );
      }
   }

   // lanzaExcepcion lanza la excepción que no es atrapada en este método
   public static void lanzaExcepcion() throws Exception
   {
      // lanzar una excepción y atraparla en main
      try { 
         System.out.println( "El metodo lanzaExcepcion" );
         throw new Exception();      // generar excepción
      }

      // catch es del tipo incorrecto, por lo que la excepción no es atrapada
      catch( RuntimeException excepcionTiempoEjecucion ) {
         System.err.println( 
            "La excepcion se manejo en el metodo lanzaExcepcion" );
      }

      // la cláusula finally siempre se ejecuta 
      finally { 
         System.err.println( "Finally siempre se ejecuta" );
      }

   } // fin del método lanzaExcepcion

} // fin de la clase UsoExcepciones

