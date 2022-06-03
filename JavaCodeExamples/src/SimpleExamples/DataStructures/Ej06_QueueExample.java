package SimpleExamples.DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ej06_QueueExample {

	public static void main(String[] args) {
		Queue queueA = new LinkedList();

		queueA.add("element 20");
		queueA.add("element 1");
		queueA.add("element 2");

		//access via Iterator
		Iterator iterator = queueA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println("Iterador: " + element);
		}

		//access via new for-loop
		for(Object object : queueA) {
		    String element = (String) object;
		    System.out.println("For-loop: " + element);
		}
	}
}
