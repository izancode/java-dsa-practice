public class prime_loop_4 {
    public static void main(String args[]) {
        int n = 7;
        int result = 0;
        boolean isPrime = true;

        if (n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                result = n % i;
                // System.out.println(n + " * * " + result);
                if (result == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime == true) {
            System.out.println(n + " is a prime Number");
        } else {
            System.out.println(n + " is not a prime Number");
        }
    }
}
