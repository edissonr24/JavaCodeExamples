// Fig. 11.16: MetodosStaticChar2.java
// Métodos estáticos de Character para conversión de caracteres.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MetodosStaticChar2 extends JFrame {
   private char c;
   private int digito, raiz;
   private JLabel indicador1, indicador2;
   private JTextField entrada, raizCampo;
   private JButton enChar, enInt;

   // el constructor crea la GUI
   public MetodosStaticChar2()
   {
      super( "Métodos de conversión de Character" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      indicador1 = new JLabel( "Escriba un dígito o caracter " );
      entrada = new JTextField( 5 );
      contenedor.add( indicador1 );
      contenedor.add( entrada );

      indicador2 = new JLabel( "Escriba una raíz " );
      raizCampo = new JTextField( 5 );
      contenedor.add( indicador2 );
      contenedor.add( raizCampo );

      enChar = new JButton( "Convertir dígito en carácter" );
      enChar.addActionListener(

         new ActionListener() { // clase interna anónima

            // manejar evento de objeto JButton enChar
            public void actionPerformed( ActionEvent eventoAccion )
            {  
               digito = Integer.parseInt( entrada.getText() );
               raiz = Integer.parseInt( raizCampo.getText() );
               JOptionPane.showMessageDialog( null,
                  "Convertir dígito en carácter: " +
                  Character.forDigit( digito, raiz ) );
            }

         } // fin de clase interna anónima

      ); // fin de la llamada a addActionListener

      enInt = new JButton( "Convertir carácter en dígito" );
      enInt.addActionListener(

         new ActionListener() {  // clase interna anónima

            // manejar evento de objeto JButton enInt
            public void actionPerformed( ActionEvent eventoAccion )
            {  
               String s = entrada.getText();
               c = s.charAt( 0 );
               raiz = Integer.parseInt( raizCampo.getText() );
               JOptionPane.showMessageDialog( null,
                  "Convertir carácter en dígito: " +
                  Character.digit( c, raiz ) );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      contenedor.add( enChar );
      contenedor.add( enInt );
      setSize( 275, 150 );  // establecer el tamaño de la ventana
      setVisible( true );   // mostrar la ventana
   }

   // crear objeto MetodosStaticChar2 para ejecutar la aplicación
   public static void main( String args[] )
   {
      MetodosStaticChar2 aplicacion = new MetodosStaticChar2();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase MetodosStaticChar2

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
