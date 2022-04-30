package tema03_BigDecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class Ej03_BigInteger {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}

/*
1234
20
*/