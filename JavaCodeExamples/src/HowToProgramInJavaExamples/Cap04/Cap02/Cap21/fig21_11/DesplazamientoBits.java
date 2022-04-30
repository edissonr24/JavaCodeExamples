// Fig. 21.11: DesplazamientoBits.java
// Uso de los operadores de desplazamiento a nivel de bits.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DesplazamientoBits extends JFrame {
   private JTextField campoBits, campoValor;

   // configurar GUI
   public DesplazamientoBits()
   {
      super( "Desplazamiento de bits" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      contenedor.add( new JLabel( "Entero a desplazar " ) );

      // campo de texto para que el usuario introduzca un entero
      campoValor = new JTextField( 12 ); 
      contenedor.add( campoValor );      

      campoValor.addActionListener(

         new ActionListener() { // clase interna anónima

            // leer el valor y mostrar su representación a nivel de bits
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( campoValor.getText() );
               campoBits.setText( obtenerBits( valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener                  
      
      // campo de texto para mostrar representación a nivel de bits de un entero
      campoBits = new JTextField( 33 );
      campoBits.setEditable( false );
      contenedor.add( campoBits );      

      // botón para desplazar bits una posición a la izquierda
      JButton botonIzquierda = new JButton( "<<" );
      contenedor.add( botonIzquierda ); 

      botonIzquierda.addActionListener(

         new ActionListener() { // clase interna anónima

            // desplazar una posición a la izquierda y mostrar nuevo valor
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( campoValor.getText() );
               valor <<= 1;
               campoValor.setText( Integer.toString( valor ) );
               campoBits.setText( obtenerBits( valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      // botón para desplazar el valor una posición a la derecha con signo
      JButton botonDerechaConSigno = new JButton( ">>" );
      contenedor.add( botonDerechaConSigno ); 

      botonDerechaConSigno.addActionListener(

         new ActionListener() { // clase interna anónima

            // desplazar una posición a la derecha y mostrar el nuevo valor
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( campoValor.getText() );
               valor >>= 1;
               campoValor.setText( Integer.toString( valor ) );
               campoBits.setText( obtenerBits( valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener     

      // botón para desplazar el valor una posición a la derecha sin signo
      JButton botonDerechaCero = new JButton( ">>>" );
      contenedor.add( botonDerechaCero );

      botonDerechaCero.addActionListener(

         new ActionListener() { // clase interna anónima

            // desplazar una posición a la derecha y mostrar el nuevo valor
            public void actionPerformed( ActionEvent evento )
            {
               int valor = Integer.parseInt( campoValor.getText() );
               valor >>>= 1;
               campoValor.setText( Integer.toString( valor ) );

               campoBits.setText( obtenerBits( valor ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener 

      setSize( 400, 120 );
      setVisible( true );

   } // fin del constructor

   // mostrar representación de bits del valor int especificado
   private String obtenerBits( int valor )
   {
      // crear valor int con 1 en el bit más a la izquierda y 0s en las demás posiciones
      int mascaraMostrar = 1 << 31;

      StringBuffer bufer = new StringBuffer( 35 ); // búfer para la salida

      // para cada bit anexar 0 o 1 al búfer
      for ( int bit = 1; bit <= 32; bit++ ) {

         // usar mascaraMostrar para aislar el bit
         bufer.append( ( valor & mascaraMostrar ) == 0 ? '0' : '1' );

         valor <<= 1; // desplazar el valor una posición a la izquierda

         if ( bit % 8 == 0 )
            bufer.append( ' ' ); // anexar un espacio al búfer cada 8 bits
      }

      return bufer.toString();

   } // fin del método obtenerBits

   public static void main( String args[] )
   {
      DesplazamientoBits aplicacion = new DesplazamientoBits();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DesplazamientoBits

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
