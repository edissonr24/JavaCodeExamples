// Fig. 9.4: Punto.java
// La declaración de la clase Punto representa un par de coordenadas x-y.

public class Punto {
   private int x; // parte x de un par de coordenadas
   private int y; // parte y de un par de coordenadas

   // constructor sin argumentos
   public Punto()
    {
       // la llamada implícita al constructor de Object ocurre aquí
    } 

    // constructor
    public Punto( int valorX, int valorY )
    {
       // la llamada implícita al constructor de Object ocurre aquí
       x = valorX;  // no hay necesidad de validación
       y = valorY;  // no hay necesidad de validación
    } 
 
    // establecer x en el par de coordenadas
    public void establecerX( int valorX )
    {
       x = valorX;  // no hay necesidad de validación
    } 
 
    // devuelve x del par de coordenadas
    public int obtenerX()
    {
       return x;
    } 

    // establecer y en el par de coordenadas
    public void establecerY( int valorY )
    {
       y = valorY;  // no hay necesidad de validación
    } 

    // devuelve y del par de coordenadas
    public int obtenerY()
    {
       return y;
    } 

    // devuelve la representación String del objeto Punto
    public String toString()
    {
      return "[" + x + ", " + y + "]";
    } 
  
} // fin de la clase Punto

