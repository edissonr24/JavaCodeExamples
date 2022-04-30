package TestHackerRank;

public class Test {

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++){
			System.out.println(i + " - " + isPrime(i));
		}
	}
	
	 private static boolean isPrime(int num) {
	        if (num % 2 == 0) return false;
	        for (int i = 3; i * i < num; i += 2)
	            if (num % i == 0) return false;
	        return true;
	    }
	
}
