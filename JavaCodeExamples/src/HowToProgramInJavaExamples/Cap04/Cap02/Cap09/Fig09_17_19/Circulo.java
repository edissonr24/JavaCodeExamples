// Fig. 9.18: Circulo.java
// Declaración de la clase Circulo.

public class Circulo extends Punto {

   private double radio;  // el radio del Circulo

   // constructor sin argumentos
   public Circulo()
    {
       // la llamada implícita al constructor de Punto ocurre aquí
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
 
       super.finalize();  // llamar al método finalize de la superclase
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

    // calcular y devolver el diámetro
    public double obtenerDiametro()
    {
       return 2 * obtenerRadio();
    } 

    // calcular y devolver la circunferencia
    public double obtenerCircunferencia()
    {
       return Math.PI * obtenerDiametro();
    } 

    // calcular y devolver el área
    public double obtenerArea()
    {
       return Math.PI * obtenerRadio() * obtenerRadio();
    } 
 
    // devolver la representación String del objeto Circulo
    public String toString()
    {
       return "Centro = " + super.toString() + "; Radio = " + obtenerRadio();
    } 

} // fin de la clase Circulo
