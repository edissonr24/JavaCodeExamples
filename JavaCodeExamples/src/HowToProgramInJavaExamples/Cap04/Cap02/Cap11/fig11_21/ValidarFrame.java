// Fig. 11.21: ValidarFrame.java
// Validaci�n de la informaci�n del usuario mediante expresiones regulares.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ValidarFrame extends JFrame {
   private JTextField telefonoCampoTexto, codigoPostalCampoTexto, estadoCampoTexto,
      ciudadCampoTexto, direccionCampoTexto, nombreCampoTexto, apellidoCampoTexto;

   public ValidarFrame()
   {
      super( "Validaci�n" );
        
      // crear los componentes de GUI
      JLabel telefonoEtiqueta = new JLabel( "Tel�fono" );
      JLabel codigoPostalEtiqueta = new JLabel( "C.P." );
      JLabel estadoEtiqueta = new JLabel( "Estado" );
      JLabel ciudadEtiqueta = new JLabel( "Ciudad" );
      JLabel direccionEtiqueta = new JLabel( "Direcci�n" );
      JLabel nombreEtiqueta = new JLabel( "Primer nombre" );
      JLabel apellidoEtiqueta = new JLabel( "Apellido paterno" );
         
      JButton aceptarBoton = new JButton( "Aceptar" );
      aceptarBoton.addActionListener( 
            
         new ActionListener() { // clase interna

            public void actionPerformed( ActionEvent evento ) {
               validarFecha();
            }
               
         } // fin de la clase interna
         
      ); // fin de la llamada a addActionListener
         
      telefonoCampoTexto = new JTextField( 15 );
      codigoPostalCampoTexto = new JTextField( 5 );
      estadoCampoTexto = new JTextField( 2 );
      ciudadCampoTexto = new JTextField( 12 );
      direccionCampoTexto = new JTextField( 20 );
      nombreCampoTexto = new JTextField( 20 );
      apellidoCampoTexto = new JTextField( 20 );
      
      JPanel primerNombre = new JPanel();
      primerNombre.add( nombreEtiqueta );
      primerNombre.add( nombreCampoTexto );
      
      JPanel apellidoPaterno = new JPanel();
      apellidoPaterno.add( apellidoEtiqueta );
      apellidoPaterno.add( apellidoCampoTexto );
      
      JPanel direccion1 = new JPanel();
      direccion1.add( direccionEtiqueta );
      direccion1.add( direccionCampoTexto );
      
      JPanel direccion2 = new JPanel();
      direccion2.add( ciudadEtiqueta );
      direccion2.add( ciudadCampoTexto );
      direccion2.add( estadoEtiqueta );
      direccion2.add( estadoCampoTexto );
      direccion2.add( codigoPostalEtiqueta );
      direccion2.add( codigoPostalCampoTexto );
      
      JPanel telefono = new JPanel();
      telefono.add( telefonoEtiqueta );
      telefono.add( telefonoCampoTexto );
      
      JPanel aceptar = new JPanel();
      aceptar.add( aceptarBoton );
      
      // agregar los componentes a la aplicaci�n
      Container contenedor = getContentPane();
      contenedor.setLayout( new GridLayout( 6, 1 ) );

      contenedor.add( primerNombre );
      contenedor.add( apellidoPaterno );
      contenedor.add( direccion1 );
      contenedor.add( direccion2 );
      contenedor.add( telefono );
      contenedor.add( aceptar );
         
      setSize( 400, 225 );
      setVisible( true );

   } // fin del constructor de ValidarFrame

   public static void main( String args[] ) 
   {
      ValidarFrame aplicacion = new ValidarFrame();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   // maneja el evento de acci�n de aceptarBoton
   private void validarFecha()
   {
      // asegurar que no haya cuadros de texto vac�os
      if ( apellidoCampoTexto.getText().equals( "" ) || 
           nombreCampoTexto.getText().equals( "" ) ||
           direccionCampoTexto.getText().equals( "" ) || 
           ciudadCampoTexto.getText().equals( "" ) ||
           estadoCampoTexto.getText().equals( "" ) || 
           codigoPostalCampoTexto.getText().equals( "" ) ||
           telefonoCampoTexto.getText().equals( "" ) ) // fin de la condici�n
            
         JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );

      // si el formato de primer nombre es inv�lido, mostrar mensaje
      else if ( !nombreCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
         JOptionPane.showMessageDialog( this, "Primer nombre inv�lido" ); 

      // si el formato de apellido paterno es inv�lido, mostrar mensaje
      else if ( !apellidoCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
         JOptionPane.showMessageDialog( this, "Apellido inv�lido" ); 

      // si el formato de direcci�n es inv�lido, mostrar mensaje
      else if ( !direccionCampoTexto.getText().matches( 
                "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Direcci�n inv�lida" );

      // si el formato de ciudad es inv�lido, mostrar mensaje
      else if ( !ciudadCampoTexto.getText().matches( 
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Ciudad inv�lida" ); 

      // si el formato de estado es inv�lido, mostrar mensaje
      else if ( !estadoCampoTexto.getText().matches( 
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Estado inv�lido" ); 

      // si el formato de c�digo postal es inv�lido, mostrar mensaje
      else if ( !codigoPostalCampoTexto.getText().matches( "\\d{5}" ) )
         JOptionPane.showMessageDialog( this, "C�digo postal inv�lido" ); 

      // si el formato de tel�fono es inv�lido, mostrar mensaje
      else if ( !telefonoCampoTexto.getText().matches( 
                 "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" ) )
         JOptionPane.showMessageDialog( this, "N�mero telef�nico inv�lido" ); 
      
      else // la informaci�n es v�lida, avisar al usuario
         JOptionPane.showMessageDialog( this, "Gracias" ); 

   } // fin del m�todo validarFecha

} // fin de la clase ValidarFrame

/*
 **************************************************************************
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
 **************************************************************************
*/

