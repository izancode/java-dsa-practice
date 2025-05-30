public class inverted_rotated_half_pramid_2 {
    public static void inverted_rotated_half_pramid(int total_rows) {
        for (int row = 1; row <= total_rows; row++) {
            // space
            for (int space = 1; space <= total_rows - row; space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // Next Line
            System.out.println();
        }
    }

    public static void main(String args[]) {

        inverted_rotated_half_pramid(4);

    }
}