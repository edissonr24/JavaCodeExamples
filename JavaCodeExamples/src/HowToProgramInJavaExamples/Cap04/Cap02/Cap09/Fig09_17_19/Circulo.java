// Fig. 9.18: Circulo.java
// Declaraci�n de la clase Circulo.

public class Circulo extends Punto {

   private double radio;  // el radio del Circulo

   // constructor sin argumentos
   public Circulo()
    {
       // la llamada impl�cita al constructor de Punto ocurre aqu�
       System.out.println( "Constructor sin argumentos de Circulo: " + this );
    } 
  
    // constructor
    public Circulo( int valorX, int valorY, double valorRadio )
    {
       super( valorX, valorY );  // llamar al constructor de Punto
       establecerRadio( valorRadio );

       System.out.println( "Constructor de Circulo: " + this );
    } 

    // finalizador
    protected void finalize()
    {
       System.out.println( "Finalizador de Circulo: " + this );
 
       super.finalize();  // llamar al m�todo finalize de la superclase
    }
   
    // establecer el radio
    public void establecerRadio( double valorRadio )
    {
       radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
    } 
  
    // devolver el radio
    public double obtenerRadio()
    {
       return radio;
    } 

    // calcular y devolver el di�metro
    public double obtenerDiametro()
    {
       return 2 * obtenerRadio();
    } 

    // calcular y devolver la circunferencia
    public double obtenerCircunferencia()
    {
       return Math.PI * obtenerDiametro();
    } 

    // calcular y devolver el �rea
    public double obtenerArea()
    {
       return Math.PI * obtenerRadio() * obtenerRadio();
    } 
 
    // devolver la representaci�n String del objeto Circulo
    public String toString()
    {
       return "Centro = " + super.toString() + "; Radio = " + obtenerRadio();
    } 

} // fin de la clase Circulo
