
public class factorial_sum_functions_4 {

    public static int factorialSum(int a) {
        int fact = 1;

        for (int i = 1; i <= a; i++) {

            fact = fact * i;

            // 4 x 3 x 2 x 1

        }

        return fact;

    }

    public static void main(String args[]) {
        System.out.println(factorialSum(4));

    }
}
