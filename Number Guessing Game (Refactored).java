import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        int upperbound;
        int randint;
        int computerchoice;
        String again;
        int numtries = 0;
        int overalltries = 0;
        int userchoice;
        int correct = 0;
        double chance;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("Rules are simple try and enter the same number the computer outputs");
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter the highest number you would like the computer to generate: ");
        upperbound = sc5.nextInt();
        chance = (1 / (double) upperbound) * 100;
        upperbound += 1;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("How many guesses would you like?: ");
        int numguesses = sc3.nextInt();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Guess: ");
            userchoice = sc.nextInt();
            Random rnd = new Random();

            randint = rnd.nextInt(upperbound);
            computerchoice = randint;
            System.out.println("Computer Generated Number: " + computerchoice);
            if (userchoice == computerchoice && numtries == 0) {
                System.out.println("Correct! First Try!");
                correct += 1;
            } else if (userchoice == computerchoice) {
                System.out.println("Correct!");
                correct += 1;
            } else if (userchoice < computerchoice)
                System.out.println("Too low!");
            else
                System.out.println("Too high!");

            numtries += 1;
            numguesses -= 1;
            overalltries += 1;
            System.out.println("You have " + numguesses + " guesses left left");
            if (numguesses == 0) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Looks like you are out of guesses! Would you like to play again? Y/N : ");
                again = sc2.nextLine().toUpperCase();
                if (again.equals("N")) {
                    System.out.println("Results:");
                    break;
                } else if (again.equals("Y")) {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("How many guesses would you like? ");
                    numguesses = sc4.nextInt();
                    System.out.println("Restarting...");
                    numtries = 0;
                }

            }
        }
        while (computerchoice != userchoice);
        System.out.println("Total Attempts: " + overalltries);
        System.out.println("Round Attempts: " + numtries);
        System.out.println("Guesses Remaining: " + numguesses);
        System.out.println("Chance Of Correct Answer Per Guess: " + chance + "%");
        System.out.println("Correct Guesses: " + correct);
        System.out.println("Thank you for playing!");


    }
}
