
public class functions_overloading_6 {

    public static int sumOfNumber(int a, int b) {
        return a + b;

    }

    public static int sumOfNumber(int a, int b, int c) {
        return a + b + c;

    }

    public static float sumOfNumber(float a, float b) {
        return a + b;

    }

    public static void main(String args[]) {
        System.out.println(sumOfNumber(10, 20));
        System.out.println(sumOfNumber(10, 20, 30));

        System.out.println(sumOfNumber(10.12f, 20.33f));

    }
}
