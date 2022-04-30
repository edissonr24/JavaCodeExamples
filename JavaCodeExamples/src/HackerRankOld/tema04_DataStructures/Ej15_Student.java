package tema04_DataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ej15_Student {

	private int token;
	private String fname;
	private double cgpa;

	public Ej15_Student(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getName() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class Priorities {
	public List < Ej15_Student > getStudents(List < String > events) {
		PriorityQueue < Ej15_Student > student_queue = new PriorityQueue(Comparator.comparing(Ej15_Student::getCgpa).reversed().thenComparing(Ej15_Student::getName).thenComparing(Ej15_Student::getToken));
		List < Ej15_Student > students = new ArrayList < Ej15_Student > ();
		for (String e: events) {
			Scanner in =new Scanner(e);
			String event = in.next();
			if (event.equals("ENTER")) {
				String name = in.next();
				float cgpa = in.nextFloat();
				int token = in.nextInt();

				Ej15_Student student = new Ej15_Student(token, name, cgpa);
				student_queue.add(student);
			} else if (event.equals("SERVED")) {
				Ej15_Student first = student_queue.poll();
			} in .close();
		}
		Ej15_Student first = student_queue.poll();
		if (first == null) {
			return students;
		} else {
			while (first != null) {

				students.add(first);
				first = student_queue.poll();

			}
			return students;
		}

	}
}