public class butterFly_6 {
    public static void butterFly(int total_rows) {
        // 1st half
        for (int row = 1; row <= total_rows; row++) {
            // star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // space
            for (int space = 1; space <= 2 * ((total_rows - row)); space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int row = total_rows; row >= 1; row--) {
            // star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // space
            for (int space = 1; space <= 2 * ((total_rows - row)); space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        butterFly(15);

    }
}