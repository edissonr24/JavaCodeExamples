package T09_Colecciones;

import java.util.Iterator;
import java.util.TreeSet;

public class Ej01_TreeSetExample {

	public static void main(String[] args) {
		
		System.out.println("Tree Set Example!\n");
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
	 
		// here it test it's sorted, 63 is the last element. see output below
		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Datos actuales: ");
	 
		// Displaying the Tree set data
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	 
		// Check empty or not
		if (tree.isEmpty()) {
			System.out.print("Arbol esta vacío.");
		} else {
			System.out.println("Tamaño del TreeSet: " + tree.size());
		}
	 
		// Retrieve first data from tree set
		System.out.println("Primer dato del TreeSet: " + tree.first());
	 
		// Retrieve last data from tree set
		System.out.println("Ultimo dato del TreeSet: " + tree.last());
	 
		if (tree.remove(45)) { // remove element by value
			System.out.println("Elemento 45 es removido del TreeSet");
		} else {
			System.out.println("Dato no existe!");
		}
		System.out.print("Ahora el TreeSet contiene: ");
		iterator = tree.iterator();
	 
		// Displaying the Tree set data
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("Ahora el tamaño del TreeSet: " + tree.size());
	 
		// Remove all
		tree.clear();
		if (tree.isEmpty()) {
			System.out.print("TreeSet esta vacío.");
		} else {
			System.out.println("Tamaño del TreeSet: " + tree.size());
		}
	   }
	
}
