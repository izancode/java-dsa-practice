public class hollow_reactange_1 {
    public static void hollow_reactange(int total_rows, int total_cols) {
        // outer rows
        for (int row = 1; row <= total_rows; row++) {
            // inner - colums
            for (int col = 1; col <= total_cols; col++) {
                // cell - (i,j)
                if (row == 1 || row == total_rows || col == 1 || col == total_cols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_reactange(4, 5);

    }

}