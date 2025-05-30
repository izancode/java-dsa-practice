public class reverse_loop_2 {
    public static void main(String args[]) {

        // While loop
        int nWhile = 10899;
        while (nWhile > 0) {
            int lastDigitWhile = nWhile % 10;
            System.out.print(lastDigitWhile);
            nWhile /= 10;
        }

        // For loop
        System.out.println();
        int nFor = 10899;
        for (; nFor > 0; nFor /= 10) {
            int lastDigitFor = nFor % 10;
            System.out.print(lastDigitFor);
        }

        // Do-while loop
        System.out.println();
        int nDoWhile = 10899;
        do {
            int lastDigitDoWhile = nDoWhile % 10;
            System.out.print(lastDigitDoWhile);
            nDoWhile /= 10;
        } while (nDoWhile > 0);
    }
}
