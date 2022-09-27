import java.util.Random;
import java.util.Scanner;


public class Main {

    static String RandWord(String[] array, int lenarray) {
        Random rnd = new Random();
        int randnum = rnd.nextInt(lenarray);
        String wordchoice = array[randnum];
        return wordchoice;
    }

    static char UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess > ");
        String firstguess = sc.nextLine();
        firstguess = firstguess.toLowerCase();
        char secondguess[] = firstguess.toCharArray();
        char guess = secondguess[0];
        return guess;
    }

    static Integer GetWordLength(String wordchoice) {
        int wordlength = wordchoice.length();
        return wordlength;
    }

    static StringBuilder GuessProcessor(char Guess, String array, StringBuilder right, StringBuilder wrong) {
        int count = 0;
        char chararray[] = array.toCharArray();

        for (char c : chararray) {
            if (c == Guess) {
                right.replace(count ,chararray.length , String.valueOf(c));
                count += 1;
            } else {
                wrong.append(c);
                count += 1;
            }
        }

        return right;

    }

    static boolean Checker(String ProcessedGuess) {
        int count = 0;
        boolean check = false;
        char array[] = ProcessedGuess.toCharArray();
        for (char c : array) {
            if (c == '_') {
                count += 1;

            } else {
                continue;
            }

            if (count > 0) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }

    static StringBuilder CreateCharArray(String Word, StringBuilder right){
        char[] chararray = Word.toCharArray();
        for(char c : chararray){
            right.append('_');
        }

        return right;
    }


    public static void main(String[] args) {
        boolean check = false;
        StringBuilder right = new StringBuilder();
        StringBuilder wrong = new StringBuilder();

        String wordarray[] = {"metal", "experiment"};

        int lenarray = wordarray.length;

        String wordchoice = RandWord(wordarray, lenarray);
        char guess = UserInput();
        int wordlength = GetWordLength(wordchoice);

        CreateCharArray(wordchoice, right);
        System.out.println(right);

        while (!check) {
            String processedguess = GuessProcessor(guess, wordchoice, right, wrong).toString();
            boolean Check = Checker(processedguess);
            System.out.println(processedguess);
            guess = UserInput();
        }
    }
}
