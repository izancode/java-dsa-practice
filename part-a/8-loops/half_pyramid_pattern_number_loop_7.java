public class half_pyramid_pattern_number_loop_7 {
    public static void main(String args[]) {
        int user = 4;
        for (int i = 1; i <= user; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
