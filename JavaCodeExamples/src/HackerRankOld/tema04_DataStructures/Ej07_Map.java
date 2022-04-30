package tema04_DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class Ej07_Map {

	public static void main(String []argh) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      HashMap<String, Integer> directory = new HashMap<String, Integer>();
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         directory.put(name, phone);
         System.out.println("--" + name + phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         System.out.println("str " + s);
         if(directory.containsKey(s)) {
        	 System.out.println(s + "=" + directory.get(s));
         } else {
        	 System.out.println("Not found");
         }
         
      }
   }
}
