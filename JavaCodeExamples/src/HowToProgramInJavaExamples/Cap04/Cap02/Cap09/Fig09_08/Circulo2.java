// Fig. 9.8: Circulo2.java
// La clase Circulo2 hereda de Punto.

public class Circulo2 extends Punto {
   private double radio;  // El radio de Circulo2

   // constructor sin argumentos
   public Circulo2()
   {
       // la llamada impl�cita al constructor de Punto ocurre aqu�
    } 
     
    // constructor
    public Circulo2( int valorX, int valorY, double valorRadio )
    {
       // la llamada impl�cita al constructor de Punto ocurre aqu�
       x = valorX;  // no permitido: x es privada en Punto
       y = valorY;  // no permitido: y es privada en Punto
       establecerRadio( valorRadio );
    } 

    // establecer el radio
    public void establecerRadio( double valorRadio )
    {
       radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
    } 

    // return radio
    public double obtenerRadio()
    {
       return radio;
    } 

    // calcular y devolver el di�metro
    public double obtenerDiametro()
    {
       return 2 * radio;
    } 
    // calcular y devolver la circunferencia
    public double obtenerCircunferencia()
    {
       return Math.PI * obtenerDiametro();
    } 

    // calcular y devuolver el �rea
    public double obtenerArea()
    {
       return Math.PI * radio * radio;
    } 

    // devolver la representaci�n String de un objeto Circulo
    public String toString()
    {
       // uso de x e y no permitido: x e y son privadas en Punto
       return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    } 
 	
} // fin de la clase Circulo2
