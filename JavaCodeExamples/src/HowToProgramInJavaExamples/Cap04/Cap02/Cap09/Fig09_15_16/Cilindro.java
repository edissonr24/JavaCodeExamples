// Fig. 9.15: Cilindro.java
// Clase Cilindro que hereda de Circulo4.
  
public class Cilindro extends Circulo4 {
    private double altura;  // altura de Cilindro
 
    // constructor sin argumentos
    public Cilindro()
    {
       // la llamada implícita al constructor de Circulo4 ocurre aquí
    } 
  
    // constructor
    public Cilindro( int valorX, int valorY, double valorRadio,
       double valorAltura )
    {
       super( valorX, valorY, valorRadio ); // llamar al constructor de Circulo4
       establecerAltura( valorAltura );
    } 
  
    // establecer la altura del Cilindro
    public void establecerAltura( double valorAltura )
    {
       altura = ( valorAltura < 0.0 ? 0.0 : valorAltura );
    } 

    // obtener la altura del Cilindro
    public double obtenerAltura()
    {
       return altura;
    } 

    // sobrescribir al método obtenerArea de Circulo4 para calcular área del Cilindro
    public double obtenerArea()
    {
       return 2 * super.obtenerArea() + obtenerCircunferencia() * obtenerAltura();
    } 

    // calcular el volumen del Cilindro
    public double obtenerVolumen()
    {
       return super.obtenerArea() * obtenerAltura();
    } 
  
    // devolver la representación String del objeto Cilindro
    public String toString()
    {
       return super.toString() + "; Altura = " + obtenerAltura();
    } 
	
} // fin de la clase Cilindro
