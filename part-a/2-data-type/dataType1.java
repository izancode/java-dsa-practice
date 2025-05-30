
/*
=>Data Types in Java


memory
1 bytes (8 bits)


formula 
1 bytes = 8 bits
1 bits = - negative || + postive
remaining 7 bits
base 2 = 0 and 1
negative = -2^7
postive = 2^7 -1 
Negative side: -2^15 se -1 
Positive side: 0 se 2^15 - 1 


*Primitive* 
1.byte      1 bytes [-128 to 127]  256 only number
2.short     2 bytes [-32,768 to 32,767]  65,536 only number
3.char      2 bytes 65,535 ['a',to 'z', 'A' to 'Z', '@', '%', ',']
4.boolean   1 byte  [true or false]
5.int       4 bytes [-2,14,74,83,648 to 2,14,74,83,647]  4,294,967,296 only number
6.long      8 bytes [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]  18,446,744,073,709,551,616 only number
7.float     4 bytes [-2,14,74,83,648 to 2,14,74,83,647]  4,294,967,296 only number+float
8.double    8 bytes [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]  18,446,744,073,709,551,616 only number

*Non-Primitive*
1.String
2.Array
3.Class
4.Object
5.Interface

*/

public class dataType1 {
    public static void main(String args[]) {
        byte b = -128; // 256 number
        System.out.println(b);
        char ch = 'a'; // single character only
        System.out.println(ch);
        boolean var = false;
        System.out.println(var);
        float price = 10.5F;
        System.out.println(price);
        int number = 25;
        System.out.print(number);
        // long eg:12345678765432123456543
        // double eg:55.555555555555555555
        short n = 240;
        System.out.print(n);

    }
}
