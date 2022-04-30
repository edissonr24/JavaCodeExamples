// Fig. 6.9: Craps.java
// Craps.
import java.awt.*;        // Container, FlowLayout
import java.awt.event.*;  // ActionEvent, ActionListener

import javax.swing.*;     // JApplet, JButton, JLabel, JTextField

public class Craps extends JApplet implements ActionListener {

   // variables constantes para el estado del juego
   final int GANADO = 0, PERDIDOS = 1, CONTINUAR = 2; 
   
   boolean primerTiro = true;  // verdadero si es el primer tiro del dado
   int sumaDeDados = 0;         // suma de los dados
   int miPunto = 0;           // punto si no gana o pierde en el primer tiro
   int estadoJuego = CONTINUAR; // el juego no se acaba todav�a

   // componentes de la interfaz gr�fica de usuario 
   JLabel dado1Etiqueta, dado2Etiqueta, sumaEtiqueta, puntoEtiqueta;
   JTextField dado1Campo, dado2Campo, sumaCampo, puntoCampo;
   JButton tirarBoton;

   // configurar componentes de GUI
   public void init()
   {
      // obtener panel de contenido y cambiar su esquema a FlowLayout
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout() );      

      // crear etiqueta y campo de texto para el dado 1
      dado1Etiqueta = new JLabel( "Dado 1" );
      contenedor.add( dado1Etiqueta );
      dado1Campo = new JTextField( 10 );
      dado1Campo.setEditable( false );
      contenedor.add( dado1Campo );

      // crear etiqueta y campo de texto para el dado 2
      dado2Etiqueta = new JLabel( "Dado 2" );
      contenedor.add( dado2Etiqueta );
      dado2Campo = new JTextField( 10 );
      dado2Campo.setEditable( false );
      contenedor.add( dado2Campo );

      // crear etiqueta y campo de texto para suma
      sumaEtiqueta = new JLabel( "La suma es" );
      contenedor.add( sumaEtiqueta );
      sumaCampo = new JTextField( 10 );
      sumaCampo.setEditable( false );
      contenedor.add( sumaCampo );

      // crear etiqueta y campo de texto para punto
      puntoEtiqueta = new JLabel( "El punto es" );
      contenedor.add( puntoEtiqueta );
      puntoCampo = new JTextField( 10 );
      puntoCampo.setEditable( false );
      contenedor.add( puntoCampo );

      // crear el bot�n que el usuario oprime para tirar los dados
      tirarBoton = new JButton( "Tirar dados" );
      tirarBoton.addActionListener( this );
      contenedor.add( tirarBoton );

   } // fin del m�todo init

   // procesar un tiro de los dados
   public void actionPerformed( ActionEvent actionEvent )
   {
      sumaDeDados = tirarDados();  // tirar los dados
      
      // primer tiro de los dados
      if ( primerTiro ) {               
   
         switch ( sumaDeDados ) {

            // gana en primer tiro
            case 7: 
            case 11:         
               estadoJuego = GANADO;
               puntoCampo.setText( "" );  // borrar campo punto
               break;

            // pierde en primer tiro
            case 2: 
            case 3: 
            case 12: 
               estadoJuego = PERDIDOS;
               puntoCampo.setText( "" );  // borrar campo punto
               break;

            // recuerda el punto
            default:                 
               estadoJuego = CONTINUAR;
               miPunto = sumaDeDados;
               puntoCampo.setText( Integer.toString( miPunto ) );
               primerTiro = false;
               break;

         } // fin de instrucci�n switch 

      } // fin de la parte if de la instrucci�n if...else

      else { // tiro subsecuente de los dados
          
         // determinar estado del juego
         if ( sumaDeDados == miPunto )  // gana llegando al punto
            estadoJuego = GANADO;
         else
            if ( sumaDeDados == 7 )     // pierde tirando un 7
               estadoJuego = PERDIDOS;

      } // fin de la parte else de la instrucci�n if...else

      mostrarMensaje();   // mostrar un mensaje indicando el estado del juego

   } // fin del m�todo actionPerformed

   // tirar dados, calcular suma y mostrar resultados
   public int tirarDados()
   {
      // elegir valores aleatorios para los dados
      int dado1 = 1 + ( int ) ( Math.random() * 6 );  
      int dado2 = 1 + ( int ) ( Math.random() * 6 );

      int suma = dado1 + dado2;   // sumar valores de los dados

      // mostrar resultados en campos de texto
      dado1Campo.setText( Integer.toString( dado1 ) );
      dado2Campo.setText( Integer.toString( dado2 ) );
      sumaCampo.setText( Integer.toString( suma ) );

      return suma;  // devolver suma de los dados

   } // fin del m�todo tirarDados
   
   // determinar estado del juego; mostrar el mensaje apropiado en la barra de estado
   public void mostrarMensaje()
   {
      // el juego debe continuar
      if ( estadoJuego == CONTINUAR )
         showStatus( "Tirar de nuevo." );

      else { // juego ganado o perdido

         if ( estadoJuego == GANADO )
            showStatus( "El jugador gana. Haga clic en Tirar dados para jugar de nuevo." );
         else 
            showStatus( "El jugador pierde. Haga clic en Tirar dados para jugar de nuevo." );
         
         primerTiro = true;  // el siguiente tiro es el primero de un nuevo juego

      } // fin de la parte else de la instrucci�n if...else

   } // fin del m�todo mostrarMensaje

} // fin de la clase Craps


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
