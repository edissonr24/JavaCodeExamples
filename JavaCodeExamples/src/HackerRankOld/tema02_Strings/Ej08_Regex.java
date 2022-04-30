package tema02_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Ej08_Regex {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new Ej08_MyRegex().PATTERN));
        }
	}
}

/*
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
*/