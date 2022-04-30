// Fig. 13.14: PruebaLista.java
// Selección de colores de un objeto JList.
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class PruebaLista extends JFrame {
   private JList listaColores;
   private Container contenedor;
 
   private final String nombresColores[] = { "Negro", "Azul", "Cyan", 
      "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta",
      "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };

   private final Color colores[] = { Color.BLACK, Color.BLUE, Color.CYAN, 
      Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, 
      Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, 
      Color.YELLOW };

   // configurar GUI
   public PruebaLista()
   {
      super( "Prueba de JList" );

      // obtener panel de contenido y establecer su esquema
      contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // crear una lista con elementos del arreglo nombresColores
      listaColores = new JList( nombresColores );
      listaColores.setVisibleRowCount( 5 );
      
      // no permitir selecciones múltiples
      listaColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

      // agregar un objeto JScrollPane, que contiene a JList, al panel de contenido
      contenedor.add( new JScrollPane( listaColores ) );
      listaColores.addListSelectionListener(

         new ListSelectionListener() {  // clase interna anónima

            // manejar eventos de selección en la lista
            public void valueChanged( ListSelectionEvent evento )
            {
               contenedor.setBackground( 
                  colores[ listaColores.getSelectedIndex() ] );
            }

         } // fin de la clase interna anónima

      ); // fin de la llamada a addListSelectionListener

      setSize( 350, 150 );
      setVisible( true );

   } // fin del constructor de PruebaLista

   public static void main( String args[] )
   { 
      PruebaLista aplicacion = new PruebaLista();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaLista

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
