import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        String choice = sc.nextLine().toUpperCase();
        String compchoice[] = {"ROCK", "PAPER", "SCISSORS"};
        Random rnd = new Random();
        int upperbound = 3;
        int randchoice = rnd.nextInt(upperbound);
        System.out.println(randchoice);
        String computerchoice = compchoice[randchoice];
        System.out.println(computerchoice);
        if(choice.equals(computerchoice))
            System.out.println("DRAW");
        else if (choice.equals("ROCK") && computerchoice.equals("SCISSORS"))
            System.out.println("WINNER!");
        else if(choice.equals("ROCK") && computerchoice.equals("PAPER"))
            System.out.println("LOSER!");
        else if(choice.equals("PAPER") && computerchoice.equals("ROCK"))
            System.out.println("WINNER!");
        else if (choice.equals("PAPER") && computerchoice.equals("SCISSORS"))
            System.out.println("LOSER!");
        else if (choice.equals("SCISSORS") && computerchoice.equals("PAPER"))
            System.out.println("WINNER");
        else if (choice.equals("SCISSORS") && computerchoice.equals("ROCK"))
            System.out.println("LOSER!");

        }

    }
