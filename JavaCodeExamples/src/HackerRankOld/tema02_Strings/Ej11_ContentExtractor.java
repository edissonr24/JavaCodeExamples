package tema02_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej11_ContentExtractor {
	
	public static void main(String[] args){
	      
	    Scanner in = new Scanner(System.in);
	    int testCases = Integer.parseInt(in.nextLine());
	    while (testCases > 0) {
	       String line = in.nextLine();
	       boolean matchFound = false;
	       Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
	       Matcher m = r.matcher(line);

	       while (m.find()) {
	           System.out.println(m.group(2));
	           matchFound = true;
	       }
	       if ( !matchFound) {
	           System.out.println("None");
	       }        
	         
	       testCases--;
	    }
    }
}

/*
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
*/