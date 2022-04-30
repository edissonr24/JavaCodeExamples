// Fig. 21.8: OpsBitsMisc.java
// Uso de los operadores a nivel de bits.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpsBitsMisc extends JFrame {
   private JTextField campoEntrada1, campoEntrada2, 
      campoBits1, campoBits2, campoBits3, campoResultado;
   private int valor1, valor2;

   // configurar GUI
   public OpsBitsMisc()
   {
      super( "Operadores a nivel de bits" );

      JPanel panelEntrada = new JPanel();
      panelEntrada.setLayout( new GridLayout( 4, 2 ) );

      panelEntrada.add( new JLabel( "Escriba 2 enteros" ) );
      panelEntrada.add( new JLabel( "" ) );

      panelEntrada.add( new JLabel( "Valor 1" ) );
      campoEntrada1 = new JTextField( 8 );
      panelEntrada.add( campoEntrada1 );

      panelEntrada.add( new JLabel( "Valor 2" ) );
      campoEntrada2 = new JTextField( 8 );
      panelEntrada.add( campoEntrada2 );

      panelEntrada.add( new JLabel( "Resultado" ) );
      campoResultado = new JTextField( 8 );
      campoResultado.setEditable( false );
      panelEntrada.add( campoResultado );

      JPanel panelBits = new JPanel();
      panelBits.setLayout( new GridLayout( 4, 1 ) );
      panelBits.add( new JLabel( "Representaciones de bits" ) );

      campoBits1 = new JTextField( 33 );
      campoBits1.setEditable( false );
      panelBits.add( campoBits1 );

      campoBits2 = new JTextField( 33 );
      campoBits2.setEditable( false );
      panelBits.add( campoBits2 );

      campoBits3 = new JTextField( 33 );
      campoBits3.setEditable( false );
      panelBits.add( campoBits3 );

      JPanel panelBotones = new JPanel();

      // botón para realizar operación con AND a nivel de bits
      JButton botonAND = new JButton( "AND" );
      panelBotones.add( botonAND );

      botonAND.addActionListener(

         new ActionListener() { // clase interna anónima

            // realizar operación AND a nivel de bits y mostrar resultados
            public void actionPerformed( ActionEvent evento )
            {
               establecerCampos();
               campoResultado.setText( Integer.toString( valor1 & valor2 ) );
               campoBits3.setText( obtenerBits( valor1 & valor2 ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para realizar operación OR incluyente a nivel de bits
      JButton botonORIncluyente = new JButton( "OR incluyente" );
      panelBotones.add( botonORIncluyente );

      botonORIncluyente.addActionListener(

         new ActionListener() { // clase interna anónima

            // realizar operación OR incluyente a nivel de bits y mostrar resultados
            public void actionPerformed( ActionEvent evento )
            {
               establecerCampos();
               campoResultado.setText( Integer.toString( valor1 | valor2 ) );
               campoBits3.setText( obtenerBits( valor1 | valor2 ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para realizar operación OR excluyente a nivel de bits
      JButton botonORExcluyente = new JButton( "OR excluyente" );
      panelBotones.add( botonORExcluyente );

      botonORExcluyente.addActionListener(

         new ActionListener() { // clase interna anónima

            // realizar operación OR excluyente a nivel de bits y mostrar resultados
            public void actionPerformed( ActionEvent evento )
            {
               establecerCampos();
               campoResultado.setText( Integer.toString( valor1 ^ valor2 ) );
               campoBits3.setText( obtenerBits( valor1 ^ valor2 ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 
               
      // botón para realizar operación complemento a nivel de bits
      JButton botonComplemento = new JButton( "Complemento" );
      panelBotones.add( botonComplemento );

      botonComplemento.addActionListener(

         new ActionListener() { // clase interna anónima

            // realizar operación complemento a nivel de bits y mostrar resultados
            public void actionPerformed( ActionEvent evento )
            {
               campoEntrada2.setText( "" );
               campoBits2.setText( "" );

               int valor = Integer.parseInt( campoEntrada1.getText() );

               campoResultado.setText( Integer.toString( ~valor ) );
               campoBits1.setText( obtenerBits( valor ) );
               campoBits3.setText( obtenerBits( ~valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      Container contenedor = getContentPane();
      contenedor.add( panelEntrada, BorderLayout.WEST );
      contenedor.add( panelBits, BorderLayout.EAST );
      contenedor.add( panelBotones, BorderLayout.SOUTH );

      setSize( 600, 150 );
      setVisible( true );

   } // fin del constructor

   // mostrar números y su forma en bits
   private void establecerCampos()
   {
      valor1 = Integer.parseInt( campoEntrada1.getText() );
      valor2 = Integer.parseInt( campoEntrada2.getText() );

      campoBits1.setText( obtenerBits( valor1 ) );
      campoBits2.setText( obtenerBits( valor2 ) );
   }

   // mostrar representación de bits del valor int especificado
   private String obtenerBits( int valor )
   {
      // crear valor int con 1 en el bit más a la izquierda y 0s en las demás posiciones
      int mascaraMostrar = 1 << 31;

      StringBuffer bufer = new StringBuffer( 35 ); // bufer para la salida

      // para cada bit anexar 0 o 1 al búfer
      for ( int bit = 1; bit <= 32; bit++ ) {

         // usar mascaraMostrar para aislar bit
         bufer.append( ( valor & mascaraMostrar ) == 0 ? '0' : '1' );

         valor <<= 1; // desplazar valor una posición a la izquierda 

         if ( bit % 8 == 0 )
            bufer.append( ' ' ); // anexar un espacio al búfer cada 8 bits
      }

      return bufer.toString();

   } // fin del método obtenerBits

   public static void main( String args[] )
   {
      OpsBitsMisc aplicacion = new OpsBitsMisc();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase OpsBitsMisc

/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
