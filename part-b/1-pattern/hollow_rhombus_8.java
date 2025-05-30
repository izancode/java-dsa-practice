public class hollow_rhombus_8 {

    public static void hollow_rhombus(int n) {
        for (int row = 1; row <= n; row++) {
            // space
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= n; star++) {
                if (row == 1 || row == n || star == 1 || star == n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }

            System.out.println();

        }

    }

    public static void main(String args[]) {

        hollow_rhombus(25);

    }
}