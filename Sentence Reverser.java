import java.util.Scanner;

public class Main {
    static String Splitter(String Sentance){
        String[] SentenceArray = Sentance.split(" ");
        int count = SentenceArray.length;
        count -= 1;
        StringBuilder sb = new StringBuilder();

        while (count >= 0){
            sb.append(SentenceArray[count]);
            sb.append(" ");
            count -= 1;
        }

        String output = sb.toString();
        return output;
