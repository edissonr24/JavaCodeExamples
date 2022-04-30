// Fig. 15.3: UsoExcepciones.java
// Demostración del mecanismo try-catch-finally para manejar excepciones.
public class UsoExcepciones {

   public static void main( String args[] )
   {
      try { 
         lanzarExcepcion(); // llamar al método lanzarExcepcion
      }

      // atrapar excepciones lanzadas por el método lanzarExcepcion
      catch ( Exception excepcion ) {
         System.err.println( "La excepcion se manejo en main" );
      }

      noLanzaExcepcion();
   }

   // demostrar try/catch/finally
   public static void lanzarExcepcion() throws Exception
   {
      // lanzar una excepción y atraparla inmediatamente
      try { 
         System.out.println( "El metodo lanzarExcepcion" );
         throw new Exception();  // generar excepción
      }

      // atrapar la excepción lanzada en el bloque try
      catch ( Exception excepcion ) {
         System.err.println(
            "La excepcion se manejo en el metodo lanzarExcepcion" );
         throw excepcion;  // volver a lanzar para procesarla posteriormente

         // cualquier código aquí no llegaría a ejecutarse
      }

      // este bloque se ejecuta, sin importar lo que ocurra en try/catch
      finally {
         System.err.println( "Finalmente se ejecuto en lanzarExcepcion" );
      }

      // cualquier código aquí no llegaría a ejecutarse

   } // fin del método lanzarExcepcion

   // demostrar finally cuando no ocurre excepción
   public static void noLanzaExcepcion()
   {
      // el bloque try no lanza una excepción
      try { 
         System.out.println( "El metodo noLanzaExcepcion" );
      }

      // catch no se ejecuta, porque no se lanzó una excepción
      catch( Exception excepcion ) {
         System.err.println( excepcion );
      }

      // la cláusula this se ejecuta, sin importar lo que ocurra en try/catch
      finally {
         System.err.println( 
            "Finalmente se ejecuto en noLanzaExcepcion" );
      }

      System.out.println( "Fin del metodo noLanzaExcepcion" );

   } // fin del método noLanzaExcepcion

} // fin de la clase UsoExcepciones

