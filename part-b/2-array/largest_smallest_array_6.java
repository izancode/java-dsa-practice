
//Largest & smallest Numer in array

public class largest_smallest_array_6 {

    public static int getLargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];

            }
        }
        System.out.println("smallest number is " + smallest);

        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 55 };
        System.out.println("largest number is " + getLargestNumber(numbers));

    }

}
