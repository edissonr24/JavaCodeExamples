package tema01_Introduction;

import java.util.Scanner;

public class Ej07_LoopsII {
                                             
	public static void main(String[] args) {	// 2
		Scanner in = new Scanner(System.in);    // 0 2 10
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int acum = a;
            for (int j = 0; j < n; j++) {	        	
            	acum += (int) (Math.pow(2, j) * b);
            	System.out.print(acum + " ");           	
	        }
            System.out.println("");
        }
        in.close();
	}
}

/*
2
0 2 10
5 3 5
*/