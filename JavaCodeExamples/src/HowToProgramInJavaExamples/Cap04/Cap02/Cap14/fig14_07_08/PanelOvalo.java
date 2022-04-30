// Fig. 14.7: PanelOvalo.java
// Una clase JPanel personalizada.
import java.awt.*;
import javax.swing.*;

public class PanelOvalo extends JPanel {
   private int diametro = 10;

   // dibujar un óvalo del diámetro especificado
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      g.fillOval( 10, 10, diametro, diametro );
   }

   // validar y establecer el diámetro, después repintar 
   public void establecerDiametro( int nuevoDiametro )
   {
      // si el diámetro es inválido, usar valor predeterminado de 10
      diametro = ( nuevoDiametro >= 0 ? nuevoDiametro : 10 );
      repaint();
   }

   // utilizado por el administrador de esquemas para determinar el tamaño preferido
   public Dimension getPreferredSize()
   {
      return new Dimension( 200, 200 );
   }

   // utilizado por el administrador de esquemas para determinar el tamaño mínimo
   public Dimension getMinimumSize()
   {
      return getPreferredSize();
   }

} // fin de la clase PanelOvalo

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