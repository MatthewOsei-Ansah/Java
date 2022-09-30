import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int timestable;
        int upperbound;
        int ans;
        int count = 0;

        System.out.println("Welcome to the times table generator");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the times table you wish to see: ");
        timestable = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What would you like to go up to in the " + timestable + " times table?: ");
        upperbound = sc2.nextInt();
        do {
            ans = timestable * count;
            System.out.println(timestable + "x" + count + "= " + ans);
            count += 1;
        }
        while (count <= 15);
    }
}
