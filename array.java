import java.util.*;

public class array {
    public static void subArraySumPrefix(int numbers[]) {
        int currSum = 0;

        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
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
        subArraySumPrefix(numbers);
    }
}
