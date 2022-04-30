package tema01_Introduction;

import java.util.Scanner;

public class Ej05_OutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for(int i = 0; i < 3; i++){
			String s1 = sc.next();
			int x = sc.nextInt();
			StringBuffer linea = new StringBuffer();
           
           String numero = String.format("%03d",x);
           linea.append(s1);
           for (int j = 0; j < (15 - s1.length()); j++) {
         	  linea.append(" ");            	  
           }
           linea.append(numero);
           
           //Complete this line
           System.out.println(linea);
       }
         System.out.println("================================");
	}
}

/*
java 100
cpp 65
python 50
 */
