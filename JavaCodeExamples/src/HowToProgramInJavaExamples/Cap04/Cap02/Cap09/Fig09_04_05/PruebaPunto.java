// Fig. 9.5: PruebaPunto.java
// Prueba de la clase Punto.
import javax.swing.JOptionPane;

public class PruebaPunto {

   public static void main( String[] args ) 
   {
      Punto punto = new Punto( 72, 115 );  // crea objeto Punto

       // obtener las coordenadas del punto
       String salida = "La coordenada X es " + punto.obtenerX() +
          "\nLa coordenada Y es " + punto.obtenerY();
     
       punto.establecerX( 10 );  // establecer la coordenada x
       punto.establecerY( 20 );  // establecer la coordenada y

       // obtener la representación String del nuevo valor de punto
       salida += "\n\nLa nueva ubicación de punto es " + punto.toString();

       JOptionPane.showMessageDialog( null, salida ); // mostrar resultados

       System.exit( 0 );

    } // fin de main

} // fin de la clase PruebaPunto
