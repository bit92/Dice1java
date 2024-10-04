package se.bithundice1java;  // It a package  where we keep all the related classes

public class Player {
    private String name;
    private int score;

    public Player(String name) {  //its a constructor to take the name of the player as input
        this.name = name;
    }
    public String getName() {// take the value of name and print it in another class or function
        return name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }

}