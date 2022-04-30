// Fig. 9.19: PruebaConstructorFinalizador.java
// Muestra el orden en que se hacen las llamadas a los constructores
// y finalizadores de la superclase y la subclase.

public class PruebaConstructorFinalizador {
 
   public static void main( String args[] )
   {
      Punto punto;
       Circulo circulo1, circulo2;
  
       punto = new Punto( 11, 22 );
 
       System.out.println();
       circulo1 = new Circulo( 72, 29, 4.5 );
  
       System.out.println();
       circulo2 = new Circulo( 5, 7, 10.67 );

       punto = null;    // se marca para la recolección de basura
       circulo1 = null;  // se marca para la recolección de basura
       circulo2 = null;  // se marca para la recolección de basura

       System.out.println();

       System.gc();  // llamar al recolector de basura
  
    } // fin de main
	
} // fin de la clase PruebaConstructorFinalizador
