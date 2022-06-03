package SimpleExamples.Collections.Ej01_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ej01_SetExample {
	
	public static void main(String[] args){
		Set<String> setA = new HashSet<String>();

		setA.add("element 0");
		setA.add("element 3");
		setA.add("element 4");
		setA.add("element 1");
		setA.add("element 1");
		
		//access via Iterator		
		Iterator<String> iterator = setA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println("Elemento con iterador: " + element);
		}


		//access via new for-loop
		for(String object : setA) {
		    //String element = (String) object;
		    System.out.println("Elemento con for: " + object);
		}
	}

	
	
	
}
