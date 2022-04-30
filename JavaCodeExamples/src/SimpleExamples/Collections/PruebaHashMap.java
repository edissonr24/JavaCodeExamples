import java.util.HashMap;
import java.util.Map;


public class PruebaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<Integer,String> mapa = new HashMap<Integer,String>();
//		
//		mapa.put(1, "Victor");
//		mapa.put(2,  "Nacho");
//		mapa.put(3, "Julio");
//		mapa.put(4, "David");
//		mapa.put(1, "Pepe");
//		
//		String[] nombres = mapa.values().toArray(new String[0]);
//		
//		for (String nombre: nombres)
//			  System.out.println(nombre);
//		
//		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
//		 
//		for (Integer clave: claves)
//		  System.out.println(clave);
//		
		
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		
		mapa.put(1, "Victor");
		mapa.put(2,  "Nacho");
		mapa.put(3, "Julio");
		mapa.put(4, "David");
		mapa.put(1, "Pepe");
		
		String[] nombres = mapa.values().toArray(new String[0]);
		
		for (String nombre: nombres)
			  System.out.println(nombre);
		
		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
		 
		for (Integer clave: claves)
		  System.out.println(clave);
	}

}
