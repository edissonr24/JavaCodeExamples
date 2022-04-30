package tema05_OOP;

public class Ej04_MyCalculator implements Ej04_AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		
		int c = 0;
		for(int i = 1; i <= n; i++){
			if (n % i == 0){
				c+=i;
			}
		}
		return c;
	}

}
