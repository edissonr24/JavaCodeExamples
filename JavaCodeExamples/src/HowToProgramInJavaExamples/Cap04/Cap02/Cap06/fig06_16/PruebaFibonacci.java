// Fig. 6.16: PruebaFibonacci.java
// Método recursivo fibonacci.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaFibonacci extends JApplet implements ActionListener {
   JLabel numeroEtiqueta, resultadoEtiqueta;
   JTextField numeroCampo, resultadoCampo;

   // configurar la GUI del subprograma
   public void init()
   {
      // obtener el panel de contenido y establecer su esquema como FlowLayout
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );

      // crear numeroEtiqueta y adjuntarlo al panel de contenido
      numeroEtiqueta = new JLabel( "Escriba un entero y oprima Intro" );
      contenedor.add( numeroEtiqueta );

      // crear numeroCampo y adjuntarlo al panel de contenido
      numeroCampo = new JTextField( 10 );
      contenedor.add( numeroCampo );

      // registrar este subprograma como ActionListener de numeroCampo
      numeroCampo.addActionListener( this );

      // crear resultadoEtiqueta y adjuntarlo al panel de contenido
      resultadoEtiqueta = new JLabel( "El valor de Fibonacci es" );
      contenedor.add( resultadoEtiqueta );

      // crear numeroCampo, hacerlo no editable
      // y adjuntarlo al panel de contenido
      resultadoCampo = new JTextField( 15 );
      resultadoCampo.setEditable( false );
      contenedor.add( resultadoCampo );

   } // fin del método init

   // obtener entrada del usuario y llamar al método fibonacci
   public void actionPerformed( ActionEvent event )
   {  
      long numero, valorFibonacci;

      // obtener entrada del usuario y convertirla en long
      numero = Long.parseLong( numeroCampo.getText() );

      showStatus( "Calculando ..." ); 

      // calcular valor de fibonacci para el número introducido por el usuario
      valorFibonacci = fibonacci( numero );

      // indicar que el procesamiento se completó y mostrar el resultado
      showStatus( "Listo." );   
      resultadoCampo.setText( Long.toString( valorFibonacci ) );

   } // fin del método actionPerformed
  
   // declaración recursiva del método fibonacci
   public long fibonacci( long n )
   {
      // caso base
      if ( n == 0 || n == 1 )  
         return n;

      // paso recursivo
      else
         return fibonacci( n - 1 ) + fibonacci( n - 2 );

   } // fin del método fibonacci

} // fin de la clase PruebaFibonacci


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
