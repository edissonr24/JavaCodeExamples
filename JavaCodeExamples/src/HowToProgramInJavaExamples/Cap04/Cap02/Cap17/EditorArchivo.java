// Fig. 17.22: EditorArchivo.java
// Esta clase declara m�todos para manipular los registros de una
// cuenta de banco en un archivo de acceso aleatorio.
import java.io.*;

import com.deitel.cpej5.cap17.RegistroCuentasAccesoAleatorio;

public class EditorArchivo {
   
   RandomAccessFile archivo; // referencia al archivo
   
   // abrir el archivo
   public EditorArchivo( File nombreArchivo ) throws IOException
   {
      archivo = new RandomAccessFile( nombreArchivo, "rw" );
   }
   
   // cerrar el archivo
   public void cerrarArchivo() throws IOException
   {
      if ( archivo != null )
         archivo.close();
   }
   
   // obtener un registro del archivo
   public RegistroCuentasAccesoAleatorio obtenerRegistro( int numeroCuenta )
      throws IllegalArgumentException, NumberFormatException, IOException
   {
      RegistroCuentasAccesoAleatorio registro = new RegistroCuentasAccesoAleatorio();

      if ( numeroCuenta < 1 || numeroCuenta > 100 )
         throw new IllegalArgumentException( "Fuera de rango" );

      // buscar registro apropiado en el archivo
      archivo.seek( ( numeroCuenta - 1 ) * RegistroCuentasAccesoAleatorio.TAMANIO );
      
      registro.leer( archivo );

      return registro;

   } // fin del m�todo obtenerRegistro
   
   // actualizar registro en el archivo
   public void actualizarRegistro( int numeroCuenta, String primerNombre, 
      String apellidoPaterno, double saldo )
      throws IllegalArgumentException, IOException
   {
      RegistroCuentasAccesoAleatorio registro = obtenerRegistro( numeroCuenta );
      if ( numeroCuenta == 0 )
         throw new IllegalArgumentException( "La cuenta no existe" );

      // buscar registro apropiado en el archivo
      archivo.seek( ( numeroCuenta - 1 ) * RegistroCuentasAccesoAleatorio.TAMANIO );   

      registro = new RegistroCuentasAccesoAleatorio( numeroCuenta,
         primerNombre, apellidoPaterno, saldo );
         
      registro.escribir( archivo ); // escribir registro actualizado en el archivo
      
   } // fin del m�todo actualizarRegistro
   
   // agregar registro al archivo
   public void nuevoRegistro( int numeroCuenta, String primerNombre, 
      String apellidoPaterno, double saldo )
      throws IllegalArgumentException, IOException
   {
      RegistroCuentasAccesoAleatorio registro = obtenerRegistro( numeroCuenta );
      
      if ( registro.obtenerCuenta() != 0 )
         throw new IllegalArgumentException( "La cuenta ya existe" );

       // buscar registro apropiado en el archivo
      archivo.seek( ( numeroCuenta - 1 ) * RegistroCuentasAccesoAleatorio.TAMANIO );   

      registro = new RegistroCuentasAccesoAleatorio( numeroCuenta, 
         primerNombre, apellidoPaterno, saldo );
         
      registro.escribir( archivo ); // escribir registro en el archivo
      
   } // fin del m�todo nuevoRegistro
   
   // eliminar registro del archivo
   public void eliminarRegistro( int numeroCuenta )
      throws IllegalArgumentException, IOException
   {
      RegistroCuentasAccesoAleatorio registro = obtenerRegistro( numeroCuenta );
      
      if ( registro.obtenerCuenta() == 0 )
         throw new IllegalArgumentException( "La cuenta no existe" );
      
      // buscar registro apropiado en el archivo
      archivo.seek( ( numeroCuenta - 1 ) * RegistroCuentasAccesoAleatorio.TAMANIO );

      // crear un registro en blanco para escribir en el archivo
      registro = new RegistroCuentasAccesoAleatorio();
      registro.escribir( archivo );
      
   } // fin del m�todo eliminarRegistro
   
} // fin de la clase EditorArchivo


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
