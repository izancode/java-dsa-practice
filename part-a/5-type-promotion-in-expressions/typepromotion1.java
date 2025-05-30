
/*=> Type Promotion in Expressions
1.Java automatically promotes each byte, short, or char operand to int
when evaluating an expression.

byte + short + char = int

2. If one operand is long, float or double the whole expression is
promoted to long, float, or double respectively.

largest long = long
largest float = float 
largest double = double
*/
import java.util.*;

public class typepromotion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        char ch2 = 'b'; // 'c','d','e','f','g'
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
        sc.close();

    }
}
