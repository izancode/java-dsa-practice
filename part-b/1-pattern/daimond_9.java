public class daimond_9 {

    public static void daimond(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");

            }

            System.out.println();
        }
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }

    public static void main(String args[]) {

        daimond(3);

    }
}