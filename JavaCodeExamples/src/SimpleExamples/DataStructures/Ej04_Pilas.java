package T08_EstructurasDeDatos;

import java.util.Stack;

public class Ej04_Pilas {
	public static void main(String[] args) {
        //Crear pila (en inglés Stack) para datos de tipo String.
        Stack < String > pila = new Stack < String >();
        
        //apliando en la pila
        pila.push("primero");
        System.out.println("\nIr apilando:\n" + pila);
        pila.push("segundo");
        System.out.println(pila);
        pila.push("tercero");
        System.out.println(pila);
        
        //desapilando en la pila
        pila.pop();
        System.out.println("\nIr desapilando:\n" + pila);
        pila.pop();
        System.out.println(pila);
        pila.pop();
        System.out.println(pila);
        
    }
}
