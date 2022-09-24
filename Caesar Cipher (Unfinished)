import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Initialisation of variables
        int shift;
        String input;
        char character = 0;
        int originalposition;
        int newposition;

        // Receive word input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word > ");
        input = sc.nextLine().toLowerCase();
        char[] charArray = input.toCharArray();

        // Receive shift input and makes sure shift is not negative
        do
        {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the shift > ");
            shift = sc2.nextInt();
        }
        while (shift < 0);

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Loop through each character of the array
        for (char c : charArray)
        {
            if (c != ' ')
            {
                character = c;
                originalposition = character - 'a';
                // 'z' will work as z - a = 25 in ascii then any shift + 25 % 26 will wrap around
                newposition = (originalposition + shift) % 26;
                char newcharacter = (char) ('a' + newposition);
                // Keeps adding each character to our new String
                sb.append(newcharacter);
            }
            else
            {
                // Appends any spaces
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }
}
