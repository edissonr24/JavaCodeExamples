// Fig. 11.21: ValidarFrame.java
// Validación de la información del usuario mediante expresiones regulares.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ValidarFrame extends JFrame {
   private JTextField telefonoCampoTexto, codigoPostalCampoTexto, estadoCampoTexto,
      ciudadCampoTexto, direccionCampoTexto, nombreCampoTexto, apellidoCampoTexto;

   public ValidarFrame()
   {
      super( "Validación" );
        
      // crear los componentes de GUI
      JLabel telefonoEtiqueta = new JLabel( "Teléfono" );
      JLabel codigoPostalEtiqueta = new JLabel( "C.P." );
      JLabel estadoEtiqueta = new JLabel( "Estado" );
      JLabel ciudadEtiqueta = new JLabel( "Ciudad" );
      JLabel direccionEtiqueta = new JLabel( "Dirección" );
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
      
      // agregar los componentes a la aplicación
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

   // maneja el evento de acción de aceptarBoton
   private void validarFecha()
   {
      // asegurar que no haya cuadros de texto vacíos
      if ( apellidoCampoTexto.getText().equals( "" ) || 
           nombreCampoTexto.getText().equals( "" ) ||
           direccionCampoTexto.getText().equals( "" ) || 
           ciudadCampoTexto.getText().equals( "" ) ||
           estadoCampoTexto.getText().equals( "" ) || 
           codigoPostalCampoTexto.getText().equals( "" ) ||
           telefonoCampoTexto.getText().equals( "" ) ) // fin de la condición
            
         JOptionPane.showMessageDialog( this, "Por favor llene todos los campos" );

      // si el formato de primer nombre es inválido, mostrar mensaje
      else if ( !nombreCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
         JOptionPane.showMessageDialog( this, "Primer nombre inválido" ); 

      // si el formato de apellido paterno es inválido, mostrar mensaje
      else if ( !apellidoCampoTexto.getText().matches( "[A-Z][a-zA-Z]*" ) )
         JOptionPane.showMessageDialog( this, "Apellido inválido" ); 

      // si el formato de dirección es inválido, mostrar mensaje
      else if ( !direccionCampoTexto.getText().matches( 
                "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Dirección inválida" );

      // si el formato de ciudad es inválido, mostrar mensaje
      else if ( !ciudadCampoTexto.getText().matches( 
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Ciudad inválida" ); 

      // si el formato de estado es inválido, mostrar mensaje
      else if ( !estadoCampoTexto.getText().matches( 
                "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) )
         JOptionPane.showMessageDialog( this, "Estado inválido" ); 

      // si el formato de código postal es inválido, mostrar mensaje
      else if ( !codigoPostalCampoTexto.getText().matches( "\\d{5}" ) )
         JOptionPane.showMessageDialog( this, "Código postal inválido" ); 

      // si el formato de teléfono es inválido, mostrar mensaje
      else if ( !telefonoCampoTexto.getText().matches( 
                 "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" ) )
         JOptionPane.showMessageDialog( this, "Número telefónico inválido" ); 
      
      else // la información es válida, avisar al usuario
         JOptionPane.showMessageDialog( this, "Gracias" ); 

   } // fin del método validarFecha

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

