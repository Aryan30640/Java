import java.util.*;

public class NumComp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two numbers to compare them.");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a == b) {
                System.out.println("Equal");
                }
            else if(a > b) {
                    System.out.println(a + " is greater than " + b);
                }
            else {
                    System.out.println(b + " is greater than " + a);
                }
        }
    }
}