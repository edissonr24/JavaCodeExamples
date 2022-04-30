package T08_EstructurasDeDatos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej02_ArrayExample {
	
	public static void main( String args[]) {
	      int arreglo[];            // declarar la referencia a un arreglo

	      arreglo = new int[ 10 ];  // crear el arreglo

	      String salida = "Índice\tValor\n";
	   
	      // anexar el valor de cada elemento del arreglo al String salida
	      for ( int contador = 0; contador < arreglo.length; contador++ )
	         salida += contador + "\t" + arreglo[ contador ] + "\n";

	      JTextArea areaSalida = new JTextArea();
	      areaSalida.setText( salida );

	      JOptionPane.showMessageDialog( null, areaSalida,
	         "Inicialización de un arreglo de valores int",
	         JOptionPane.INFORMATION_MESSAGE );

	      System.exit( 0 );

	   } // fin de main

}
