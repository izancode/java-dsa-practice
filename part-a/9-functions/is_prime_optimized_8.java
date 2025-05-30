
public class is_prime_optimized_8 {

    public static boolean isPrimeOptimized(int n) {
        if (n == 2) {
            return true;
        }
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;

            }
        }

        return true;

    }

    public static void main(String args[]) {
        isPrimeOptimized(100);

    }
}
