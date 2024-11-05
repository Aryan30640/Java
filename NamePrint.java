import java.util.*;

public class NamePrint {

    public static void main(String[] args) {
            //--
                System.out.println("Enter a name below to print a copy of it.");
        try (Scanner sc = new Scanner(System.in)) {
            //printing the same line or text.
        String name = sc.nextLine();
                System.out.println(name);
        }
    }
}