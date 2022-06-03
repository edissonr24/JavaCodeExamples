package SimpleExamples.Collections.Ej01_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Ej01_HashSetExample {

	public static void main(String args[]) {
		
		HashSet<String> hset = new HashSet<String>();
		
		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
      
		//Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
      
		//Addition of null values
		hset.add(null);
		hset.add(null);

		//Displaying HashSet elements
		System.out.println(hset );
		
		//Displaying using iterator
		Iterator iterator = hset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------------------");
		
		//Displaying using for
		for (String value:hset) {
			System.out.println(value);
		}
		
		System.out.println("-----------------------------");
		
		//Displaying using lambda
		hset.stream().forEach(s -> System.out.println(s));
		System.out.println("-----------------------------");
		hset.stream().forEach(System.out::println);
	}
	
}
