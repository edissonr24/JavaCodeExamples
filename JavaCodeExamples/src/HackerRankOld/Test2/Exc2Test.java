package Test2;

public class Exc2Test {

	public static void main(String[] args) {
		try {
			throw new Exc1();
		} catch (Exc0 e0) {
			System.out.println("Exc0 caught ");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}
