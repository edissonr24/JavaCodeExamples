package T10_Hilos;

public class Ej01_Main {

	public static void main(String[] args) {

		Ej01_Cliente cliente1 = new Ej01_Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Ej01_Cliente cliente2 = new Ej01_Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		Ej01_Cajera cajera1 = new Ej01_Cajera("Cajera 1");
		Ej01_Cajera cajera2 = new Ej01_Cajera("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}
}
