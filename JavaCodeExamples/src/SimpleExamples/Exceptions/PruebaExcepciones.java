package SimpleExamples.Exceptions;


public class PruebaExcepciones {

	static int slice0[] = { 0,1,2,3,4 };

	public static void main(String a[]) {
		try {
			uno();
		} catch (Exception e) {
			System.out.println("Captura de la excepcion en main()");
			e.printStackTrace();
		}
	}

	static void uno() {
		try {
			int x = 6/0;
//			slice0[-1] = 4;
		} catch (NullPointerException e) {
			System.out.println("Captura una excepcion diferente");
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Mula");
		}
	}
}


