public class InvPyWNum {
    
    public static void main(String[] args) {
        int n = 1;

        //Outer loop
        for(int i=5; i>=n; i--) {
            for(int j=1; j <=i; j++) {
                // space is optional
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}