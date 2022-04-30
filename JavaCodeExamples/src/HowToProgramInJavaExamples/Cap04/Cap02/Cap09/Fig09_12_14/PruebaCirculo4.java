// Fig. 9.14: PruebaCirculo4.java
// Prueba de la clase Circulo4.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
  
public class PruebaCirculo4 {
 
   public static void main( String[] args ) 
   {
       // crear instancia de objeto Circulo
       Circulo4 circulo = new Circulo4( 37, 43, 2.5 ); 

       // obtener las coordenadas x-y y radio iniciales de Circulo4
       String salida = "La coordenada X es " + circulo.obtenerX() +
          "\nLa coordenada Y es " + circulo.obtenerY() +
          "\nEl radio es " + circulo.obtenerRadio();
  
       circulo.establecerX( 35 );         // establecer la nueva coordenada x
       circulo.establecerY( 20 );         // establecer la nueva coordenada y
       circulo.establecerRadio( 4.25 );  // establecer el nuevo radio

       // obtener la representaci�n String del nuevo valor de circulo
       salida += "\n\nLa nueva ubicaci�n y radio de circulo son\n" +
          circulo.toString();
  
       // dar formato a los valores de punto decimal con 2 d�gitos de precisi�n
       DecimalFormat dosDigitos = new DecimalFormat( "0.00" );
 
       // obtener el di�metro del Circulo
 	  salida += "\nEl di�metro es " + 
          dosDigitos.format( circulo.obtenerDiametro() );
  
       // obtener la circunferencia del Circulo
       salida += "\nLa circunferencia es " +
          dosDigitos.format( circulo.obtenerCircunferencia() );

       // obtener el �rea de Circulo
       salida += "\nEl �rea es " + dosDigitos.format( circulo.obtenerArea() );

       JOptionPane.showMessageDialog( null, salida ); // mostrar resultados
 
       System.exit( 0 );
  
    } // fin de main

} // fin de la clase PruebaCirculo4

