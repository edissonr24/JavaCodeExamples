// Fig. 11.18: PruebaToken.java
// La clase StringTokenizer.
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaToken extends JFrame {
   private JLabel indicadorEtiqueta;
   private JTextField entradaCampo;
   private JTextArea areaSalida;

   // configurar GUI y manejo de eventos
   public PruebaToken()
   {
      super( "Prueba de la clase StringTokenizer" );

      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      indicadorEtiqueta = new JLabel( "Escriba una oración y oprima Intro" );
      contenedor.add( indicadorEtiqueta );

      entradaCampo = new JTextField( 20 );
      entradaCampo.addActionListener(

         new ActionListener() {  // clase interna anónima

            // manejar evento de campo de texto
            public void actionPerformed( ActionEvent evento )
            {      
               StringTokenizer tokens =
                  new StringTokenizer( evento.getActionCommand() );

               areaSalida.setText( "Número de elementos: " +
                  tokens.countTokens() + "\nLos tokens son:\n" );

               while ( tokens.hasMoreTokens() )
                  areaSalida.append( tokens.nextToken() + "\n" );
            }

         } // fin de clase interna anónima

      ); // fin de la llamada a addActionListener

      contenedor.add( entradaCampo );

      areaSalida = new JTextArea( 10, 20 );
      areaSalida.setEditable( false );
      contenedor.add( new JScrollPane( areaSalida ) );
      setSize( 275, 240 );  // establecer el tamaño de la ventana
      setVisible( true );   // mostrar la ventana
   }

   // ejecutar la aplicación
   public static void main( String args[] )
   {
      PruebaToken aplicacion = new PruebaToken();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } 

} // fin de la clase PruebaToken

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
