
public class prime_in_range_9 {
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

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrimeOptimized(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primesInRange(100);

    }
}
