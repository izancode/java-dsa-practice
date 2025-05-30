
public class bin_to_dec_10 {
    public static int binToDec(int n) {

        int dec = 0;
        int pow = 0;

        for (; n > 0; n /= 10) {
            int ld = n % 10;
            int bigCal = ld * (int) Math.pow(2, pow);

            dec = dec + bigCal;
            pow++;

        }
        System.out.print(" dec " + dec);

        return n;

    }

    public static void main(String args[]) {
        binToDec(1010110);

    }
}
