// Fig. 21.6: ImprimirBits.java
// Imprimir un entero sin signo en bits.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImprimirBits extends JFrame {
   private JTextField campoSalida;

   // configurar GUI
   public ImprimirBits()
   {
      super( "Imprimir representaciones de números en bits" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      contenedor.add( new JLabel( "Escriba un entero " ) );

      // campo de texto para leer un valor del usuario
      JTextField campoEntrada = new JTextField( 10 );
      contenedor.add( campoEntrada );

      campoEntrada.addActionListener(

         new ActionListener() { // clase interna anónima

            // leer entero y obtener representación a nivel de bits
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( evento.getActionCommand() );
               campoSalida.setText( obtenerBits( valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      contenedor.add( new JLabel( "El entero en bits es" ) );

      // campo de texto para mostrar entero en formato a nivel de bits
      campoSalida = new JTextField( 33 );
      campoSalida.setEditable( false );
      contenedor.add( campoSalida );

      setSize( 720, 70 );
      setVisible( true );

   } // fin del constructor

   // mostrar representación en bits del valor int especificado
   private String obtenerBits( int valor )
   {
      // crear valor int con 1 en el bit más a la izquierda y 0s en las demás posiciones
      int mascaraMostrar = 1 << 31;

      StringBuffer bufer = new StringBuffer( 35 ); // bufer de salida

      // para cada bit, anexar 0 o 1 al búfer
      for ( int bit = 1; bit <= 32; bit++ ) {

         // usar mascaraMostrar para aislar el bit
         bufer.append( ( valor & mascaraMostrar ) == 0 ? '0' : '1' );

         valor <<= 1; // desplazar valor una posición a la izquierda 

         if ( bit % 8 == 0 )
            bufer.append( ' ' ); // anexar un espacio al búfer cada 8 bits
      }

      return bufer.toString();

   } // fin del método obtenerBits

   public static void main( String args[] )
   {
      ImprimirBits aplicacion = new ImprimirBits();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase ImprimirBits


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
