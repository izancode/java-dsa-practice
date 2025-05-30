
/*=>Type Conversion or widening conversion or implicit coversion
Type Conversion in Java (Simple Explanation)
Type conversion in Java means converting a value from one data type to another. It is of two types:

Implicit (Widening) Conversion:

Happens automatically when converting a smaller data type to a larger one.
Example: int → long → float → double
Code Example:

int num = 10;
double d = num;  // Automatic conversion (int to double)
System.out.println(d);  // Output: 10.0
Coversion happens when:
a. type compatible
b. destination type > source type

byte->short->int->float->long->double
*/

public class typeCasting1 {
    public static void main(String args[]) {
        int a = 15;
        long b = a;
        System.out.println(b);
    }
}
