
/*=>Type Casting
int marks = (int) (99.99f)




Explicit (Narrowing) Conversion:

Done manually using type casting when converting a larger data type to a smaller one.
Example: double → float → long → int → short → byte
Code Example:

double d = 10.99;
int num = (int) d;  // Manual conversion (double to int)
System.out.println(num);  // Output: 10 (decimal part lost)




*/
import java.util.*;

public class typeCoversion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.999999f;
        int b = (int) a;
        System.out.println(b);
        sc.close();
    }
}
