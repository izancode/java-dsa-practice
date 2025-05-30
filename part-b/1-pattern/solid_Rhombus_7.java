public class solid_Rhombus_7 {

    public static void solid_Rhombus(int total_rows) {
        for (int row = 1; row <= total_rows; row++) {
            // space
            for (int space = 1; space <= total_rows - row; space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= total_rows; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        solid_Rhombus(5);

    }
}