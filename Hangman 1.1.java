package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static ArrayList<Character> ListCreator(String word) {
        int count = 0;
        ArrayList<Character> wordlist = new ArrayList<>();
        char chararray[] = word.toCharArray();
        for (char c : chararray) {
            wordlist.add(chararray[count]);
            count += 1;
        }
        return wordlist;
    }

    static Integer GuessNumInput(){
        int UserInput;
        boolean Check;
        String test;

        Scanner scidk = new Scanner(System.in);
        System.out.println("How many chances would you like?");
        do {
            UserInput = scidk.nextInt();
            test = Integer.toString(UserInput);
            Check = Pattern.matches("[0-999]+", test);
        } while(!Check);

        return UserInput;
    }

    static String RandWord(String[] array, int lenarray) {
        Random rnd = new Random();
        int randnum = rnd.nextInt(lenarray);
        String wordchoice = array[randnum];
        return wordchoice;
    }

    static char UserInput() {
        boolean check;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess > ");
        String firstguess = sc.nextLine();
        firstguess = firstguess.toLowerCase();
        char secondguess[] = firstguess.toCharArray();
        char guess = secondguess[0];

        check = Pattern.matches("[a-z]+", firstguess);

        while (!check) {
            System.out.println("Please enter a valid letter in the alphabet > ");
            firstguess = sc.nextLine();
            firstguess = firstguess.toLowerCase();
            secondguess = firstguess.toCharArray();
            guess = secondguess[0];
            check = Pattern.matches("[a-z]+", firstguess);
        }
        return guess;
    }

    static Integer GetWordLength(String wordchoice) {
        int wordlength = wordchoice.length();
        return wordlength;
    }

    static ArrayList<Character> Constructor(int wordlength) {
        ArrayList<Character> gamearray = new ArrayList<>();
        for (int i = 0; i < wordlength; i += 1) {
            gamearray.add('_');
        }
        return gamearray;
    }

    static boolean Checker(ArrayList<Character> GameArray, int WordLength) {
        int count = 0;
        int empty = 0;
        boolean bool = false;
        while (count < WordLength) {
            if (GameArray.get(count) == '_') {
                empty += 1;
                count += 1;
            } else {
                count += 1;
            }
        }
        if (empty == 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    static ArrayList<Integer> FindAll(char guess, String WordChoice) {
        ArrayList<Integer> indexes = new ArrayList<>();
        char wordarray[] = WordChoice.toCharArray();
        int count = 0;

        for (char c : wordarray) {
            if (guess == c) {
                indexes.add(count);
            }
            count++;
        }
        return indexes;
    }

    static ArrayList<Character> Wrong(char guess, String WordChoice, ArrayList<Character> WrongArray) {
        char wordarray[] = WordChoice.toCharArray();
        int arraylength = wordarray.length;
        int count = 0;
        boolean contains = false;

        for (char c : wordarray) {
            if (guess != c) {
                count += 1;
            }
        }

        for(char d: WrongArray){
            if(d == guess && count == arraylength){
                contains = true;
            }
        }


        if (count == arraylength && !contains) {
            WrongArray.add(guess);
        }

        return WrongArray;
    }

    static ArrayList<Character> Replace(ArrayList<Integer> Indexes, ArrayList<Character> GameArray, Character Guess) {
        int count = 0;
        for (int i : Indexes) {
            GameArray.set(i, Guess);
        }
        return GameArray;
    }

    static boolean PlayAgain(){
        String playagain;
        boolean valid;
        char finalans;
        boolean again;
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Would you like to play play again? Y/N: ");
        playagain = sc5.nextLine();
        playagain = playagain.toUpperCase();
        valid = Pattern.matches("[YN]+", playagain);

        while(!valid) {
            System.out.println("Please enter Y or N");
            System.out.println("Would you like to play play again? Y/N: ");
            playagain = sc5.nextLine();
            playagain = playagain.toUpperCase();
            valid = Pattern.matches("[YN]+", playagain);
        }
        char[] playagainarray = playagain.toCharArray();
        finalans = playagainarray[0];

        if (finalans == 'Y')
            again = true;
        else
            again = false;

        return again;
    }

    public static void main(String[] args) {
        boolean again;
        do{
            String wordarray[] = {"metal", "experiment", "chemistry", "physics", "mathematics", "computer", "science", "waterman", "java",
                    "command", "error", "logic", "data", "class", "operator", "clock", "runtime", "character", "classroom", "epiphany", "vaseline",
                    "mechanics", "screen", "bit", "binary", "fission", "nucleus", "orbital", "compiler", "interpreter", "variable", "string", "file"
                    , "emphasise", "camera", "portrait", "refactor", "system", "constructor", "therapy", "ghost", "movies", "sutton", "grammar", "destiny"
                    , "index", "argument", "parameter", "parabola", "quadratic", "polynomial", "calculator", "anatomy", "justice", "syntax", "isotope",
                    "search", "heresy", "extraction", "lunch", "acceleration", "cartesian", "coordinate", "juice", "specimen", "esoteric", "exothermic",
                    "endothermic"};

            boolean check = false;
            int guesses = 0;
            int lengthofwrongarray = 0;


            int lenarray = wordarray.length;

            String wordchoice = RandWord(wordarray, lenarray);

            int wordlength = GetWordLength(wordchoice);

            ArrayList<Character> gamearray = Constructor(wordlength);
            ArrayList<Character> wrongarray = new ArrayList<>();

            while (!check) {
                System.out.println(gamearray);
                int numguesses = GuessNumInput();
                char guess = UserInput();
                ArrayList<Integer> indexes = FindAll(guess, wordchoice);
                Replace(indexes, gamearray, guess);
                ArrayList<Character> wrong = Wrong(guess, wordchoice, wrongarray);
                lengthofwrongarray = wrong.size();
                check = Checker(gamearray, wordlength);
                System.out.println("Incorrect Letters: " + wrong);
                guesses += 1;
                System.out.println("Guess: " + guesses);
                if (lengthofwrongarray == numguesses) {
                    System.out.println("You are out of guesses");
                    break;
                }
            }
            System.out.println(gamearray);
            System.out.println("Total guesses: " + guesses);
            again  = PlayAgain();
        } while(again);
    }
}
