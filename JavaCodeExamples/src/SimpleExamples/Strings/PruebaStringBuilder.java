
public class PruebaStringBuilder {

	public static StringBuilder stbSeguimiento = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder holamundoBuilder = new StringBuilder();
//		holamundoBuilder.append("Hola, ");
//		holamundoBuilder.append("mundo");
//
//		String holamundo = holamundoBuilder.toString();
//		System.out.println("Salida " + holamundo);

		
//		StringBuffer sbuffer = new StringBuffer();
//		Long inicio = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			sbuffer.append("zim");
//		}
//		Long fin = System.currentTimeMillis();
//		System.out.println("Tiempo del StringBuffer: " + (fin - inicio));
//
//		StringBuilder sbuilder = new StringBuilder();
//		inicio = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			sbuilder.append("zim");
//		}
//		fin = System.currentTimeMillis();
//		System.out.println("Tiempo del StringBuilder: " + (fin - inicio));
		
		 String strinstSql = " SELECT * "+
				  " FROM "+
				  " WHERE ROWNUM <= 0 AND "+
 				  " 1=1 ";
		
		stbSeguimiento.append("recursoTabla() \n"+strinstSql);
//		 stbSeguimiento.append("recursoTabla() \n");
//		 stbSeguimiento.append(strinstSql);
		 
		System.out.println("Seguimiento " + stbSeguimiento);
		
	}

}
