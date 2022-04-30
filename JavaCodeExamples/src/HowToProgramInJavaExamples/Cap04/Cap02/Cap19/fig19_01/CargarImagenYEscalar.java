// Fig. 19.1: CargarImagenYEscalar.java
// Cargar una imagen y mostrarla en su tamaño original y al doble de su
// tamaño original. Cargar y mostrar la misma imagen como un objeto ImageIcon.
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class CargarImagenYEscalar extends JApplet {
   private Image logo1;       
   private ImageIcon logo2;   

   // cargar imagen cuando se cargue el subprograma
   public void init()
   {
      logo1 = getImage( getDocumentBase(), "logo.gif" );
      logo2 = new ImageIcon( "logo.gif" );
   }

   // mostrar imagen
   public void paint( Graphics g )
   {      
      g.drawImage( logo1, 0, 0, this ); // dibujar la imagen original

      // dibujar imagen para ajustarse a la anchura y la altura menos 120 píxeles
      g.drawImage( logo1, 0, 120, getWidth(), getHeight() - 120, this );

      // dibujar icono usando su método paintIcon
      logo2.paintIcon( this, g, 180, 0 );
   }

} // fin de la clase CargarImagenYEscalar


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
