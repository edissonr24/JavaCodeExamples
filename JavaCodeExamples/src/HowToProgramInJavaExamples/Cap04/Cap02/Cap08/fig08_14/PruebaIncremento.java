// Fig. 8.14: PruebaIncremento.java
// Inicialización de una variable final.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaIncremento extends JApplet implements ActionListener {
   private Incremento objetoIncremento;
   private JButton boton;  

   // configurar GUI
   public void init() 
   { 
      objetoIncremento = new Incremento( 5 );

      Container contenedor = getContentPane();

      boton = new JButton( "Haga clic para incrementar" );
      boton.addActionListener( this );
      contenedor.add( boton );
   }

   // sumar INCREMENTO al total cuando el usuario haga clic en el botón
   public void actionPerformed( ActionEvent eventoAccion )
   {
      objetoIncremento.incrementar();
      showStatus( objetoIncremento.aStringIncremento() );
   }

} // fin de la clase PruebaIncremento

// clase que contiene variable constante
class Incremento {
   private int cuenta = 0;       // número de incrementos
   private int total = 0;       // total de todos los incrementos
   private final int INCREMENTO; // variable constante

   // inicializar constante INCREMENTO
   public Incremento( int valorIncremento )
   {
      INCREMENTO = valorIncremento; // inicializar variable constante (una vez)
   }

   // sumar INCREMENTO al total y sumar 1 a cuenta
   public void incrementar()
   {
      total += INCREMENTO;
      ++cuenta;
   }

   // devolver representación String de los datos de un objeto Incremento
   public String aStringIncremento()
   {
      return "Después de incremento " + cuenta + ": total = " + total;
   }

} // fin de la clase PruebaIncremento


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
