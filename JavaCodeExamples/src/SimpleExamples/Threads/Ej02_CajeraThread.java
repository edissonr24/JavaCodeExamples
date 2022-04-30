package T10_Hilos;

public class Ej02_CajeraThread extends Thread {

	private String nombre;

	private Ej01_Cliente cliente;

	private long initialTime;

	public Ej02_CajeraThread(String nombre, Ej01_Cliente cliente, long initialTime) {
		super();
		this.nombre = nombre;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	// Constructor, getter & setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ej01_Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Ej01_Cliente cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	@Override
	public void run() {

		System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " 
					+ this.cliente.getNombre() + " EN EL TIEMPO: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");

		for (int i = 0; i < this.cliente.getCarroCompra().length; i++) { 
			this.esperarXsegundos(cliente.getCarroCompra()[i]); 
			System.out.println("Procesado el producto " + (i + 1) 
			+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
			+ (System.currentTimeMillis() - this.initialTime) / 1000 
			+ "seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " 
						+ this.cliente.getNombre() + " EN EL TIEMPO: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
}
