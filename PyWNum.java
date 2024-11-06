public class PyWNum {
    public static void main(String[] args) {
        int n = 5;

        //Outer loop
        for(int i=1; i<=n; i++) {
            for(int j=1; j <=i; j++) {
                // space is optional
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
