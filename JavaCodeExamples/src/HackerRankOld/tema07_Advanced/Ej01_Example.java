package tema07_Advanced;

public class Ej01_Example {

	static int[] num={4,7,8,2};
	static int cuatro=4;
	static int dos=2;
	
	//Y los métodos también. Nótese la diferencia entre ambos.
	static int suma_a (int... numero){
	    int resultado = 0;
	    for(int i = 0; i < numero.length; i++){
	        resultado += numero[i];
	    }return resultado;
	}
	static int suma_b (int[] numero){
	    int resultado = 0;
	    for(int i = 0; i < numero.length; i++){
	        resultado += numero[i];
	    }return resultado;
	}
	
	public static void main(String[] args) {
		//Primero lo primero, declaramos las variables que se usarán en el ejemplo.
		
		//Llamadas válidas:
		System.out.println(suma_a(num));
		System.out.println(suma_a(num[0],num[1],num[2]));
		System.out.println(suma_a(cuatro,7,8,dos,5));

		System.out.println(suma_b(num));
		//Llamadas NO válidas:
//		System.out.println(suma_b(num[0],num[1],num[2],num[3]));
//		System.out.println(suma_b(cuatro,7,8,dos));
	}
	
}
