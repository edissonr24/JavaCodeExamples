// Fig. 13.12: PruebaBotonOpcion.java
// Creación de botones de opción, utilizando ButtonGroup y JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaBotonOpcion extends JFrame {
   private JTextField campo;
   private Font tipoLetraSimple, tipoLetraNegrita, tipoLetraCursiva, tipoLetraNegritaCursiva;
   private JRadioButton botonSimple, botonNegrita, botonCursiva, 
      botonNegritaCursiva;
   private ButtonGroup grupoBotonesOpcion;

   // crear GUI y tipos de letra
   public PruebaBotonOpcion()
   {
      super( "Prueba de RadioButton" );

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // establecer JTextField
      campo = new JTextField( "Observe cómo cambia el estilo del tipo de letra", 30 );
      contenedor.add( campo ); 

      // crear botones de opción
      botonSimple = new JRadioButton( "Simple", true );
      contenedor.add( botonSimple );

      botonNegrita = new JRadioButton( "Negrita", false );
      contenedor.add( botonNegrita );

      botonCursiva = new JRadioButton( "Cursiva", false );
      contenedor.add( botonCursiva );

      botonNegritaCursiva = new JRadioButton( "Negrita/Cursiva", false );
      contenedor.add( botonNegritaCursiva );

      // crear relación lógica entre objetos JRadioButton
      grupoBotonesOpcion = new ButtonGroup();
      grupoBotonesOpcion.add( botonSimple );
      grupoBotonesOpcion.add( botonNegrita );
      grupoBotonesOpcion.add( botonCursiva );
      grupoBotonesOpcion.add( botonNegritaCursiva );

      // crear objetos de tipo de letra
      tipoLetraSimple = new Font( "Serif", Font.PLAIN, 14 );
      tipoLetraNegrita = new Font( "Serif", Font.BOLD, 14 );
      tipoLetraCursiva = new Font( "Serif", Font.ITALIC, 14 );
      tipoLetraNegritaCursiva = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      campo.setFont( tipoLetraSimple );  // establecer tipo de letra inicial
      
      // registrar eventos para objetos JRadioButton
      botonSimple.addItemListener( new ManejadorBotonOpcion( tipoLetraSimple ) );
      botonNegrita.addItemListener( new ManejadorBotonOpcion( tipoLetraNegrita ) );
      botonCursiva.addItemListener( 
         new ManejadorBotonOpcion( tipoLetraCursiva ) );
      botonNegritaCursiva.addItemListener( 
         new ManejadorBotonOpcion( tipoLetraNegritaCursiva ) );

      setSize( 350, 100 );
      setVisible( true );

   } // fin del constructor de PruebaBotonOpcion

   public static void main( String args[] )
   {
      PruebaBotonOpcion aplicacion = new PruebaBotonOpcion();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } 

   // clase interna privada para manejar eventos de botón de opción
   private class ManejadorBotonOpcion implements ItemListener {
      private Font tipoDeLetra;

      public ManejadorBotonOpcion( Font f )
      {
         tipoDeLetra = f;
      }
           
      // manejar eventos de botón de opción
      public void itemStateChanged( ItemEvent evento )
      {
         campo.setFont( tipoDeLetra );
      }

   } // fin de la clase interna privada ManejadorBotonOpcion

} // fin de la clase PruebaBotonOpcion 

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
