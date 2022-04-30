package tema04_DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej01_ArrayList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>(n);
		
		for(int i = 0; i < n; i++){
			int d = scan.nextInt();
			ArrayList<Integer> row = new ArrayList<Integer>(d);
			
			for (int j = 0; j < d; j++) {
				int e = scan.nextInt();
				row.add(e);
			}
			rows.add(row);			
		}
		
		int q = scan.nextInt();
		
		for(int k = 0; k < q; k++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			try {
				System.out.println("Elemento en linea " + x + ": " + rows.get(x-1).get(y-1));
			} catch(IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

	}

}
