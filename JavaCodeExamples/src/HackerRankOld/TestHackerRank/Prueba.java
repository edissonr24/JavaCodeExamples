package TestHackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Prueba {
	
	
	static int[] printPrimeFibonacciNumbers(int n) {
        //To generate the next Prime int number, call the existing method: PrimeGenerator.getNext();
		int fib = 2;
		int primo = 0;
		int c = 0;
		int[] v = new int[n];
		
		// Se inicializa el array en cero
		for(int i = 0; i < v.length; i++) {
			v[i] = 0;
		}
		
		while (fib <= n) {			
			if (fib >= primo) {				
				while(primo < fib){
					primo = PrimeGenerator.getNext();
					System.out.println("Primo: " + primo);
					if (fib == primo) {
						 v[c] = fib;
						 c++;
					}
				}				
			}
			fib = FibonacciGenerator.getNext();
			System.out.println("Fibonaci: " + fib);
		}
		
		int tamanio = getSizeArray(v);
		int[] vFinal = new int[tamanio];
		int cont = 0;
		// Se organiza el vector
		for (int j = 0; j < v.length; j++){
			if (v[j] > 0) {
				vFinal[cont] = v[j];
				cont++;
			}
		}
		
        return vFinal;

    }
	
	static int getSizeArray(int[] a) {
		int size = 0;
		for (int i = 0; i < a.length; i++){
			if(a[i] > 0)
				size++;
		}
		return size;
			
	}
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _n;
        _n = Integer.parseInt(in.nextLine());
        
        res = printPrimeFibonacciNumbers(_n);
        for(int res_i=0; res_i < res.length; res_i++) {
        	System.out.println("Res:" + res[res_i]);
      }
//        res = printPrimeFibonacciNumbers(_n);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
//        }
//        
//        bw.close();
    }
}
final class FibonacciGenerator {
    
    private static int currentStep = 0; 

	private FibonacciGenerator() {
	}
	
	private static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

    /**
     * Resets the Fibonacci series.
     */
	public static void resetSeries() {
		currentStep = 0;
	}
	
    /**
     * Returns the last number in the current Fibonacci series.
     */
	public static int getNext() {
		return fib(++currentStep);
	}
}

final class PrimeGenerator {

	private static List<Integer> currentPrimes = new LinkedList<Integer>();

	private PrimeGenerator() {
	}

	/**
     * Returns the next prime number.
     */
	public static int getNext() {
		if (currentPrimes.size() == 0) {
			currentPrimes.add(2);
			return 2;
		}
		int candidate = currentPrimes.get(currentPrimes.size() - 1);

		while (true) {
			if(isPrime(++candidate)) {
                currentPrimes.add(candidate);
                return candidate;
            } 
		}
	}
    private static boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i < num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

}

// Fibonaci: 90
// 0 1 1 2 3 5 8 13 21 34 55 89
