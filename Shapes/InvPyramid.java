public class InvPyramid {
    public static void main(String[] args) {
        int n = 1;

        //Outer loop
        for(int i = 4; i >= n; i = i - 1) {
            //Inner loop
            for(int j = 1; j <= i; j = j + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
