package Cap09.Fig09_06_07;

// Fig. 9.6: Circulo.java
// La clase Circulo contiene un par de coordenadas x-y y un radio.
 
public class Circulo {
   private int x;          // coordenada x del centro del círculo
   private int y;          // coordenada y del centro del círculo
   private double radio;  // radio del círculo

   // constructor sin argumentos
    public Circulo()
    {
       // la llamada implícita al constructor de Object ocurre aquí
    } 

    // constructor
    public Circulo( int valorX, int valorY, double valorRadio )
    {
       // la llamada implícita al constructor de Object ocurre aquí
       x = valorX;  // no hay necesidad de validación
       y = valorY;  // no hay necesidad de validación
       establecerRadio( valorRadio );
    } 

    // establecer x en el par de coordenadas
    public void establecerX( int valorX )
    {
       x = valorX;  // no hay necesidad de validación
    } 

    // devuelve la x del par de coordenadas
    public int obtenerX()
    {
       return x;
    } 
  
    // establecer y en el par de coordenadas
    public void establecerY( int valorY )
    {
       y = valorY;  // no hay necesidad de validación
    } 

    // devuelve la y del par de coordenadas
    public int obtenerY()
    {
       return y;
    } 
  
    // establecer el radio
    public void establecerRadio( double valorRadio )
    {
       radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
    } 
  
    // devuelve el radio
    public double obtenerRadio()
    {
       return radio;
    } 

    // calcula y devuelve el diámetro
    public double obtenerDiametro()
    {
       return 2 * radio;
    } 

    // calcula y devuelve la circunferencia
    public double obtenerCircunferencia()
    {
       return Math.PI * obtenerDiametro();
    } 

    // calcula y devuelve el área
    public double obtenerArea()
    {
       return Math.PI * radio * radio;
    }

    // devuelve representación String del objeto Circulo
    public String toString()
    {
       return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    } 

} // fin de la clase Circulo
