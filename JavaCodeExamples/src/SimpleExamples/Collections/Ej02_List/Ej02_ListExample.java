package SimpleExamples.Collections.Ej02_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ej02_ListExample {

	public static void main(String[] args) {
		List listA = new ArrayList();

		listA.add("element 0");
		listA.add("element 2");
		listA.add("element 1");

		//access via index
		String element0 = (String) listA.get(0);
		String element1 = (String) listA.get(1);
		String element3 = (String) listA.get(2);


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println("Iterador: " + element);
		}
		
		Collections.sort(listA);

		//access via new for-loop
		for(Object object : listA) {
		    String element = (String) object;
		    System.out.println("For-loop: " + element);
		}
	}
	
}
