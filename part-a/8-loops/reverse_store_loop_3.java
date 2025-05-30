public class reverse_store_loop_3 {
    public static void main(String args[]) {

        // while loop
        int nWhile = 10899;
        int i = 0;
        int lastDigitWhile = 0;
        int save_Number_While = 0;
        while (nWhile > 0) {
            lastDigitWhile = nWhile % 10;
            save_Number_While = (save_Number_While * 10) + lastDigitWhile;
            nWhile /= 10;
        }
        System.out.println("save_Number_While : " + save_Number_While);

        // for loop
        System.out.println();
        int nFor = 10899;
        int lastDigitFor = 0;
        int save_Number_For = 0;
        for (int j = 0; j < nFor; nFor /= 10) {
            lastDigitFor = nFor % 10;
            save_Number_For = (save_Number_For * 10) + lastDigitFor;
        }
        System.out.println("save_Number_For : " + save_Number_For);

        // do while loop
        System.out.println();
        int nDoWhile = 10899;
        int k = 0;
        int lastDigitDoWhile = 0;
        int save_Number_DoWhile = 0;
        do {
            lastDigitDoWhile = nDoWhile % 10;
            save_Number_DoWhile = (save_Number_DoWhile * 10) + lastDigitDoWhile;
            nDoWhile /= 10;
        } while (nDoWhile > 0);
        System.out.println("save_Number_DoWhile : " + save_Number_DoWhile);
    }
}
