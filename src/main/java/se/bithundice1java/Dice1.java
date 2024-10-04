package se.bithundice1java;

import java.util.Scanner; //its a class saved in Java library and we imported it here to take user input in our program
import java.util.Random;//its a class saved in Java library and we imported it here to generate random number in our program

public class Dice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //It takes input while running the program from user
        Random r = new Random();
        String name;// Variable to save the name we took as input
        int roll1, roll2;// to save the randomly generated number
        // Set player names
        System.out.print("Enter name for Player 1: ");
        name = sc.nextLine();// takes name as input.
        Player player1 = new Player(name);

        System.out.print("Enter name for Player 2: ");
        name = sc.nextLine();
        Player player2 = new Player(name);

        // Roll dice twice for Player 1
        System.out.println(player1.getName() + "'s turn to roll the dice.");
        roll1 = r.nextInt(6) + 1;
        roll2 = r.nextInt(6) + 1;
        player1.setScore(roll1 + roll2); // sum both rolls
        System.out.println(player1.getName() + "'s roll 1: " + roll1);
        System.out.println(player1.getName() + "'s roll 2: " + roll2);
        System.out.println(player1.getName() + "'s total score: " + player1.getScore());

        // Roll dice twice for Player 2
        System.out.println(player2.getName() + "'s turn to roll the dice.");
        roll1 = r.nextInt(6) + 1;
        roll2 = r.nextInt(6) + 1;
        player2.setScore(roll1 + roll2); // sum both rolls
        System.out.println(player2.getName() + "'s roll 1: " + roll1);
        System.out.println(player2.getName() + "'s roll 2: " + roll2);
        System.out.println(player2.getName() + "'s total score: " + player2.getScore());
        // Determine the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        sc.close();
    }

}
