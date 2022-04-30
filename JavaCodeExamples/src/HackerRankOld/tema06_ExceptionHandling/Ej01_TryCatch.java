package tema06_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01_TryCatch {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
           System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

/*
10
3

10
Hello

10
0

23.323
0
*/