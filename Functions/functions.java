import  java.util.*;

public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        System.out.println("exiting with code 0");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();

            printMyName(name);
        }
    }
}