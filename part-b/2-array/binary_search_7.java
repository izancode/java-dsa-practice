
//binary search 

public class binary_search_7 {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            // find mid
            int mid = (start + end) / 2;
            System.out.println(mid);
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {// right side
                start = mid + 1;

            }
            if (numbers[mid] > key) {// left side
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 25;

        System.out.println("binarySearch: " + binarySearch(numbers, key));

    }

}
