// Fig. 14.12: PruebaEscritorio.java
// Demostración de JDesktopPane.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEscritorio extends JFrame {
   private JDesktopPane elEscritorio;

   // configurar GUI
   public PruebaEscritorio()
   {
      super( "Uso de un objeto JDesktopPane" );

      // crear barra de menús, menu y elemento de menú
      JMenuBar barra = new JMenuBar();
      JMenu menuAgregar = new JMenu( "Agregar" );
      JMenuItem nuevoMarco = new JMenuItem( "Marco interno" );

      menuAgregar.add( nuevoMarco );
      barra.add( menuAgregar );

      setJMenuBar( barra );

      // establecer escritorio
      elEscritorio = new JDesktopPane();
      getContentPane().add( elEscritorio );
    
      // establecer componente de escucha para elemento de menú nuevoMarco
      nuevoMarco.addActionListener(

         new ActionListener() {  // clase interna anónima

            // mostrar nueva ventana interna
            public void actionPerformed( ActionEvent evento ) {

               // crear marco interno
               JInternalFrame marco = new JInternalFrame( 
                  "Marco interno", true, true, true, true );

               // adjuntar panel al panel de contenido del marco interno
               Container contenedor = marco.getContentPane();
               MiJPanel panel = new MiJPanel();
               contenedor.add( panel, BorderLayout.CENTER );

               // establecer tamaño de marco interno en el tamaño de su contenido
               marco.pack();

               // adjuntar marco interno al escritorio y mostrarlo
               elEscritorio.add( marco );
               marco.setVisible( true );
            }

         } // fin de la clase interna anónima
      ); // fin de la llamada a addActionListener

      setSize( 600, 460 );
      setVisible( true );

   } // fin del constructor

   public static void main( String args[] )
   {     
      PruebaEscritorio aplicacion = new PruebaEscritorio();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase PruebaEscritorio

// clase para mostrar un objeto ImageIcon en un panel
class MiJPanel extends JPanel {
   private ImageIcon iconoImagen;
   private String[] imagenes = { "floresamarillas.png", "florespurpura.png",
      "floresrojas.png", "floresrojas2.png", "floreslavanda.png" };

   // cargar imagen
   public MiJPanel()
   {
      int numeroAleatorio = ( int ) ( Math.random() * 5 );
      iconoImagen = new ImageIcon( imagenes[ numeroAleatorio ] );
   }

   // mostrar iconoImagen en el panel
   public void paintComponent( Graphics g )
   {
      // llamar al método paintComponent de la superclase
      super.paintComponent( g );

      // mostrar icono
      iconoImagen.paintIcon( this, g, 0, 0 );
   }

   // devolver dimensiones de la imagen
   public Dimension getPreferredSize()
   {
      return new Dimension( iconoImagen.getIconWidth(), 
         iconoImagen.getIconHeight() );  
   }

} // fin de la clase MiJPanel

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
