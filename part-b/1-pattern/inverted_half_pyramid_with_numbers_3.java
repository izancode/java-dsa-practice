public class inverted_half_pyramid_with_numbers_3 {
    public static void inverted_half_pyramid_with_numbers(int total_rows) {
        for (int row = 1; row <= total_rows; row++) {
            for (int number = 1; number <= (total_rows - row) + 1; number++) {
                System.out.print(number);

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {

        inverted_half_pyramid_with_numbers(5);

    }
}