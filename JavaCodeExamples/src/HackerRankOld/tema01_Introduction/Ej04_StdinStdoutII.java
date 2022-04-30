package tema01_Introduction;

import java.util.Scanner;

public class Ej04_StdinStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}

/*
42
3,1415
Welcome to HackerRank's Java tutorials!
*/