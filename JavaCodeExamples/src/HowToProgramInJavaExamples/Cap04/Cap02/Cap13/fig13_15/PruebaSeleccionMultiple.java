// Fig. 13.15: PruebaSeleccionMultiple.java
// Cómo copiar elementos de una lista a otra.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaSeleccionMultiple extends JFrame {
   private JList listaColores, listaCopia;
   private JButton botonCopiar;
   private final String nombresColores[] = { "Negro", "Azul", "Cyan", 
      "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja", 
      "Rosa", "Rojo", "Blanco", "Amarillo" };

   // configurar GUI
   public PruebaSeleccionMultiple()
   {
      super( "Listas de selección múltiple" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // establecer objeto JList listaColores
      listaColores = new JList( nombresColores );
      listaColores.setVisibleRowCount( 5 );
      listaColores.setSelectionMode( 
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      contenedor.add( new JScrollPane( listaColores ) );

      // crear botón copiar y registrar su componente de escucha
      botonCopiar = new JButton( "Copiar >>>" );
      botonCopiar.addActionListener(

         new ActionListener() {  // clase interna anónima 

            // manejar evento de botón
            public void actionPerformed( ActionEvent evento )
            {
               // colocar valores seleccionados en listaCopia
               listaCopia.setListData( listaColores.getSelectedValues() );
            }

         } // fin de clase interna anónima

      ); // fin de la llamada a addActionListener

      contenedor.add( botonCopiar );

      // establecer objeto JList listaCopia
      listaCopia = new JList( );
      listaCopia.setVisibleRowCount( 5 );
      listaCopia.setFixedCellWidth( 100 );
      listaCopia.setFixedCellHeight( 15 );
      listaCopia.setSelectionMode( 
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      contenedor.add( new JScrollPane( listaCopia ) );

      setSize( 325, 130 );
      setVisible( true );

   } // fin del constructor PruebaSeleccionMultiple

   public static void main( String args[] )
   { 
      PruebaSeleccionMultiple aplicacion = new PruebaSeleccionMultiple();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaSeleccionMultiple


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
