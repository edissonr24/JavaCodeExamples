// Fig. 13.17: RastreadorRaton.java
// Demostraci�n de los eventos de rat�n.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RastreadorRaton extends JFrame
   implements MouseListener, MouseMotionListener {

   private JLabel barraEstado;

   // configurar GUI y registrar manejadores de eventos de rat�n
   public RastreadorRaton()
   {
      super( "Demostraci�n de los eventos de rat�n" );

      barraEstado = new JLabel();
      getContentPane().add( barraEstado, BorderLayout.SOUTH );
    
      addMouseListener( this );        // escucha sus propios eventos de rat�n
      addMouseMotionListener( this );  // y de movimiento de rat�n

      setSize( 300, 125 );
      setVisible( true );
   }

   // Manejadores de eventos de MouseListener
   // manejar el evento cuando el bot�n del rat�n se suelta inmediatamente despu�s de oprimir
   public void mouseClicked( MouseEvent evento )
   {
      barraEstado.setText( "Se hizo clic en [" + evento.getX() +
         ", " + evento.getY() + "]" );
   }

   // manejar evento cuando se oprime el bot�n del rat�n
   public void mousePressed( MouseEvent evento )
   {
      barraEstado.setText( "Se oprimi� en [" + evento.getX() +
         ", " + evento.getY() + "]" );
   }

   // manejar evento cuando se suelta el rat�n despu�s de arrastrar
   public void mouseReleased( MouseEvent evento )
   {
      barraEstado.setText( "Se solt� en [" + evento.getX() +
         ", " + evento.getY() + "]" );
   }

   // manejar el evento cuando el rat�n entra al �rea
   public void mouseEntered( MouseEvent evento )
   {
      barraEstado.setText( "Rat�n entro en [" + evento.getX() +
         ", " + evento.getY() + "]" );
      getContentPane().setBackground( Color.GREEN );
   }

   // manejar evento cuando el rat�n sale del �rea
   public void mouseExited( MouseEvent evento )
   {
      barraEstado.setText( "Rat�n fuera de la ventana" );
      getContentPane().setBackground( Color.WHITE );
   }

   // Manejadores de eventos de MouseMotionListener
   // manejar el evento cuando el usuario arrastra el rat�n con el bot�n oprimido
   public void mouseDragged( MouseEvent evento )
   {
      barraEstado.setText( "Se arrastr� en [" + evento.getX() + 
         ", " + evento.getY() + "]" );
   }

   // manejar el evento cuando el usuario mueve el rat�n
   public void mouseMoved( MouseEvent evento )
   {
      barraEstado.setText( "Se movi� en [" + evento.getX() +
         ", " + evento.getY() + "]" );
   }

   public static void main( String args[] )
   { 
      RastreadorRaton aplicacion = new RastreadorRaton();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

} // fin de la clase RastreadorRaton

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
