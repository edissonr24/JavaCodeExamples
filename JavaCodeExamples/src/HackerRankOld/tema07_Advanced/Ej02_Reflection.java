package tema07_Advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Ej02_Reflection {

	public static void main(String[] args){
        Class student = Ej02_Students.class;
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        
        /* Sort and print names */
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
