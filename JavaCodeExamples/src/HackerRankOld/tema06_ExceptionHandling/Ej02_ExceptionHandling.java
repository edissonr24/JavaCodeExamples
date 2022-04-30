package tema06_ExceptionHandling;

import java.util.Scanner;

public class Ej02_ExceptionHandling {
	public static final Ej02_MyCalculator my_calculator = new Ej02_MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

/*
3 5
2 4
0 0
-1 -2
-1 3
*/
