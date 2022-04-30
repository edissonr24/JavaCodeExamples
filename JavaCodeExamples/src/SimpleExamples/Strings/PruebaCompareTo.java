
public class PruebaCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "a";
		String str2 = "b";
	    String str3 = "Integers are not immutable";
	    String str4 = null;
	
	    int result = str2.compareTo( str1 );
	    System.out.println(result);
	    
	    result = str3.compareTo( str1 );
	    System.out.println(result);
		  
	    result = str2.compareTo( str3 );
	    System.out.println(result);
		 
	    result = str3.compareTo( str1 );
	    System.out.println(result);
	    
//	    result = str3.compareTo( str4 );
//	    System.out.println(result);
	    
	   
	    
	    try {
	    	result = str4.compareTo( str3 );
	 	    System.out.println(result);
		} catch (NullPointerException e) {
			 System.out.println("Error");
		}	
	}

}
