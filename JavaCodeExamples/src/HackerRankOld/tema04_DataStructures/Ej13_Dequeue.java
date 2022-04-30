package tema04_DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Ej13_Dequeue {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        int mayor = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            deque.add(num);
            hs.add(num);
            
            if (deque.size() == m+1){
            	int actual = (int) deque.remove();
            	if(!deque.contains(actual)){
            		hs.remove(actual);
            	}            	
            }
            
            if(hs.size() > mayor){
            	mayor = hs.size();
            }            
        }
        System.out.println(mayor);
    }
}
