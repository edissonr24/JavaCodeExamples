// Fig. 14.10: PruebaContextual.java
// Demostraci�n de los objetos JPopupMenu
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaContextual extends JFrame {
   private JRadioButtonMenuItem elementos[];
   private final Color valoresColor[] = 
      { Color.BLUE, Color.YELLOW, Color.RED };
   private JPopupMenu menuContextual;

   // configurar GUI
   public PruebaContextual()
   {
      super( "Uso de objetos JPopupMenu" );

      ManejadorEventos manejador = new ManejadorEventos();
      String colores[] = { "Azul", "Amarillo", "Rojo" };

      // establecer men� contextual y sus elementos
      ButtonGroup grupoColores = new ButtonGroup();
      menuContextual = new JPopupMenu();
      elementos = new JRadioButtonMenuItem[ 3 ];

      // construir cada elemento de men� y agregarlo al men� contextual; adem�s
      // permitir el manejo de eventos para cada elemento de men�
      for ( int cuenta = 0; cuenta < elementos.length; cuenta++ ) {
         elementos[ cuenta ] = new JRadioButtonMenuItem( colores[ cuenta ] );
         menuContextual.add( elementos[ cuenta ] );
         grupoColores.add( elementos[ cuenta ] );
         elementos[ cuenta ].addActionListener( manejador );
      }

      getContentPane().setBackground( Color.WHITE );

      // declarar un objeto MouseListener para la ventana que muestra
      // un objeto JPopupMenu cuando ocurre el evento de desencadenamiento del men� contextual
      addMouseListener(

         new MouseAdapter() {  // clase interna an�nima

            // manejar evento de oprimir bot�n del rat�n
            public void mousePressed( MouseEvent evento )
            { 
               checkForTriggerEvent( evento ); 
            } 

            // manejar evento de soltar el bot�n del rat�n
            public void mouseReleased( MouseEvent evento )
            { 
               checkForTriggerEvent( evento ); 
            } 

            // determinar si evento debe desencadenar el men� contextual
            private void checkForTriggerEvent( MouseEvent evento )
            {
               if ( evento.isPopupTrigger() ) 
                  menuContextual.show( 
                     evento.getComponent(), evento.getX(), evento.getY() );  
            }

         } // fin de la clase interna an�nima

      ); // fin de la llamada a addMouseListener

      setSize( 300, 200 );
      setVisible( true );

   } // fin del constructor de PruebaContextual

   public static void main( String args[] )
   {
      PruebaContextual aplicacion = new PruebaContextual();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // clase interna privada para manejar eventos de elemento de men�
   private class ManejadorEventos implements ActionListener {

      // procesar selecciones de elementos de men�
      public void actionPerformed( ActionEvent evento )
      {
         // determinar cu�l elemento de men� fue seleccionado
         for ( int i = 0; i < elementos.length; i++ )
            if ( evento.getSource() == elementos[ i ] ) {
               getContentPane().setBackground( valoresColor[ i ] );
               return;
            }
      }

   } // fin de la clase interna privada ManejadorEventos

} // fin de la clase PruebaContextual

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
 