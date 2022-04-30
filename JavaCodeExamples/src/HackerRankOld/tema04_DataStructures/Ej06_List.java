package tema04_DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej06_List {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i < N; i++){
			list.add(scan.nextInt());
		}
		
		int Q = scan.nextInt();
		
		for(int j=0; j<Q; j++){
			String operacion = scan.next();
			
			if(operacion.equals("Insert")){
				int x = scan.nextInt();
				int y = scan.nextInt();
				list.add(x, y);
			}
			if(operacion.equals("Delete")){
				int x = scan.nextInt();
				list.remove(x);
			}
		}
		for(int k=0; k < list.size(); k++){
			System.out.print(list.get(k) + " ");
		}
		
	}
}


/*
5
12 0 1 78 12
2
Insert
5 23
Delete
0
*/