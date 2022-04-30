// Fig. 13.11: PruebaCasillaVerificacion.java
// Creación de botones JCheckBox.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaCasillaVerificacion extends JFrame {
   private JTextField campo;
   private JCheckBox negrita, cursiva;

   // configurar GUI
   public PruebaCasillaVerificacion()
   {
      super( "Prueba de JCheckBox" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // configurar objeto JTextField y establecer su tipo de letra
      campo = new JTextField( "Observe el cambio en el estilo de tipo de letra", 25 );
      campo.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      contenedor.add( campo );

      // crear objetos casilla de verificación
      negrita = new JCheckBox( "Negrita" );
      contenedor.add( negrita );     

      cursiva = new JCheckBox( "Cursiva" );
      contenedor.add( cursiva );

      // registrar componentes de escucha para los objetos JCheckBox
      ManejadorCasillaVerificacion manejador = new ManejadorCasillaVerificacion();
      negrita.addItemListener( manejador );
      cursiva.addItemListener( manejador );

      setSize( 300, 100 );
      setVisible( true );

   } // fin del constructor de PruebaCasillaVerificacion

   public static void main( String args[] )
   { 
      PruebaCasillaVerificacion aplicacion = new PruebaCasillaVerificacion();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // clase interna privada para manejo de eventos de ItemListener
   private class ManejadorCasillaVerificacion implements ItemListener {
      private int valNegrita = Font.PLAIN;
      private int valCursiva = Font.PLAIN;

      // responder a eventos de casilla de verificación
      public void itemStateChanged( ItemEvent evento )
      {
         // procesar eventos de casilla de verificación negrita
         if ( evento.getSource() == negrita )
            valNegrita = negrita.isSelected() ? Font.BOLD : Font.PLAIN;
               
         // procesar eventos de casilla de verificación cursiva
         if ( evento.getSource() == cursiva )
            valCursiva = cursiva.isSelected() ? Font.ITALIC : Font.PLAIN;

         // establecer tipo de letra del campo de texto
         campo.setFont( new Font( "Serif", valNegrita + valCursiva, 14 ) );

      } // fin del método itemStateChanged

   } // fin de la clase interna privada ManejadorCasillaVerificacion

} // fin de la clase PruebaCasillaVerificacion

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
