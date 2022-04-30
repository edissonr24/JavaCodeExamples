// Fig. 14.20: DemoGridBag2.java
// Demostración de las constantes de GridBagLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoGridBag2 extends JFrame { 
   private GridBagLayout esquema;
   private GridBagConstraints restricciones;
   private Container contenedor;
    
   // configurar GUI
   public DemoGridBag2()
   {
      super( "GridBagLayout" );

      contenedor = getContentPane();
      esquema = new GridBagLayout();
      contenedor.setLayout( esquema );   

      // instanciar restricciones de GridBagLayout
      restricciones = new GridBagConstraints();

      // crear componentes de GUI
      String metales[] = { "Cobre", "Aluminio", "Plata" };
      JComboBox cuadroCombinado = new JComboBox( metales );

      JTextField campoTexto = new JTextField( "CampoTexto" );

      String tiposLetra[] = { "Serif", "Monospaced" };
      JList lista = new JList( tiposLetra );

      String nombres[] = { "cero", "uno", "dos", "tres", "cuatro" };
      JButton botones[] = new JButton[ nombres.length ];

      for ( int cuenta = 0; cuenta < botones.length; cuenta++ )
         botones[ cuenta ] = new JButton( nombres[ cuenta ] );

      // definir restricciones del componente de GUI campoTexto
      restricciones.weightx = 1;
      restricciones.weighty = 1;  
      restricciones.fill = GridBagConstraints.BOTH;
      restricciones.gridwidth = GridBagConstraints.REMAINDER;
      agregarComponente( campoTexto );

      // botones[0] -- weightx y weighty son 1: fill es BOTH
      restricciones.gridwidth = 1;
      agregarComponente( botones[ 0 ] );

      // botones[1] -- weightx y weighty son 1: fill es BOTH
      restricciones.gridwidth = GridBagConstraints.RELATIVE;
      agregarComponente( botones[ 1 ] );

      // botones[2] -- weightx y weighty son 1: fill es BOTH
      restricciones.gridwidth = GridBagConstraints.REMAINDER;
      agregarComponente( botones[ 2 ] );

      // cuadroCombinado -- weightx es 1: fill es BOTH
      restricciones.weighty = 0;
      restricciones.gridwidth = GridBagConstraints.REMAINDER;
      agregarComponente( cuadroCombinado );
      
      // botones[3] -- weightx es 1: fill es BOTH
      restricciones.weighty = 1;
      restricciones.gridwidth = GridBagConstraints.REMAINDER;
      agregarComponente( botones[ 3 ] ); 

      // botones[4] -- weightx y weighty son 1: fill es BOTH
      restricciones.gridwidth = GridBagConstraints.RELATIVE;
      agregarComponente( botones[ 4 ] );

      // lista -- weightx y weighty son 1: fill es BOTH
      restricciones.gridwidth = GridBagConstraints.REMAINDER;
      agregarComponente( lista );

      setSize( 300, 200 );
      setVisible( true );
  
   }  // fin del constructor

   // agregar un componente al contenedor
   private void agregarComponente( Component componente ) 
   {
      esquema.setConstraints( componente, restricciones );
      contenedor.add( componente );      // agregar componente
   }   

   public static void main( String args[] )
   {
      DemoGridBag2 aplicacion = new DemoGridBag2();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

}  // fin de la clase DemoGridBag2

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
