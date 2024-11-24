import java.util.*;

public class odd {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your number(n) to add all odd numbers from 1 to n:");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1; i <= n; i++) {
                if(i%2==1) {
                    sum = sum + i;
                }
        }
            System.out.println("the sum of odd numbers that comes in between 1 to " + n + " is " + sum);
    }
}
}