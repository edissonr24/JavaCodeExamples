package tema04_DataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class Ej09_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> hset = new HashSet<String>();
        for (int i = 0; i < t; i++) {
        	hset.add(pair_left[i] + pair_right[i]);
        	System.out.println(hset.size());
        }
		
	}

}
