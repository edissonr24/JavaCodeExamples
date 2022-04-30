package tema04_DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Ej04_Subarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Declare array a here
        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
            // Fill array a here
        }
        
        scan.close();
        int contador = 0;
        for(int i=0; i < a.length; i++){
        	for(int j=i; j < a.length; j++){
        		int[] subArray = Arrays.copyOfRange(a, i, j+1);
        		int suma = 0;
        		for(int k=0; k < subArray.length; k++){
        			
        			suma += subArray[k];
        		}
        		if(suma < 0){
        			contador++;
        		}
        		
        	}        	
        }
        System.out.println(contador);

	}

}
