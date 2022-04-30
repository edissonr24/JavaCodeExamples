// Fig. 16.11: SalidaRunnable.java
// La clase SalidaRunnable actualiza el objeto JTextArea con los resultados
import javax.swing.*;

public class SalidaRunnable implements Runnable {
   private JTextArea areaSalida;
   private String mensajeParaAnexar;
    
   // inicializar areaSalida y mensaje
   public SalidaRunnable( JTextArea salida, String mensaje )
   {
      areaSalida = salida;
      mensajeParaAnexar = mensaje;
   }
    
   // método llamado por SwingUtilities.invokeLater para actualizar areaSalida
   public void run()
   {
      areaSalida.append( mensajeParaAnexar );
   }
    
} // fin de la clase SalidaRunnable

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

