
public class binomial_coefficient_5 {

    public static int factorialSum(int a) {
        int fact = 1;

        for (int i = 1; i <= a; i++) {

            fact = fact * i;

            // 4 x 3 x 2 x 1

        }

        return fact;

    }

    public static void binomialCoefficient(int n, int r) {
        int nFactorial = factorialSum(n);
        System.out.println("nFactorial " + nFactorial);
        int rFactorial = factorialSum(r);
        System.out.println("rFactorial " + rFactorial);
        int nSubrFactorial = factorialSum(n - r);
        System.out.println("nSubrFactorial " + nSubrFactorial);

        int bc = nFactorial / (rFactorial * nSubrFactorial);
        System.out.println(bc);

    }

    public static void main(String args[]) {
        binomialCoefficient(5, 2);

    }
}
