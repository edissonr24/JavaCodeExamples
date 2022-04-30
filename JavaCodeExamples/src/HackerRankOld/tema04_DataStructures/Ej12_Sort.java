package tema04_DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej12_Sort {
	public static void main(String[] args){
	  Scanner in = new Scanner(System.in);
	  int testCases = Integer.parseInt(in.nextLine());
	  
	  List<Ej12_Student> studentList = new ArrayList<Ej12_Student>();
	  while(testCases>0){
	     int id = in.nextInt();
	     String fname = in.next();
	     double cgpa = in.nextDouble();
	     
	     Ej12_Student st = new Ej12_Student(id, fname, cgpa);
	     studentList.add(st);
	     
	     testCases--;
      }
      
      Collections.sort(studentList);
      for(Ej12_Student st: studentList){
          System.out.println(st.getFname());
      }
   }

}
/*
5
33 Rumpa 3,68
85 Ashis 3,85
56 Samiha 3,75
19 Samara 3,75
22 Fahim 3,76
 */
