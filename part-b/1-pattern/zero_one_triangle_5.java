public class zero_one_triangle_5 {
    public static void zero_one_triangle(int total_rows) {
        for (int row = 1; row <= total_rows; row++) {
            for (int col = 1; col <= row; col++) {
                int evenNumber = (col + row) % 2;
                if (evenNumber == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        zero_one_triangle(5);

    }
}