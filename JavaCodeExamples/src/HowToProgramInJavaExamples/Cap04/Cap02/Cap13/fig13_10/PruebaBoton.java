// Fig. 13.10: PruebaBoton.java
// Creación de objetos JButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaBoton extends JFrame {
   private JButton botonSimple, botonElegante;

   // configurar GUI
   public PruebaBoton()
   {
      super( "Prueba de botones" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // crear botones
      botonSimple = new JButton( "Botón simple" );
      contenedor.add( botonSimple );

      Icon insecto1 = new ImageIcon( "insecto1.gif" );
      Icon insecto2 = new ImageIcon( "insecto2.gif" );
      botonElegante = new JButton( "Botón elegante", insecto1 );
      botonElegante.setRolloverIcon( insecto2 );
      contenedor.add( botonElegante );

      // crear una instancia de la clase interna ManejadorBoton
      // a usar para el manejo de eventos de botones
      ManejadorBoton manejador = new ManejadorBoton();
      botonElegante.addActionListener( manejador );
      botonSimple.addActionListener( manejador );

      setSize( 300, 100 );
      setVisible( true );

   } // fin del constructor de PruebaBoton

   public static void main( String args[] )
   { 
      PruebaBoton aplicacion = new PruebaBoton();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // clase interna para el manejo de eventos de botón
   private class ManejadorBoton implements ActionListener {

      // manejar evento de botón
      public void actionPerformed( ActionEvent evento )
      {
         JOptionPane.showMessageDialog( PruebaBoton.this,
            "Usted oprimió: " + evento.getActionCommand() );
      }

   } // fin de la clase interna privada ManejadorBoton

} // fin de la clase PruebaBoton

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
