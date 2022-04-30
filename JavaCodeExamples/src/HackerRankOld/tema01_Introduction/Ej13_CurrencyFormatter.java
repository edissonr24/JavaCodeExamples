package tema01_Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ej13_CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String us = currencyFormatter.format(payment);

		locale = new Locale("en", "IN");
		currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String india = currencyFormatter.format(payment);

		locale = new Locale("zh", "CN");
		currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String china = currencyFormatter.format(payment);

		locale = new Locale("fr", "FR");
		currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String france = currencyFormatter.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

}

/* -Duser.language=en -Duser.country=US -Duser.variant=EN
 * https://stackoverflow.com/questions/4947484/how-to-set-eclipse-console-locale-language
 
12324.134
 */