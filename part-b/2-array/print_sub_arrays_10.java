
//print subarray

public class print_sub_arrays_10 {

    public static void printSubArrays(int numbers[]) {
        // System.out.println(numbers.length);

        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {

                int storeSum = 0;
                for (int koya = start; koya <= end; koya++) {
                    System.out.print(numbers[koya] + " ");
                    storeSum = storeSum + numbers[koya];
                }
                System.out.print(" = storeSum " + storeSum);

                System.out.println();

            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);

    }

}
