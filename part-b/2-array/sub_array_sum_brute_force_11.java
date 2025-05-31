
public class sub_array_sum_brute_force_11 {
    public static void subArraySumBruteForce(int numbers[]) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                totalSum = 0;
                for (int k = start; k <= end

                ; k++) {
                    totalSum += numbers[k];

                }
                System.out.println(totalSum);
                if (maxSum < totalSum) {
                    maxSum = totalSum;

                }
            }
        }
        System.out.println("maxSum " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        subArraySumBruteForce(numbers);
    }
}
