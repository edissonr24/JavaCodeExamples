package tema01_Introduction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ej12_DateAndTime {

	public static String getDay(String day, String month, String year) {
		 
		Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yy").parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String diaSemana = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date).toUpperCase();
        return diaSemana;
    }	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
	}
}

/*
07 20 1986
*/
