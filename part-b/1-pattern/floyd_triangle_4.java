public class floyd_triangle_4 {
    public static void floyd_triangle(int total_rows) {
        int counter = 1;
        for (int row = 1; row <= total_rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {

        floyd_triangle(5);

    }
}