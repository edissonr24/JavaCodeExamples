// Fig. 9.9: Punto2.java
// La declaraci�n de la clase Punto2 representa un par de coordenadas x-y.

public class Punto2 {
    protected int x; // parte x de un par de coordenadas
    protected int y; // parte y de un par de coordenadas

    // constructor sin argumentos
    public Punto2()
    {
       // la llamada impl�cita al constructor de Object ocurre aqu�
    } 
 
    // constructor
    public Punto2( int valorX, int valorY )
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

    // devolver x del par de coordenadas
    public int obtenerX()
    {
       return x;
    } 

    // establecer y en el par de coordenadas
    public void establecerY( int valorY )
    {
       y = valorY;  // no hay necesidad de validaci�n
    } 

    // devolver y del par de coordenadas
    public int obtenerY()
    {
       return y;
    } 

    // devolver la representaci�n String del objeto Punto
    public String toString()
    {
       return "[" + x + ", " + y + "]";
     } 

} // fin de la clase Punto2
