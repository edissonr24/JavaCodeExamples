package tema01_Introduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ej09_EndOfFile {

	public static void main(String []argh) throws IOException{
        
//		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
//        int c = 0;			
//		for (String line = buffer.readLine(); line != null; line = buffer.readLine()) {
//	       System.out.println(++c + " " + line);
//	    }
//		buffer.close();
		
		
		Scanner scan = new Scanner(System.in);
		for(int i = 1; scan.hasNext(); i++) {
			System.out.println(i + " " + scan.nextLine());
		}
	}
}

/*
Hello world
I am a file
Read me until end-of-file.
*/
