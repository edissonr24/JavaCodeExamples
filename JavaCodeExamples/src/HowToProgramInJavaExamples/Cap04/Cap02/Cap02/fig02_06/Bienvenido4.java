package Cap02.fig02_06;

// Fig. 2.6: Bienvenido4.java
// Imprimir varias l�neas de texto en un cuadro de di�logo.
  
// paquetes de Java
import javax.swing.JOptionPane;  // el programa usa JOptionPane

public class Bienvenido4 {
  
    // el m�todo main empieza la ejecuci�n de la aplicaci�n de Java
    public static void main( String args[] )
    {
       JOptionPane.showMessageDialog( 
          null, "Bienvenido\na\nla programacion\nen Java!" );

       System.exit( 0 );  // terminar la aplicaci�n con la ventana

    } // fin del m�todo main

} // fin de la clase Bienvenido4
