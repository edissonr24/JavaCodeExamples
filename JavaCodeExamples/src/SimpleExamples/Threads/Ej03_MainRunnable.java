package T10_Hilos;

public class Ej03_MainRunnable implements Runnable {

	private Ej01_Cliente cliente;
	private Ej01_Cajera cajera;
	private long initialTime;
	
	public Ej03_MainRunnable (Ej01_Cliente cliente, Ej01_Cajera cajera, long initialTime){
		this.cajera = cajera;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Ej01_Cliente cliente1 = new Ej01_Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Ej01_Cliente cliente2 = new Ej01_Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		
		Ej01_Cajera cajera1 = new Ej01_Cajera("Cajera 1");
		Ej01_Cajera cajera2 = new Ej01_Cajera("Cajera 2");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new Ej03_MainRunnable(cliente1, cajera1, initialTime);
		Runnable proceso2 = new Ej03_MainRunnable(cliente2, cajera2, initialTime);
		
		new Thread(proceso1).start();
		new Thread(proceso2).start();

	}

	@Override
	public void run() {
		this.cajera.procesarCompra(this.cliente, this.initialTime);
	}
	
	
}
