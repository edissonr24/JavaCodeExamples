// Fig. 9.10: Circulo3.java
// La clase Circulo3 hereda de Punto2 y tiene acceso a los miembros
// protected x e y de Punto2.

public class Circulo3 extends Punto2 {
   private double radio;  // el radio de Circulo3
 
   // constructor sin argumentos
   public Circulo3()
   {
      // la llamada impl�cita al constructor de Punto2 ocurre aqu�
   } 
     
   // constructor
   public Circulo3( int valorX, int valorY, double valorRadio )
   {
       // la llamada impl�cita al constructor de Punto2 ocurre aqu�
       x = valorX;  // no hay necesidad de validaci�n
       y = valorY;  // no hay necesidad de validaci�n
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
 
    // calcular y devolver el �rea
    public double obtenerArea()
    {
       return Math.PI * radio * radio;
    } 
  
    // devolver la representaci�n String de un objeto Circulo
    public String toString()
    {
       return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    } 
  	
} // fin de la clase Circulo3
