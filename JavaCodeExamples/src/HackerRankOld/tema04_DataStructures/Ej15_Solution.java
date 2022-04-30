package tema04_DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej15_Solution {

	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Ej15_Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Ej15_Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

/*
12
ENTER John 3,75 50
ENTER Mark 3,8 24
ENTER Shafaet 3,7 35
SERVED
SERVED
ENTER Samiha 3,85 36
SERVED
ENTER Ashley 3,9 42
ENTER Maria 3,6 46
ENTER Anik 3,95 49
ENTER Dan 3,95 50
SERVED
*/