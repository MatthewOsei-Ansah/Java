import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println("This is a leap year");

        else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0)
            System.out.println("This is not a leap year");
        else if (year % 4 != 0)
            System.out.println("This is not a leap year");

        else if (year % 100 != 0 && year % 400 != 0) {
            System.out.println("This is a leap year");
        }
    }
}
