//package com.example.RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String computerChoice = "";
        String playerChoice = "";
        System.out.println("Rock, Paper or Scissors? Enter your choice!");
        Scanner s = new Scanner(System.in);
        playerChoice = s.nextLine();
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber) {
            case 1:
                computerChoice = "Rock";
                break;
            case 2:
                computerChoice = "paper";
                break;
            case 3:
                computerChoice = "Scissors";
                break;
        }
        System.out.println(computerChoice);
        String winner;
        if (playerChoice.equals(computerChoice)) {
            winner = "Tie";
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            winner = "player";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            winner = "player";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            winner = "player";
        } else {
            winner = "computer";
        }
        if (winner.equals("Tie")) {
            System.out.println("It's a tie");
        } else {
            System.out.println(winner + " Won!");
        }
        s.close(); 
    }
}
