package Cap09.Fig09_06_07;

// Fig. 9.7: PruebaCirculo.java
// Prueba de la clase Circulo.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
 
public class PruebaCirculo {

   public static void main( String[] args ) 
   {
       Circulo circulo = new Circulo( 37, 43, 2.5 ); // crea el objeto Circulo

       // obtener las coordenadas x-y y radio iniciales de Circulo
       String salida = "La coordenada X es " + circulo.obtenerX() + 
          "\nLa coordenada Y es " + circulo.obtenerY() + 
          "\nEl radio es " + circulo.obtenerRadio();

       circulo.establecerX( 35 );         // establecer la nueva coordenada x
       circulo.establecerY( 20 );         // establecer la nueva coordenada y
       circulo.establecerRadio( 4.25 );  // establecer el nuevo radio

       // obtener la representación String del nuevo valor de circulo
       salida += "\n\nLa nueva ubicación y el radio del círculo son\n" +
          circulo.toString();
  
       // da formato a los valores de punto flotante con 2 dígitos de precisión
       DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

       // obtener el diámetro del Circulo
 	   salida += "\nEl diámetro es " + 
          dosDigitos.format( circulo.obtenerDiametro() );
 
       // obtener la circunferencia del Circulo
       salida += "\nLa circunferencia es " +
          dosDigitos.format( circulo.obtenerCircunferencia() );
 
       // obtener el área del Circulo
       salida += "\nEl área es " + dosDigitos.format( circulo.obtenerArea() );

       JOptionPane.showMessageDialog( null, salida ); // muestra la salida
  
       System.exit( 0 );

    } // fin de main

} // fin de la clase PruebaCirculo
