// Fig. 15.4: UsoExcepciones.java
// Demostraci�n de la limpieza de la pila.
public class UsoExcepciones {

   public static void main( String args[] )
   {
      // llamar a lanzaExcepcion para demostrar la limpieza de la pila
      try { 
         lanzaExcepcion();
      }

      // atrapar excepci�n lanzada en lanzaExcepcion
      catch ( Exception excepcion ) {
         System.err.println( "La excepcion se manejo en main" );
      }
   }

   // lanzaExcepcion lanza la excepci�n que no es atrapada en este m�todo
   public static void lanzaExcepcion() throws Exception
   {
      // lanzar una excepci�n y atraparla en main
      try { 
         System.out.println( "El metodo lanzaExcepcion" );
         throw new Exception();      // generar excepci�n
      }

      // catch es del tipo incorrecto, por lo que la excepci�n no es atrapada
      catch( RuntimeException excepcionTiempoEjecucion ) {
         System.err.println( 
            "La excepcion se manejo en el metodo lanzaExcepcion" );
      }

      // la cl�usula finally siempre se ejecuta 
      finally { 
         System.err.println( "Finally siempre se ejecuta" );
      }

   } // fin del m�todo lanzaExcepcion

} // fin de la clase UsoExcepciones

