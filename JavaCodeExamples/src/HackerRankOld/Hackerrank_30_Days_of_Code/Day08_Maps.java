package Hackerrank_30_Days_of_Code;

import java.util.HashMap;
import java.util.Scanner;

public class Day08_Maps {
	
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> dictionay = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dictionay.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (dictionay.containsKey(s)) {
            	System.out.println(s + "=" + dictionay.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
	

}
