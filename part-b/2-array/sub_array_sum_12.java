
public class sub_array_sum_12 {
    public static void subArraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        System.out.println(maxSum);
        for (int start = 0; start < numbers.length; start++) {
            System.out.println("start " + start);

            for (int end = start; end < numbers.length; end++) {
                int totalSum = 0;
                System.out.println("end " + end);
                for (int k = start; k <= end; k++) {
                    System.out.println(totalSum + "+" + numbers[k]);
                    totalSum += numbers[k];
                }
                System.out.print(totalSum);
                System.out.println();
                if (maxSum < totalSum) {
                    maxSum = totalSum;
                }
                System.out.println("maxSum " + maxSum);
            }
        }

        System.out.println("maxSum " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        subArraySum(numbers);
    }
}