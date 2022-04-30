// Fig. 22.14: CuentaTipoPalabras.java
// Programa que cuenta el número de ocurrencias de cada palabra en una cadena
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CuentaTipoPalabras extends JFrame {
   private JTextArea campoEntrada;
   private JLabel indicador;
   private JTextArea pantalla;
   private JButton botonIniciar;
   
   private Map mapa;

   public CuentaTipoPalabras()
   {
      super( "Cuenta del tipo de palabras" );
      campoEntrada = new JTextArea( 3, 20 );
      
      mapa = new HashMap();
      
      botonIniciar = new JButton( "Iniciar" );
      botonIniciar.addActionListener(

         new ActionListener() { // clase interna

            public void actionPerformed( ActionEvent evento )
            {
               crearMapa();
               pantalla.setText( crearSalida() );
            }

         } // fin de la clase interna

      ); // fin de la llamada a addActionListener

      indicador = new JLabel( "Escriba una cadena:" );
      pantalla = new JTextArea( 15, 20 );
      pantalla.setEditable( false );

      JScrollPane mostrarPanelDesplazable = new JScrollPane( pantalla );

      // agregar componentes a GUI
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );
      contenedor.add( indicador );
      contenedor.add( campoEntrada );
      contenedor.add( botonIniciar );
      contenedor.add( mostrarPanelDesplazable );

      setSize( 450, 400 );
      show();

   } // fin del constructor
   
   // crear mapa a partir de la entrada del usuario
   private void crearMapa() 
   {
      String entrada = campoEntrada.getText();
      StringTokenizer tokenizer = new StringTokenizer( entrada );
               
       while ( tokenizer.hasMoreTokens() ) {
         String palabra = tokenizer.nextToken().toLowerCase(); // obtener palabra
                  
         // si el mapa contiene la palabra
         if ( mapa.containsKey( palabra ) ) {
                     
            Integer cuenta = (Integer) mapa.get( palabra ); // obtener valor
                     
            // incrementar valor
            mapa.put( palabra, new Integer( cuenta.intValue() + 1 ) );
         }
         else // en caso contrario agregar palabra con valor de 1 a mapa
            mapa.put( palabra, new Integer( 1 ) );
                  
       } // fin de instrucción while
      
   } // fin del método crearMapa
   
   // crear cadena que contenga valores de mapa
   private String crearSalida() {      
      StringBuffer salida = new StringBuffer( "" );
      Iterator claves = mapa.keySet().iterator();
      
      // iterar a través de las claves
      while ( claves.hasNext() ) {
         Object claveActual = claves.next();
         
         // mostrar los pares clave-valor
         salida.append( claveActual + "\t" + 
                        mapa.get( claveActual ) + "\n" );
      }
      
      salida.append( "size: " + mapa.size() + "\n" );
      salida.append( "isEmpty: " + mapa.isEmpty() + "\n" );
      
      return salida.toString();
               
   } // fin del método crearSalida

   public static void main( String args[] )
   {
      CuentaTipoPalabras aplicacion = new CuentaTipoPalabras();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase CuentaTipoPalabras

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
