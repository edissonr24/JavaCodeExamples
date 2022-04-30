package tema04_DataStructures;

import java.util.Scanner;

public class Ej03_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        for(int i=0; i <= 3; i++){
        	for(int j=0; j <= 3; j++){
        		suma =  arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        		System.out.println(i + "-" + j + "= " + suma);
	            if(suma > mayor){
	              mayor = suma; 
	            }
        	}
        }
        System.out.println(mayor);
		
		
	}

}
