public class pattern {
    public static void diamond(int total_rows) {
        for (int row = 1; row <= total_rows; row++) {
            for (int space = 1; space <= total_rows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = total_rows; row >= 1; row--) {
            for (int space = 1; space <= total_rows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(4);
    }
}
