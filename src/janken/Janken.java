package janken;

import java.util.Random;
import java.util.Scanner;

public class Janken {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int cpuNum = random.nextInt((3 - 1) + 1) + 1;
        String cpuChoice = null;
        int PlayerScore = 0;
        int cpuScore = 0;
        boolean Replay = true;
        boolean checker = false;
        boolean DrawCheck = false;
        while (Replay == true) {
            checker = false;
            DrawCheck = false;
            cpuNum = random.nextInt((3 - 1) + 1) + 1;
            System.out.println("Please enter either rock, paper or scissors.");
            String PlayerChoice = input.next();
            if (cpuNum == 1) {
                cpuChoice = "rock";
            }
            if (cpuNum == 2) {
                cpuChoice = "paper";
            }
            if (cpuNum == 3) {
                cpuChoice = "scissors";
            }
            while (checker == false) {
                if (PlayerChoice.equalsIgnoreCase("rock") || PlayerChoice.equalsIgnoreCase("paper") || PlayerChoice.equalsIgnoreCase("scissors")) {
                    checker = true;
                } else {
                    System.out.println("Please enter a valid choice. Rock, Paper or Scissors.");
                    PlayerChoice = input.next();
                }
            }
            if (PlayerChoice.equalsIgnoreCase(cpuChoice)) {
                System.out.println("The CPU chose " + cpuChoice + ".\nIt was a draw!");
                DrawCheck = true;

            }
            if (DrawCheck == false) {
                if ("rock".equalsIgnoreCase(PlayerChoice) && (cpuChoice.equals("scissors")) || ("paper".equalsIgnoreCase(PlayerChoice) && (cpuChoice.equals("rock"))) || ("Scissors".equalsIgnoreCase(PlayerChoice) && (cpuChoice.equals("paper")))) {
                    System.out.println("The CPU chose " + cpuChoice + ".");
                    System.out.println("You have beaten the CPU! You gain a point.");
                    PlayerScore = PlayerScore + 1;
                } else {
                    System.out.println("The CPU chose " + cpuChoice + ".");
                    System.out.println("You have lost to the CPU. The CPU gains a point.");
                    cpuScore = cpuScore + 1;
                }
            }
            System.out.println("The score is " + PlayerScore + " to you, and " + cpuScore + " to the CPU.");
            System.out.println("Type \"CONTINUE\" if you want to play again");
            if ("CONTINUE".equalsIgnoreCase(input.next())) {

            } else {
                Replay = false;
            }

        }

    }

}
