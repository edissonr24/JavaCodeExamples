package tema05_OOP;

public class Ej05_Soccer extends Ej05_Sports {

    @Override
    String getName(){
        return "Soccer Class";
    }
    
    @Override    
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
	
}
