// Fig. 8.12: Empleado.java
// Declaración de la clase Empleado.
public class Empleado {
   private String primerNombre;
   private String apellidoPaterno;
   private static int cuenta = 0;  // número de objetos en la memoria

   // inicializar empleado, sumar 1 a la cuenta estática y 
   // mostrar String indicando que se llamó al constructor
   public Empleado( String nombre, String apellido )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;

      ++cuenta;  // incrementar cuenta estática de empleados
      System.out.println( "Constructor de Empleado: " +
         primerNombre + " " + apellidoPaterno );
   }

   // restar 1 de la cuenta estática cuando el recolector de basura
   // llama a finalize para limpiar el objeto y mostrar String
   // indicando que se llamó a finalize
   protected void finalize()
   {
      --cuenta;  // decrementar cuenta estática de empleados
      System.out.println( "Finalizador de Empleado: " +
         primerNombre + " " + apellidoPaterno + "; cuenta = " + cuenta );
   }

   // obtener primer nombre
   public String obtenerPrimerNombre() 
   { 
      return primerNombre; 
   }

   // obtener apellido
   public String obtenerApellidoPaterno() 
   { 
      return apellidoPaterno; 
   }

   // método estático para obtener el valor de la cuenta estática
   public static int obtenerCuenta() 
   { 
      return cuenta; 
   } 

} // fin de la clase Empleado


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
