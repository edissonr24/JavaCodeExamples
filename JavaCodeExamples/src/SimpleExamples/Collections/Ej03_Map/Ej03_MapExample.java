package SimpleExamples.Collections.Ej03_Map;

import java.util.HashMap;
import java.util.Map;

public class Ej03_MapExample {

	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer,Ej03_Book> map = new HashMap<Integer,Ej03_Book>();
	    
	    //Creating Books    
	    Ej03_Book b1 = new Ej03_Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Ej03_Book b2 = new Ej03_Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Ej03_Book b3 = new Ej03_Book(103,"Operating System","Galvin","Wiley",6);    
	    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(3,b3); 
	    map.put(2,b2);	     
	      
	    //Traversing map  
	    for(Map.Entry<Integer, Ej03_Book> entry:map.entrySet()){    
	        int key = entry.getKey();  
	        Ej03_Book b = entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }   
	    System.out.println("-----------------------------------------------------");
	    
	    map.entrySet().forEach(entryKey -> {
	    	System.out.println(entryKey.getKey() + " Details:");  
	        System.out.println(entryKey.getValue().id +" "+entryKey.getValue().name+" "+entryKey.getValue().author+" "+ entryKey.getValue().publisher+" "+ entryKey.getValue().quantity);   
	    });
	    
	    System.out.println("-----------------------------------------------------");
	    
	    for (Integer key:map.keySet()) {
	    	System.out.println(key + " Details:");  
	        System.out.println(map.get(key).id +" "+ map.get(key).name+" "+map.get(key).author+" "+ map.get(key).publisher+" "+ map.get(key).quantity);
	    }
	    
	}    
}
