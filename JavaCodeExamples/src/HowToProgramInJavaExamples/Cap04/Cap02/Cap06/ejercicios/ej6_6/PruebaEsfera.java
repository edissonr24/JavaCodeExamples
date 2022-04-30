// Ejercicio 6.6: PruebaEsfera.java
// Calcula el volumen de una esfera.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEsfera extends JApplet implements ActionListener {
   JLabel indicadorEtiqueta;
   JTextField entradaCampo;

   // crear GUI
   public void init()
   {
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      indicadorEtiqueta = new JLabel( "Escriba el radio de la esfera: " );
      entradaCampo = new JTextField( 10 );
      entradaCampo.addActionListener( this );
      contenedor.add( indicadorEtiqueta );
      contenedor.add( entradaCampo );

   } // fin del método init

   // calcular el volumen de la esfera cuando el usuario oprima Intro en entradaCampo
   public void actionPerformed( ActionEvent actionEvent )
   {
      double radio =
         Double.parseDouble( actionEvent.getActionCommand() );

      showStatus( "El volumen es " + volumenEsfera( radio ) );

   } // fin del método actionPerformed

   // calcular y devolver el volumen de la esfera
   public double volumenEsfera( double radio )
   {
      double volumen = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radio, 3 );

      return volumen;

   } // fin del método esferaVolumen

} // fin de la clase PruebaEsfera

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
