/*
*Unary* (1 operands)
a=a+1  ++ a++ increment operator
a=a-1  -- a-- decrement operator

Pre Increment & Post Increment
Pre Increment
++a
1.value change
2.value use
*/

public class pre_increment_unary_2 {
    public static void main(String args[]) {
        int a = 10;
        int b = ++a;

        System.out.println(a);
        System.out.println(b);
    }
}