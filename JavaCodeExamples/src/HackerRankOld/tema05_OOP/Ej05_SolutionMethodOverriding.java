package tema05_OOP;

public class Ej05_SolutionMethodOverriding {

	public static void main(String []args){
        Ej05_Sports c1 = new Ej05_Sports();
        Ej05_Soccer c2 = new Ej05_Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}
