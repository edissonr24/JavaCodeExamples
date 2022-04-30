// Fig. 9.4: Punto.java
// La declaraci�n de la clase Punto representa un par de coordenadas x-y.

public class Punto {
   private int x; // parte x de un par de coordenadas
   private int y; // parte y de un par de coordenadas

   // constructor sin argumentos
   public Punto()
    {
       // la llamada impl�cita al constructor de Object ocurre aqu�
    } 

    // constructor
    public Punto( int valorX, int valorY )
    {
       // la llamada impl�cita al constructor de Object ocurre aqu�
       x = valorX;  // no hay necesidad de validaci�n
       y = valorY;  // no hay necesidad de validaci�n
    } 
 
    // establecer x en el par de coordenadas
    public void establecerX( int valorX )
    {
       x = valorX;  // no hay necesidad de validaci�n
    } 
 
    // devuelve x del par de coordenadas
    public int obtenerX()
    {
       return x;
    } 

    // establecer y en el par de coordenadas
    public void establecerY( int valorY )
    {
       y = valorY;  // no hay necesidad de validaci�n
    } 

    // devuelve y del par de coordenadas
    public int obtenerY()
    {
       return y;
    } 

    // devuelve la representaci�n String del objeto Punto
    public String toString()
    {
      return "[" + x + ", " + y + "]";
    } 
  
} // fin de la clase Punto

