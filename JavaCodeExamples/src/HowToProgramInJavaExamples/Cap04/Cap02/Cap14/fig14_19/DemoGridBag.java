// Fig. 14.19: DemoGridBag.java
// Demostración de GridBagLayout.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoGridBag extends JFrame { 
   private Container contenedor;
   private GridBagLayout esquema;
   private GridBagConstraints restricciones; 
    
   // configurar GUI
   public DemoGridBag()
   {
      super( "GridBagLayout" );

      contenedor = getContentPane();
      esquema = new GridBagLayout();
      contenedor.setLayout( esquema );   

      // instanciar restricciones de GridBagLayout
      restricciones = new GridBagConstraints();

      // crear componentes de GUI
      JTextArea areaTexto1 = new JTextArea( "AreaTexto1", 5, 10 );
      JTextArea areaTexto2 = new JTextArea( "AreaTexto2", 2, 2 );

      String nombres[] = { "Hierro", "Acero", "Cobre" };
      JComboBox cuadroCombinado = new JComboBox( nombres );

      JTextField campoTexto = new JTextField( "CampoTexto" );
      JButton boton1 = new JButton( "Botón 1" );
      JButton boton2 = new JButton( "Botón 2" );
      JButton boton3 = new JButton( "Botón 3" );

      // weightx y weighty para areaTexto1 son 0: el valor predeterminado
      // anchor para todos los componentes es CENTER: el valor predeterminado
      restricciones.fill = GridBagConstraints.BOTH;
      agregarComponente( areaTexto1, 0, 0, 1, 3 );    
       
      // weightx y weighty para boton1 son 0: el valor predeterminado
      restricciones.fill = GridBagConstraints.HORIZONTAL;
      agregarComponente(  boton1, 0, 1, 2, 1 );
      
      // weightx y weighty para cuadroCombinado son 0: el valor predeterminado
      // fill es HORIZONTAL
      agregarComponente( cuadroCombinado, 2, 1, 2, 1 );             

      //  boton2
      restricciones.weightx = 1000;  // puede hacerse más ancho
      restricciones.weighty = 1;     // puede hacerse más largo
      restricciones.fill = GridBagConstraints.BOTH;
      agregarComponente(  boton2, 1, 1, 1, 1 );
       
      // fill es BOTH para boton3
      restricciones.weightx = 0;
      restricciones.weighty = 0;    
      agregarComponente(  boton3, 1, 2, 1, 1 );
       
      // weightx y weighty para campoTexto son 0, fill es BOTH
      agregarComponente( campoTexto, 3, 0, 2, 1 );

      // weightx y weighty para areaTexto2 son 0, fill es BOTH
      agregarComponente( areaTexto2, 3, 2, 1, 1 );

      setSize( 300, 150 );
      setVisible( true );

   } // fin del constructor de DemoGridBag

   // método para establecer restricciones 
   private void agregarComponente( Component componente,
      int fila, int columna, int anchura, int altura )
   {
      // establecer gridx y gridy 
      restricciones.gridx = columna;
      restricciones.gridy = fila;

      // establecer gridwidth y gridheight
      restricciones.gridwidth = anchura;   
      restricciones.gridheight = altura;

      // establecer restricciones y agregar componente
      esquema.setConstraints( componente, restricciones );  
      contenedor.add( componente );      
   }

   public static void main( String args[] )
   {
      DemoGridBag aplicacion = new DemoGridBag();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase DemoGridBag

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
