package T10_Hilos;

public class Ej02_MainThread {
	
	public static void main(String[] args) {

		Ej01_Cliente cliente1 = new Ej01_Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Ej01_Cliente cliente2 = new Ej01_Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		Ej02_CajeraThread cajera1 = new Ej02_CajeraThread("Cajera 1", cliente1, initialTime);
		Ej02_CajeraThread cajera2 = new Ej02_CajeraThread("Cajera 2", cliente2, initialTime);

		cajera1.start();
		cajera2.start();
	}
}
