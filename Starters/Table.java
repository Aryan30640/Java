import java.util.*;

public class Table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to print it's Table:");
        int n = sc.nextInt();

        for(int i = 0; i < 11; i = i + 1) {
            System.out.println(n * i);
        }
        }
    }
}
