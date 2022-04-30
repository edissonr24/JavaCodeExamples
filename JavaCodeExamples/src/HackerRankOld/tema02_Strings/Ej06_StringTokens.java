package tema02_Strings;

import java.util.Scanner;

public class Ej06_StringTokens {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim();
        if(s.equals("")) {
            System.out.println("0");
            return;
        }
        
        String pattern = "[ !,?._'@]+";
        String[] items = s.trim().split(pattern);
        System.out.println(items.length);
        for(int i = 0; i < items.length; i++) {
        	System.out.println(items[i]);
        }
        scan.close();
	}
}

/*
He is a very very good boy, isn't he?
*/
