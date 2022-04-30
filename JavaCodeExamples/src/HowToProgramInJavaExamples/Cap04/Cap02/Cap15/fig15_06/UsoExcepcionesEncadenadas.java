// Fig. 15.6: UsoExcepcionesEncadenadas.java
// Demostración de las excepciones encadenadas.
public class UsoExcepcionesEncadenadas {

   public static void main( String args[] )
   {
      try { 
         metodo1(); // llamar a metodo1
      }

      // atrapar las excepciones lanzadas desde metodo1
      catch ( Exception excepcion ) { 
         excepcion.printStackTrace();
      }
   }

   // llamar al metodo2; lanzar excepciones de vuelta a main
   public static void metodo1() throws Exception
   {
      try { 
         metodo2(); // llamar a metodo2
      }

      // atrapar la excepción lanzada desde metodo2
      catch ( Exception excepcion ) {
         throw new Exception( "Excepcion lanzada en metodo1", excepcion );
      }
   }

   // llamar a metodo3; lanzar excepciones de vuelta a metodo1
   public static void metodo2() throws Exception
   {
      try { 
         metodo3(); // llamar a metodo3
      }

      // atrapar la excepción lanzada desde metodo3
      catch ( Exception excepcion ) {
         throw new Exception( "Excepcion lanzada en metodo2", excepcion );
      }
   }

   // lanzar excepción de vuelta a metodo2
   public static void metodo3() throws Exception
   {
      throw new Exception( "Excepcion lanzada en metodo3" );
   }

} // fin de la clase UsoExcepcionesEncadenadas

