
/*=>Input in Java

1.next
2.nextLine
3.nextInt
4.nextByte
5.nextFloat
6.nextDouble
7.nextBoolean
8.nextShort
9.nextLong


*/
import java.util.*;

public class input1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        double stock = sc.nextDouble();
        System.out.println(stock);

        boolean test = sc.nextBoolean();
        System.out.println(test);
        sc.close();

    }
}
