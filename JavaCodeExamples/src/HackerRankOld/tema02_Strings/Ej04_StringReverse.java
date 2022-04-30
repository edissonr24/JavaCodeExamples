package tema02_Strings;

import java.util.Scanner;

public class Ej04_StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String esPalindromo = "Yes";        
        for (int i = 1; i < A.length()/2; i++) {
        	if (A.charAt(i-1) != A.charAt(A.length()-i)) {
        		esPalindromo = "No";
        		break;
        	}
        }
        System.out.println(esPalindromo);
        
//        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
//        	    ? "Yes" : "No" );
	}
}

/*
madam
*/