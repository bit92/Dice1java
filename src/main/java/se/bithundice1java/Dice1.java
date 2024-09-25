package se.bithundice1java;
import java.util.Scanner;
import java.util.Random;

public class Dice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r  = new Random();
        // Get player names
        System.out.print("Enter name for Player 1: ");
        Player player1 = new Player(sc.nextLine());

        System.out.print("Enter name for Player 2: ");
        Player player2 = new Player(sc.nextLine());

        // Roll dice for Player 1
        System.out.println(player1.getName() + "'s turn to roll the dice.");

        player1.setScore(r.nextInt(1,6)+r.nextInt(1,6));
        System.out.println(player1.getName() + "'s total score: " + player1.getScore());

        // Roll dice for Player 2
        System.out.println(player2.getName() + "'s turn to roll the dice.");
        player2.setScore(r.nextInt(1,6)+r.nextInt(1,6));
        System.out.println(player2.getName() + "'s total score: " + player2.getScore());

        // Determine the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

    }

}

