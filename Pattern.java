public class Pattern {

    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        for(int i = 1; i <= m; i = i + 1) {
            for(int j = 1; j <= n; j = j + 1) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}