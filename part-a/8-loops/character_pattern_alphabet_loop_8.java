public class character_pattern_alphabet_loop_8 {
    public static void main(String args[]) {
        int user = 4;
        char ch = 'A';
        for (int i = 1; i <= user; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
