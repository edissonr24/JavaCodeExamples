// Fig. 9.16: PruebaCilindro.java
// Prueba de la clase Cilindro.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
  
public class PruebaCilindro {
  
   public static void main( String[] args ) 
   {
       // crear el objeto Cilindro
       Cilindro cilindro = new Cilindro( 12, 23, 2.5, 5.7 );
 
       // obtener las coordenadas x-y, radio y altura iniciales del Cilindro
       String salida = "La coordenada X es " + cilindro.obtenerX() +
          "\nLa coordenada Y es " + cilindro.obtenerY() + "\nEl radio es " + 
          cilindro.obtenerRadio() + "\nLa altura es " + cilindro.obtenerAltura();
  
       cilindro.establecerX( 35 );          // establecer la nueva coordenada x
       cilindro.establecerY( 20 );          // establecer la nueva coordenada y
       cilindro.establecerRadio( 4.25 );   // establecer el nuevo radio
       cilindro.establecerAltura( 10.75 );  // establecer la nueva altura

       // obtener la representaci�n String del nuevo valor de cilindro
       salida += 
          "\n\nLa nueva ubicaci�n, radio y altura del cilindro son\n" + 
          cilindro.toString();
 
       // dar formato a los valores de punto flotante con 2 d�gitos de precisi�n
       DecimalFormat dosDigitos = new DecimalFormat( "0.00" );

       // obtener el di�metro del Cilindro
       salida += "\n\nEl di�metro es " + 
          dosDigitos.format( cilindro.obtenerDiametro() );

       // obtener la circunferencia del Cilindro
       salida += "\nLa circunferencia es " +
          dosDigitos.format( cilindro.obtenerCircunferencia() );
  
       // obtener el �rea del Cilindro
       salida += "\nEl �rea es " + dosDigitos.format( cilindro.obtenerArea() );

       // obtener el volumen del Cilindro
       salida += "\nEl volumen es " + dosDigitos.format( cilindro.obtenerVolumen() );

       JOptionPane.showMessageDialog( null, salida ); // mostrar resultados

       System.exit( 0 );

    } // fin de main

} // fin de la clase PruebaCilindro
