// Fig. 17.23: PruebaFileChannel.java
// Demuestra el uso de FileChannel y ByteBuffer.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class PruebaFileChannel {
   private FileChannel canalArchivo;

   // constructor sin argumentos
   public PruebaFileChannel()
   {
      // crear archivo de acceso aleatorio y obtener canal del archivo
      try {
         RandomAccessFile archivo = new RandomAccessFile( "Prueba", "rw" );
         canalArchivo = archivo.getChannel();
      }
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }

   } // fin del constructor de PruebaFileChannel

   // escribir en canalArchivo
   public void escribirAlArchivo() throws IOException
   {
      // crear búfer para escritura
      ByteBuffer bufer = ByteBuffer.allocate( 14 );

      // escribir un int, un char y un double en bufer
      bufer.putInt( 100 );
      bufer.putChar( 'A' );
      bufer.putDouble( 12.34 );

      // voltear bufer y escribirlo en canalArchivo
      bufer.flip();
      canalArchivo.write( bufer );
   } 

   // leer de canalArchivo
   public void leerDeArchivo() throws IOException
   {
      String contenido = "";

      // crear bufer para lectura
      ByteBuffer bufer = ByteBuffer.allocate( 14 );
      
      // leer bufer de canalArchivo
      canalArchivo.position( 0 );
      canalArchivo.read( bufer );

      // voltear bufer para lectura
      bufer.flip();

      // obtener contenido
      contenido += bufer.getInt() + ", " + bufer.getChar() + ", " + 
         bufer.getDouble();

      System.out.println( "El archivo contiene: " + contenido );

      // cerrar canalArchivo
      canalArchivo.close();

   } // fin del método leerDeArchivo

   public static void main( String[] args ) 
   {
      PruebaFileChannel aplicacion = new PruebaFileChannel();
      
      // escribir en el archivo y después leer del archivo
      try {
         aplicacion.escribirAlArchivo();
         aplicacion.leerDeArchivo();
      } 
      catch ( IOException excepcionES ) {
         excepcionES.printStackTrace();
      }
   } 

} // fin de la clase PruebaFileChannel


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
 