// Fig. 15.1: PruebaDivisionEntreCero.java
// Un ejemplo de manejo de excepciones que comprueba la división entre cero.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaDivisionEntreCero extends JFrame
   implements ActionListener {

   private JTextField campoEntrada1, campoEntrada2, campoSalida;
   private int numero1, numero2, resultado;

   // configurar GUI
   public PruebaDivisionEntreCero()
   {
      super( "Demostración de las excepciones" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new GridLayout( 3, 2 ) );

      // establecer etiqueta y campoEntrada1
      contenedor.add(
         new JLabel( "Escriba el numerador ", SwingConstants.RIGHT ) );
      campoEntrada1 = new JTextField();
      contenedor.add( campoEntrada1 );

      // establecer etiqueta y campoEntrada2; registrar componente de escucha
      contenedor.add( new JLabel( "Escriba el denominador y oprima Intro ", 
         SwingConstants.RIGHT ) );
      campoEntrada2 = new JTextField();
      contenedor.add( campoEntrada2 );
      campoEntrada2.addActionListener( this );

      // establecer etiqueta y campoSalida
      contenedor.add( new JLabel( "RESULTADO ", SwingConstants.RIGHT ) );
      campoSalida = new JTextField();
      contenedor.add( campoSalida );

      setSize( 475, 100 );
      setVisible( true );

   } // fin del constructor de PruebaDivisionEntreCero

   // procesar eventos de GUI
   public void actionPerformed( ActionEvent evento )
   {
      campoSalida.setText( "" );   // borrar campoSalida

      // leer dos números y calcular el cociente
      try { 
         numero1 = Integer.parseInt( campoEntrada1.getText() );
         numero2 = Integer.parseInt( campoEntrada2.getText() );

         resultado = cociente( numero1, numero2 );
         campoSalida.setText( String.valueOf( resultado ) );
      }

      // procesar la entrada con formato incorrecto
      catch ( NumberFormatException excepcionFormatoNumero ) {
         JOptionPane.showMessageDialog( this, 
            "Debe escribir dos enteros", "Formato de número inválido",
            JOptionPane.ERROR_MESSAGE );
      }

      // procesar los intentos de dividir entre cero
      catch ( ArithmeticException excepcionAritmetica ) {
         JOptionPane.showMessageDialog( this, 
            excepcionAritmetica.toString(), "Excepción aritmética",
            JOptionPane.ERROR_MESSAGE );
      }

   } // fin del método actionPerformed

   // demuestra cómo lanzar una excepción cuando ocurre una división entre cero
   public int cociente( int numerador, int denominador )
      throws ArithmeticException
   {
      return numerador / denominador;
   }

   public static void main( String args[] )
   {
      PruebaDivisionEntreCero aplicacion = new PruebaDivisionEntreCero();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaDivisionEntreCero

