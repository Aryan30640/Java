import java.util.*;


    public class Calc {
        public static void main(String args[]) {    
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Basic Calculator");
                System.out.println("Enter first number:");
            int a = sc.nextInt();
                System.out.println("Enter second number:");
            int b = sc.nextInt();
                System.out.println("Enter Operator. 1 means '+'', 2 means '-', 3 means '*', 4 means '/', 5 means '%' ");
            int operator = sc.nextInt();


            switch(operator) {
            case 1 -> System.out.println(a + b);
            
            case 2 -> System.out.println(a - b);
            
            case 3 -> System.out.println(a * b);
            
            case 4 -> System.out.println(a / b);
            
            case 5 -> System.out.println(a % b);
            
            }
            }   
    }
}