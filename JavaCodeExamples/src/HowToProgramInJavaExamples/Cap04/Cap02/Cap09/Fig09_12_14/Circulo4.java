// Fig. 9.13: Circulo4.java
// La clase Circulo4 hereda de Punto3 y accede a las variables x e y
// de Punto 3 mediante los métodos public de Punto3.

public class Circulo4 extends Punto3 {

   private double radio;  // El radio de Circulo4

   // constructor sin argumentos
   public Circulo4()
   {
      // La llamada implícita al constructor de Punto3 ocurre aquí
   } 
    
   // constructor
   public Circulo4( int valorX, int valorY, double valorRadio )
   {
      super( valorX, valorY );  // llamar explícitamente al constructor de Punto3
      establecerRadio( valorRadio );
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

   // devolver la representación String del objeto Circulo4
   public String toString()
   {
      return "Centro = " + super.toString() + "; Radio = " + obtenerRadio();
   } 

} // fin de la clase Circulo4
