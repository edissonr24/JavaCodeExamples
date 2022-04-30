package Hackerrank_30_Days_of_Code;

import java.util.Scanner;

public class Day10_Binary {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Long.toString(toBinary(n));
        int mayor = 0;
        int c = 0;
        for (int i = 0; i < binary.length(); i++) {
        	
        	int valor = Integer.parseInt(String.valueOf(binary.charAt(i)));
        	if (valor == 1){
        		c++;
        		if (c > mayor) {
        			mayor = c;
        		}
        	} else {
        		c = 0;
        	}
        }
        System.out.println(mayor);
    }

	 /**
     * Hace la conversión de base 10 a base 2 (binario)
     *
     * Debemos dividir n por 2 sucesivamente hasta que el resultado es 0, y
     * la representación binaria resultante estará compuesto por los restos de
     * todas las divisiones, desde el último al primero.
     */
    public static long toBinary(int n) {
        String b = ""; // binary representation as a string
        while (n != 0) {
            int r = (int)(n % 2); // remainder
            b = r + b; // concatenate remainder
            n /= 2; // reduce n
        }
        return Long.parseLong(b);
    }
    
//  5 / 2 = 2 sobra 1
//	2 / 2 = 1 sobra 0
//	1 / 2 = 0 sobra 1
	 
}
