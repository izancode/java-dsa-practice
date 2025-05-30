public class inverted_star_loop_6 {
    public static void main(String args[]) {
        int user = 4;
        for (int line = 1; line <= user; line++) {
            for (int star = 1; star <= (user - line) + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
