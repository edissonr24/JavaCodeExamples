// Fig. 11.15: MetodosStaticChar.java
// Métodos static de Character para probar caracteres y cambiar mayúsculas/minúsculas.
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
      super( "Métodos estáticos de Character" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      indicadorEtiqueta = new JLabel( "Escriba un carácter y oprima Intro" );
      contenedor.add( indicadorEtiqueta );
      entradaCampo = new JTextField( 5 );

      entradaCampo.addActionListener(

         new ActionListener() {  // clase interna anónima

            // manejar evento del campo de texto
            public void actionPerformed( ActionEvent evento )
            {  
               String s = evento.getActionCommand();
               c = s.charAt( 0 );
               crearSalida();
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      contenedor.add( entradaCampo );
      areaSalida = new JTextArea( 10, 20 );
      contenedor.add( areaSalida );

      setSize( 300, 220 );  // establecer el tamaño de la ventana
      setVisible( true);    // mostrar la ventana

   } // fin del constructor

   // mostrar información del carácter en areaSalida
   private void crearSalida()
   {
      areaSalida.setText( "está definido: " + Character.isDefined( c ) +
         "\nes dígito: " + Character.isDigit( c ) +
         "\nes primer caracter en un identificador de Java: " +
         Character.isJavaIdentifierStart( c ) +
         "\nes parte de un identificador de Java: " +
         Character.isJavaIdentifierPart( c ) +
         "\nes letra: " + Character.isLetter( c ) +
         "\nes letra o dígito: " + Character.isLetterOrDigit( c ) +
         "\nes minúscula: " + Character.isLowerCase( c ) +
         "\nes mayúscula: " + Character.isUpperCase( c ) +
         "\na mayúscula: " + Character.toUpperCase( c ) +
         "\na minúscula: " + Character.toLowerCase( c ) );
   }

   // crear objeto MetodosStaticChar para empezar la ejecución
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
