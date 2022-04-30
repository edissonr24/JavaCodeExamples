package tema01_Introduction;

import java.util.Scanner;

public class Ej02_StdinStdout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);		
	}
}
/*
42
100
125
*/
