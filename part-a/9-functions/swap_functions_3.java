/*
call by value topic here
 */

public class swap_functions_3 {

    public static void swap(int a, int b) {

        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is inner function value " + a);
        System.out.println("b is inner function value " + b);

    }

    public static void main(String args[]) {
        int a = 44;
        int b = 55;

        swap(a, b);
        System.out.println("a is original value " + a);
        System.out.println("b is original value " + b);

    }
}
