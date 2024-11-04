import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println(name);
        }
    }
}