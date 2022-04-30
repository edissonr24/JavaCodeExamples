// Fig. 9.17: Punto.java
// La declaraci�n de la clase Punto representa un par de coordenadas x-y.

public class Punto {
    private int x;  // parte x del par de coordenadas
    private int y;  // parte y del par de coordenadas

    // constructor sin argumentos
    public Punto()
    {
       // la llamada impl�cita al constructor de Object ocurre aqu�
       System.out.println( "Constructor sin argumentos de Punto: " + this );
    } 

    // constructor
    public Punto( int valorX, int valorY )
    {
       // la llamada impl�cita al constructor de Object ocurre aqu�
       x = valorX;  // no hay necesidad de validaci�n
       y = valorY;  // no hay necesidad de validaci�n

       System.out.println( "Constructor de Punto: " + this );
    } 

    // finalizador
    protected void finalize()
    {
       System.out.println( "Finalizador de Punto: " + this );
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
       return "[" + obtenerX() + ", " + obtenerY() + "]";
    } 

} // fin de la clase Punto
