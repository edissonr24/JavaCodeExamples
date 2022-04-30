
public class PruebaStringBuffer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer holamundoBuffer = new StringBuffer();
		holamundoBuffer.append("Hola, ");
		holamundoBuffer.append("mundo");

		String holamundo = holamundoBuffer.toString();
		System.out.println("Salida " + holamundo);
		
		

		String prueba = "34234577898";
		String resultado = "";
//		System.out.println(prueba.substring(0, prueba.length()-4));
		
//		System.out.println(prueba.replaceAll(prueba.substring(0, prueba.length()-4), "****"));
		
		for (int i = 0; i < prueba.length()-4; i++) {
//			prueba = prueba.replace(prueba.charAt(i), '*');
			resultado += "*";
		}
		resultado += prueba.substring(prueba.length()-4, prueba.length());
		
		System.out.println("Resultado: " + resultado);
		System.out.println("Resultado: " + enmascararNumCuenta("701147852"));

	}
	
	public static String enmascararNumCuenta(String numCuenta) {
		String resultado = "";
		for (int i = 0; i < numCuenta.length()-4; i++) {
			resultado += "*";
		}
		resultado += numCuenta.substring(numCuenta.length()-4, numCuenta.length());
		return resultado;
	}

}
