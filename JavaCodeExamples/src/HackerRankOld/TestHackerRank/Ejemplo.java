package TestHackerRank;

public class Ejemplo {

/*	int[]scores = {3,5,7};
	int [][] scores2 = {5,4,5},{3,4,2};
	
	float[] f = new float(3);
	float f2[] = new float[];
	float[] f1 =  new float[3];
	float f3[] = new float[6];
	float f5[] = {1.0f, 2.4f, 5.4f};
*/
	

/* Ejemplo 1	
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		} catch (RuntimeException ex) {
			System.out.println("B");
		} catch (Exception ex1) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
		
	}
	
	
	public static void badMethod() {
		throw new RuntimeException();
	}	
*/
	
/* Ejemplo 2	
	public static void aMethod() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("finally ");
		}
	}
	
	public static void main(String[] args) {
		try {
			aMethod();
		} catch (Exception e) {
			System.out.println("Exception ");
		}
		System.out.println("finished");
	}
*/
	
/* Ejemplo 3	*/
	public static void main(String[] args) {
		
		try {
			return;
		} finally {
			System.out.println("Imprime finally");
		}
	}
	
}
