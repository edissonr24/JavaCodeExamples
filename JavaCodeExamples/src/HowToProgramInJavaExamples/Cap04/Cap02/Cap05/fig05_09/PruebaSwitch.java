// Fig. 5.7: PruebaSwitch.java
// Dibujar líneas, rectángulos u óvalos con base en la entrada del usuario.
import java.awt.Graphics;

import javax.swing.*;

public class PruebaSwitch extends JApplet {
   int opcion;  // la opcion del usuario en cuanto a cuál figura dibujar

   // inicializar el subprograma, obteniendo la opción del usuario
   public void init()
   {
      String entrada;  // la entrada del usuario

      // obtener la opción del usuario
      entrada = JOptionPane.showInputDialog( 
         "Escriba 1 para dibujar líneas\n" +
         "Escriba 2 para dibujar rectángulos\n" +
         "Escriba 3 para dibujar óvalos\n" );

      opcion = Integer.parseInt( entrada );  // convertir entrada en int

   } // fin del método init

   // dibujar figuras en el fondo del subprograma
   public void paint( Graphics g )
   {
      super.paint( g );  // llamar al método paint heredado de JApplet

      for ( int i = 0; i < 10; i++ ) {  // iterar 10 veces (0-9)

         switch ( opcion ) {  // determinar la figura a dibujar

            case 1:  // dibujar una línea
               g.drawLine( 10, 10, 250, 10 + i * 10 );
               break;  // fin de procesamiento de case

            case 2:  // dibujar un rectángulo
               g.drawRect( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );
               break;  // fin de procesamiento de case

            case 3:  // dibujar un óvalo
               g.drawOval( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );
               break;  // fin de procesamiento de case

            default: // dibujar cadena indicando que se escribió un valor incorrecto
               g.drawString( "Se escribió un valor incorrecto", 
                  10, 20 + i * 15 );

         } // fin de instrucción switch 

      } // fin de instrucción for 

   } // fin del método paint

} // fin de la clase PruebaSwitch

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
