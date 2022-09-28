package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main
{
    static ArrayList<Character> ListCreator(String word)
    {
        int count = 0;
        ArrayList<Character> wordlist = new ArrayList<Character>();
        char chararray[] = word.toCharArray();
        for (char c : chararray)
        {
            wordlist.add(chararray[count]);
            count += 1;
        }
        return wordlist;
    }

    static String RandWord(String[] array, int lenarray) {
        Random rnd = new Random();
        int randnum = rnd.nextInt(lenarray);
        String wordchoice = array[randnum];
        return wordchoice;
    }
    static char UserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess > ");
        String firstguess = sc.nextLine();
        firstguess = firstguess.toLowerCase();
        char secondguess [] = firstguess.toCharArray();
        char guess = secondguess[0];
        return guess;
    }

    static Integer GetWordLength(String wordchoice){
        int wordlength = wordchoice.length();
        return wordlength;
    }

    static ArrayList<Character> Constructor(int wordlength){
        ArrayList <Character> gamearray = new ArrayList<>();
        for(int i = 0; i < wordlength; i += 1){
            gamearray.add('_');
        }
        // String output = gamearray.toString();
        return gamearray;
    }

    static ArrayList<Character> GameProcessor(ArrayList<Character> GameArray, Character Guess, Integer WordLength, String GameWord, ArrayList<Integer> AllInstances){
        int count  = 0;

        char [] HangWordCharArray = GameWord.toCharArray();

        for(char c : HangWordCharArray){
            if (HangWordCharArray[count] == Guess) {
                GameArray.set(count, Guess);
                count += 1;
            } else{
                count += 1;
                continue;
            }
            return GameArray;
        }
        return GameArray;
    }
    static boolean Checker(ArrayList<Character> GameArray, int WordLength){
        int count = 0;
        int empty = 0;
        boolean bool = false;
        while(count < WordLength)
        {
            if(GameArray.get(count) == '_')
            {
                empty += 1;
                count += 1;
            }
            else
            {
                count += 1;
            }
        }
        if(empty == 0){
            bool = true;
        }
        else{
            bool = false;
        }
        return bool;
    }
    static  ArrayList<Integer> FindAll(char guess, String WordChoice){
        ArrayList<Integer> indexes = new ArrayList<>(); 
        char wordarray[] = WordChoice.toCharArray();
        int count = 0;
       
        for (char c : wordarray){
            if(guess == c){
                indexes.add(count);
            }
            count++;
        }
        return indexes;
    }

    public static void main(String[] args)
    {
        String wordarray[] = {"metal", "experiment"};
        boolean check = false;

        int lenarray = wordarray.length;

        String wordchoice = RandWord(wordarray, lenarray);

        int wordlength = GetWordLength(wordchoice);
        ArrayList<Character> gamearray = Constructor(wordlength);

        while(!check){
            System.out.println(gamearray);
            char guess = UserInput();
            ArrayList<Integer> indexes = FindAll(guess, wordchoice);
            GameProcessor(gamearray, guess, wordlength, wordchoice, indexes);
            check = Checker(gamearray, wordlength);
        }
        System.out.println(gamearray);
    }
}