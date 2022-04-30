package tema04_DataStructures;

import java.util.Scanner;

public class Ej05_1DArrayP2 {
	 public static boolean canWin(int leap, int[] game) {
	     // Return true if you can win the game; otherwise, return false.
		 boolean win = false;
		 for(int i = 0; i < game.length; i++) {
			 if (game[i] == 0) {
				 win = true;
				 continue;
			 } else { 
				 int contador = i-1+leap;
				 if(contador >= game.length){
					 return true;
				 } else if (game[contador] == 1) {
					 return false;
				 } else if(game[contador] == 0){
					 i = i-1+leap;
				 }
			 }
			 if (i >= game.length){
				 return true;
			 }
		 }
		 return win;	 
	 }
	 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
