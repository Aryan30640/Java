import java.util.*;

public class LoopAdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("To add first n natural numbers, enter value of n:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i = i + 1 ) {
            sum = sum + i;
        }
        System.out.println(sum);
        }
    }
    
}