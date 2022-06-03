package SimpleExamples.DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ej05_Colas {
	public static void main(String[] args) {
        Queue<Ej05_Persona> cola = new PriorityQueue<Ej05_Persona>();

        cola.add(new Ej05_Persona("Daniel", 1));
        cola.add(new Ej05_Persona("Katherine", 3));
        cola.add(new Ej05_Persona("Julio", 2));
        cola.add(new Ej05_Persona("Maria", 1));

        while (!cola.isEmpty()) {
        	Ej05_Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getTipo());
        }
    }
}
