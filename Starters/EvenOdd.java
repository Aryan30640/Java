import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {
            //--
        try (Scanner sc = new Scanner(System.in)) {
            //Checking a number if it's Even or Odd
                System.out.println("Please put a number to check if it is Even or Odd.");
        int x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.println("This is an Even number.");
        }
        else {
            System.out.println("This is an Odd number.");
        }
        }
    }
}