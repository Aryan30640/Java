import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Enter a name below to print a copy of it.");
        try (Scanner sc = new Scanner(System.in)) {
            //printing the same line or text.
            String name = sc.nextLine();
                System.out.println(name);
            //adding two integers.
                System.out.println("Now put two integers to add them.");
            int a = sc.nextInt();
            int b = sc.nextInt();
                System.out.println(a + b);
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