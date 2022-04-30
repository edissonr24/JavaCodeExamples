package tema04_DataStructures;

import java.util.Comparator;

public class Ej11_Checker implements Comparator<Ej11_Player> {

	@Override
	public int compare(Ej11_Player p1, Ej11_Player p2) {
        if (p2.score == p1.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p1.score > p2.score ? -1 : 1;    
        }
    }
	
}
