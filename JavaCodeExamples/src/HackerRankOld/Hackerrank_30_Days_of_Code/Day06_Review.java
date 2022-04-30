package Hackerrank_30_Days_of_Code;

import java.util.Scanner;

public class Day06_Review {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String s = scan.next();
			Character[] palabra = new Character[s.length()];
			for(int j = 0; j<s.length(); j++){
				palabra[j] = s.charAt(j);				
			}
			
			for(int k = 0; k < palabra.length; k++) {
				System.out.print(palabra[k]);
				k++;
			}
			System.out.print(" ");
			for(int k = 1; k < palabra.length; k++) {
				System.out.print(palabra[k]);
				k++;
			}			
			
			System.out.println("");
		}
	}
	
}
