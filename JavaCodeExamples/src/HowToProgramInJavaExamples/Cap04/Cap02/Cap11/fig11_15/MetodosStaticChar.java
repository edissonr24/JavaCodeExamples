// Fig. 11.15: MetodosStaticChar.java
// M�todos static de Character para probar caracteres y cambiar may�sculas/min�sculas.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MetodosStaticChar extends JFrame {
   private char c;
   private JLabel indicadorEtiqueta;
   private JTextField entradaCampo;
   private JTextArea areaSalida;

   // el constructor crea la GUI
   public MetodosStaticChar()
   {
      super( "M�todos est�ticos de Character" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      indicadorEtiqueta = new JLabel( "Escriba un car�cter y oprima Intro" );
      contenedor.add( indicadorEtiqueta );
      entradaCampo = new JTextField( 5 );

      entradaCampo.addActionListener(

         new ActionListener() {  // clase interna an�nima

            // manejar evento del campo de texto
            public void actionPerformed( ActionEvent evento )
            {  
               String s = evento.getActionCommand();
               c = s.charAt( 0 );
               crearSalida();
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addActionListener

      contenedor.add( entradaCampo );
      areaSalida = new JTextArea( 10, 20 );
      contenedor.add( areaSalida );

      setSize( 300, 220 );  // establecer el tama�o de la ventana
      setVisible( true);    // mostrar la ventana

   } // fin del constructor

   // mostrar informaci�n del car�cter en areaSalida
   private void crearSalida()
   {
      areaSalida.setText( "est� definido: " + Character.isDefined( c ) +
         "\nes d�gito: " + Character.isDigit( c ) +
         "\nes primer caracter en un identificador de Java: " +
         Character.isJavaIdentifierStart( c ) +
         "\nes parte de un identificador de Java: " +
         Character.isJavaIdentifierPart( c ) +
         "\nes letra: " + Character.isLetter( c ) +
         "\nes letra o d�gito: " + Character.isLetterOrDigit( c ) +
         "\nes min�scula: " + Character.isLowerCase( c ) +
         "\nes may�scula: " + Character.isUpperCase( c ) +
         "\na may�scula: " + Character.toUpperCase( c ) +
         "\na min�scula: " + Character.toLowerCase( c ) );
   }

   // crear objeto MetodosStaticChar para empezar la ejecuci�n
   public static void main( String args[] )
   {
      MetodosStaticChar aplicacion = new MetodosStaticChar();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase MetodosStaticChar

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
