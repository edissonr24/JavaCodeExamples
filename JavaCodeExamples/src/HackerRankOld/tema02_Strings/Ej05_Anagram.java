package tema02_Strings;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ej05_Anagram {

	static boolean isAnagram(String a, String b) {
        // Complete the function
		char arrayA[] = new char[a.length()];
		char arrayB[] = new char[b.length()];
		
		if (a.length() != b.length())
			return false;
		
		for (int i = 0; i < a.length(); i++){
			arrayA[i] = Character.toLowerCase(a.charAt(i));
			arrayB[i] = Character.toLowerCase(b.charAt(i));
		}
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		for (int i = 0; i < a.length(); i++){
			if(arrayA[i] != arrayB[i])
				return false;
		}
		return true;		
		
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
}

/*
anagramm
marganaa

anagramm
marganam
*/
