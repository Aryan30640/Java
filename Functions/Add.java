import java.util.Scanner;

public class Add {
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            int sum = calculateSum(a, b);
            System.out.println(sum);
        }
    }
}