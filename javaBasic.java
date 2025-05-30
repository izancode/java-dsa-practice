
import java.util.*;

public class javaBasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int prime = sc.nextInt();
        int cal = 0;
        boolean result = true;
        // prime 5

        int i = 2;
        while (i < prime) {
            if (prime == 2) {
                result = true;
            }
            cal = prime % i;
            if (cal == 0) {
                result = false;
                break;

            }
            System.out.println(i + " " + cal + " " + prime);

            i++;
        }
        if (result == true) {

            System.out.println(prime + " its a prime ");
        } else {

            System.out.println(prime + " its not a prime");
        }

    }
}