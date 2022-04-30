import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        try {        	
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            long n = (long) Math.pow((double)x, (double)y);
            
            System.out.println(x/y);
        } catch (InputMismatchException e) {
           System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
	}

}
