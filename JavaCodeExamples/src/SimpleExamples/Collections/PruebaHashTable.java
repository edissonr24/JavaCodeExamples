import java.util.Enumeration;
import java.util.Hashtable;

public class PruebaHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Soy una gueva");

		Hashtable<String, String> contenedor = new Hashtable<String, String>();
		
		contenedor.put("101", "Harry");
		contenedor.put("102", "Potter");
		contenedor.put("103", "IRONMAN");
		contenedor.put("104", "IRONMAN");
		contenedor.put("105", "HALLO");
		
		System.out.println(contenedor.get("105"));
		System.out.println(contenedor.get("101"));
		
		Enumeration<String> enumeration = contenedor.elements();
		while (enumeration.hasMoreElements()) {
		  System.out.println(""+"hashtable valores: " + enumeration.nextElement());
		}
		
		Enumeration<String> llaves = contenedor.keys();
		while (llaves.hasMoreElements()) {
		  System.out.println(""+"hashtable llaves: " + llaves.nextElement());
		}

		System.out.println("Claves: " +contenedor.keys());
		
	}

}
