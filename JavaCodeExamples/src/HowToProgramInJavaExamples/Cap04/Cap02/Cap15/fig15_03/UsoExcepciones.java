// Fig. 15.3: UsoExcepciones.java
// Demostraci�n del mecanismo try-catch-finally para manejar excepciones.
public class UsoExcepciones {

   public static void main( String args[] )
   {
      try { 
         lanzarExcepcion(); // llamar al m�todo lanzarExcepcion
      }

      // atrapar excepciones lanzadas por el m�todo lanzarExcepcion
      catch ( Exception excepcion ) {
         System.err.println( "La excepcion se manejo en main" );
      }

      noLanzaExcepcion();
   }

   // demostrar try/catch/finally
   public static void lanzarExcepcion() throws Exception
   {
      // lanzar una excepci�n y atraparla inmediatamente
      try { 
         System.out.println( "El metodo lanzarExcepcion" );
         throw new Exception();  // generar excepci�n
      }

      // atrapar la excepci�n lanzada en el bloque try
      catch ( Exception excepcion ) {
         System.err.println(
            "La excepcion se manejo en el metodo lanzarExcepcion" );
         throw excepcion;  // volver a lanzar para procesarla posteriormente

         // cualquier c�digo aqu� no llegar�a a ejecutarse
      }

      // este bloque se ejecuta, sin importar lo que ocurra en try/catch
      finally {
         System.err.println( "Finalmente se ejecuto en lanzarExcepcion" );
      }

      // cualquier c�digo aqu� no llegar�a a ejecutarse

   } // fin del m�todo lanzarExcepcion

   // demostrar finally cuando no ocurre excepci�n
   public static void noLanzaExcepcion()
   {
      // el bloque try no lanza una excepci�n
      try { 
         System.out.println( "El metodo noLanzaExcepcion" );
      }

      // catch no se ejecuta, porque no se lanz� una excepci�n
      catch( Exception excepcion ) {
         System.err.println( excepcion );
      }

      // la cl�usula this se ejecuta, sin importar lo que ocurra en try/catch
      finally {
         System.err.println( 
            "Finalmente se ejecuto en noLanzaExcepcion" );
      }

      System.out.println( "Fin del metodo noLanzaExcepcion" );

   } // fin del m�todo noLanzaExcepcion

} // fin de la clase UsoExcepciones

