// ConstantesSocketMessenger.java
// ConstantesSocketMessenger define las constantes para los números de puerto
// y dirección de transmisión múltiple en DeitelMessenger
package com.deitel.messenger.sockets;

public interface ConstantesSocketMessenger {
   
   // dirección para transmisión múltiple de datagramas
   public static final String DIRECCION_MULTICAST = "239.0.0.1";
   
   // puerto para escuchar transmisión múltiple de datagramas
   public static final int PUERTO_ESCUCHA_MULTICAST = 5555;
   
   // puerto para enviar datagramas de transmisión múltiple
   public static final int PUERTO_ENVIO_MULTICAST = 5554;
   
   // puerto para conexiones de objetos Socket a ServidorDeitelMessenger
   public static final int PUERTO_SERVIDOR = 12345;   
   
   // Objeto String que indica desconexión
   public static final String CADENA_DESCONEXION = "DESCONECTAR";

   // Objeto String que separa el nombre del usuario del cuerpo del mensaje
   public static final String SEPARADOR_MENSAJE = ">>>";

   // tamaño del mensaje (en bytes)
   public static final int TAMANIO_MENSAJE = 512;
}


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
 