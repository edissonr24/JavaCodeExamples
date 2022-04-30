package tema05_OOP;

public class Ej06_MotorCycle extends Ej06_BiCycle {
	
	String define_me(){
		return "a cycle with an engine.";
	}
	
	Ej06_MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp=super.define_me(); //Fix this line
		System.out.println("My ancestor is a cycle who is "+ temp );
	}

}
