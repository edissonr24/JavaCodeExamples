// Fig. 19.2: AnimadorLogo.java
// Animaci�n de una serie de im�genes.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimadorLogo extends JPanel implements ActionListener {

   private final static String NOMBRE_IMAGEN = "deitel"; // nombre base de la imagen
   protected ImageIcon imagenes[];     // arreglo de im�genes

   private int imagenesTotales = 30;     // n�mero de im�genes
   private int imagenActual = 0;     // �ndice de imagen actual
   private int retrasoAnimacion = 50;  // retraso en milisegundos
   private int anchura;                // anchura de la imagen
   private int altura;               // altura de la imagen

   private Timer temporizadorAnimacion; // el objeto Timer controla la animaci�n

   // inicializar objeto AnimadorLogo cargando las im�genes
   public AnimadorLogo()
   {
      imagenes = new ImageIcon[ imagenesTotales ];

      // cargar im�genes
      for ( int cuenta = 0; cuenta < imagenes.length; ++cuenta )
         imagenes[ cuenta ] = new ImageIcon( getClass().getResource(
            "imagenes/" + NOMBRE_IMAGEN + cuenta + ".gif" ) );
 
      // en este ejemplo suponemos que todas las im�genes tienen la misma anchura y altura
      anchura = imagenes[ 0 ].getIconWidth();   // obtener anchura de icono
      altura = imagenes[ 0 ].getIconHeight(); // obtener altura de icono
   }

   // mostrar imagen actual 
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      imagenes[ imagenActual ].paintIcon( this, g, 0, 0 );
      
      // pasar a la siguiente imagen solamente si el temporizador se est� ejecutando
      if ( temporizadorAnimacion.isRunning() )  
         imagenActual = ( imagenActual + 1 ) % imagenesTotales;
   }

   // responder al evento del objeto Timer
   public void actionPerformed( ActionEvent eventoAccion )
   {
      repaint(); // repintar el animador
   }

   // iniciar o reiniciar la animaci�n
   public void iniciarAnimacion()
   {
      if ( temporizadorAnimacion == null ) {
         imagenActual = 0;  
         temporizadorAnimacion = new Timer( retrasoAnimacion, this );
         temporizadorAnimacion.start();
      }
      else // continuar desde la �ltima imagen mostrada
         if ( ! temporizadorAnimacion.isRunning() )
            temporizadorAnimacion.restart();
   }

   // detener el temporizador de la animaci�n
   public void detenerAnimacion()
   {
      temporizadorAnimacion.stop();
   }

   // devolver el tama�o m�nimo de la animaci�n
   public Dimension getMinimumSize()
   { 
      return getPreferredSize(); 
   }

   // devolver el tama�o preferido de la animaci�n
   public Dimension getPreferredSize()
   {
      return new Dimension( anchura, altura );
   }

   // ejecutar la animaci�n en un objeto JFrame
   public static void main( String args[] )
   {
      AnimadorLogo animacion = new AnimadorLogo(); // crear el objeto AnimadorLogo

      JFrame ventana = new JFrame( "Prueba del animador" ); // configurar ventana
      ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      Container contenedor = ventana.getContentPane();
      contenedor.add( animacion );

      ventana.pack();  // hacer la ventana lo suficientemente grande para su GUI
      ventana.setVisible( true );   // mostrar la ventana
      animacion.iniciarAnimacion();  // comenzar la animaci�n

   } // fin del m�todo main

} // fin de la clase AnimadorLogo

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
