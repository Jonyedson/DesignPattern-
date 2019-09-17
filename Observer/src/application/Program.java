package application;

import entities.Boss;
import entities.Player;

public class Program {

    public static void main(String[] args) {

        Boss boss = Boss.getInstance();
        Boss boss2 = Boss.getInstance();

        Player player1 = new Player("João");
        Player player2 = new Player("Pedro");
        boss.addObserver(player2);
        boss.addObserver(player1);
        boss.setState(false);
        boss.notifyObserver();

        player1.verificationLife();
        player2.verificationLife();
        player2.verificationLife();
        player2.verificationLife();
        player2.verificationLife();
        boss2.setState(true);
        boss.notifyObserver();
        player2.verificationLife();
       
        

    }

}
