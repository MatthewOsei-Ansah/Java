import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int current = 1;
        int previous = 0;
        int answer;
        int count = 0;
        int outputs;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of the sequence would you like to output? >>> ");
        outputs = sc.nextInt();
        outputs -= 3;
        System.out.println("0");
        System.out.println("1");

        while(count <= outputs){
            answer = current + previous;
            previous = current;
            current = answer;
            System.out.println(answer);
            count += 1;
        }
        }
}
