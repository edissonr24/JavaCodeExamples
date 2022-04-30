// Fig. 21.3: CuentaTipoPalabras.java
// Conteo del número de ocurrencias de cada palabra en una cadena.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CuentaTipoPalabras extends JFrame {
   private JTextArea campoEntrada;
   private JLabel indicador;
   private JTextArea pantalla;
   private JButton botonIniciar;
   
   private Hashtable tabla;

   public CuentaTipoPalabras()
   {
      super( "Cuenta de tipos de palabras" );
      campoEntrada = new JTextArea( 3, 20 );
      
      tabla = new Hashtable();
      
      botonIniciar = new JButton( "Iniciar" );
      botonIniciar.addActionListener(

         new ActionListener() { // clase interna anónima

            public void actionPerformed( ActionEvent evento )
            {
               crearTabla();
               pantalla.setText( crearSalida() );
            }

         }  // fin de la clase interna anónima

      ); // fin de la llamada a addActionListener

      indicador = new JLabel( "Escriba una cadena:" );
      pantalla = new JTextArea( 15, 20 );
      pantalla.setEditable( false );

      JScrollPane mostrarPanelDesplazable = new JScrollPane( pantalla );

      // agregar componentes a la GUI
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );
      contenedor.add( indicador );
      contenedor.add( campoEntrada );
      contenedor.add( botonIniciar );
      contenedor.add( mostrarPanelDesplazable );

      setSize( 450, 400 );
      setVisible( true );

   } // fin del constructor
   
   // crear tabla a partir de la entrada del usuario
   private void crearTabla() {
      String entrada = campoEntrada.getText();
      StringTokenizer palabras = new StringTokenizer( entrada, " \n\t\r" );
               
       while ( palabras.hasMoreTokens() ) {
         String palabra = palabras.nextToken().toLowerCase(); // obtener palabra
                  
         // si la tabla contiene la palabra
         if ( tabla.containsKey( palabra ) ) {
            
            Integer cuenta = (Integer) tabla.get( palabra ); // obtener el valor
                     
            // e incrementarlo
            tabla.put( palabra, new Integer( cuenta.intValue() + 1 ) );
         }
         else // en caso contrario, agregar la palabra con un valor de 1
            tabla.put( palabra, new Integer( 1 ) );
                  
       } // fin de instrucción while
      
   } // fin del método crearTabla
   
   // crear cadena con valores de tabla
   private String crearSalida() {      
      String salida = "";
      Enumeration claves = tabla.keys();
               
      // iterar a través de las claves
      while ( claves.hasMoreElements() ) {
         Object claveActual = claves.nextElement();
                  
         // mostrar los pares clave-valor
         salida += claveActual + "\t" + tabla.get( claveActual ) + "\n";
      }
      
      salida += "tamaño: " + tabla.size() + "\n";
      salida += "estaVacia: " + tabla.isEmpty() + "\n";
      
      return salida;
               
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
