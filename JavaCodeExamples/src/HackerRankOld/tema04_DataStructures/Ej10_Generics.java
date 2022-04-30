package tema04_DataStructures;

import java.lang.reflect.Method;

public class Ej10_Generics {

    public static void main( String args[] ) {
    	Ej10_Printer myPrinter = new Ej10_Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Ej10_Generics.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}