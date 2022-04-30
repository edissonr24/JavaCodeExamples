// Fig. 9.12: Punto3.java
// La declaración de la clase Punto representa un par de coordenadas x-y.

public class Punto3 {
   private int x;  // parte x de un par de coordenadas
   private int y;  // parte y de un par de coordenadas

   // constructor sin argumentos
   public Punto3()
   {
       // la llamada implícita al constructor de Object ocurre aquí
   } 
 
   // constructor
   public Punto3( int valorX, int valorY )
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

   // devolver x del par de coordenadas
   public int obtenerX()
   {
      return x;
   } 

   // establecer y en el par de coordenadas
   public void establecerY( int valorY )
   {
      y = valorY;  // no hay necesidad de validación
   } 

   // devolver y del par de coordenadas
   public int obtenerY()
   {
      return y;
   } 

   // devolver la representación String del objeto Punto3
   public String toString()
   {
      return "[" + obtenerX() + ", " + obtenerY() + "]";
   } 
  
} // fin de la clase Punto3
