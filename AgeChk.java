import java.util.*;

public class AgeChk {

    public static void main(String[] args) {
            //--
        try (Scanner sc = new Scanner(System.in)) {
            //checking age.
                System.out.println("Now let's see if you are an adult or not adult.");
                System.out.println("Please enter your age.");
        int age = sc.nextInt();
        if(age > 18) {
                System.out.println("You are an Adult.");    
        }
        else {
                System.out.println("You are not an Adult.");
        }
        }
    }
}