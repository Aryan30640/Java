import java.util.*;

public class greater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number to compare: ");
            int a = sc.nextInt();
            System.out.print("Enter second number to compare: ");
            int b = sc.nextInt();
            //--
            if(a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(b + " is greater than " + a);
            }
        }
    }
}
