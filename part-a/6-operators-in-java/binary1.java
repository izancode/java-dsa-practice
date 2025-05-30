/*
 * => Operators in Java
 * Symbols that tell compiler to perform some operation
 * sum = a + b
 * a,b is operand
 * + is operator
 * operation is Addition
 * 
 * Types of Operators*
 * 1.Arithmetic Operators (Binary/Unary)
 * 2.Relational Operators
 * 3.Logical Operators
 * 4.Bitwise Operators (Bit Manipulation)
 * 5.Assignment Operators
 * 
 * Ternary Operators
 
 
 1.Arithmetic Operators
 A=10, B =5
 *Binary* (2 operands)
 + A+B = 10 + 5 = 10
 - A-B = 10 - 5 = 5
 * A*B = 10 + 5 = 50
 / A/B = 10 / 5 = 2
 % (modulo) A%B = 10%5 = 0
 */

public class binary1 {

    public static void main(String args[]) {
        int A = 10;
        int B = 5;
        System.out.println("Add = " + (A + B));
        System.out.println("Sub = " + (A - B));
        System.out.println("Mul = " + (A * B));
        System.out.println("Div = " + (A / B));
        System.out.println("Mod = " + (A % B));
    }
}