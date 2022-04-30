package tema04_DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11_Comparator {

	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Ej11_Player[] player = new Ej11_Player[n];
        Ej11_Checker checker = new Ej11_Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Ej11_Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/*
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
*/