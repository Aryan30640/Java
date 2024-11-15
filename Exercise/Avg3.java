import java.util.Scanner;

public class Avg3 {

    public static void main(String[] args) {
        System.out.println("Enter Three Numbers To Get Their Average.");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
                System.out.println("Next Number:");
            int b = sc.nextInt();
            System.out.println("Next Number:");
            int c = sc.nextInt();
            int sum = (a + b + c);
            int avg = (sum/3);
            System.out.println(avg);
        }

    }
}