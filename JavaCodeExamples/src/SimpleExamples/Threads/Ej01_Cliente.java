package T10_Hilos;

public class Ej01_Cliente {

	private String nombre;
	private int[] carroCompra;
	

	// Constructor, getter y setter
	public Ej01_Cliente(String nombre, int[] carroCompra) {
//		super();
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int[] getCarroCompra() {
		return carroCompra;
	}
	
	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}

}
