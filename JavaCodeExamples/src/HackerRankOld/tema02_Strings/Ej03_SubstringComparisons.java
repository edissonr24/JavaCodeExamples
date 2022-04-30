package tema02_Strings;

import java.util.Scanner;

public class Ej03_SubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int i = 0;
        int compare = 0;
        String actual = null;
        smallest = actual = s.substring(i, i+k);
        largest = actual = s.substring(i, i+k);
        
        while(i < s.length() - k+1) {
        	actual = s.substring(i, i+k);
        	i++;
        	
        	compare = actual.compareTo(smallest);
            if(compare < 0)
            	smallest = actual;
                        	
            compare = actual.compareTo(largest);
            if(compare > 0)
            	largest = actual;            
        }
                
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
welcometojava
3
*/
