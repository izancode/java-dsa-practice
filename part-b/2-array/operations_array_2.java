import java.util.*;

public class operations_array_2 {
    public static void main(String args[]) {
        // creating an array

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int pyh;
        // pyh = sc.nextInt();
        System.out.println("length of array: " + marks.length);

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // maths

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("maths: " + marks[2]);
        marks[2] = 40;
        System.out.println("maths: " + marks[2]);
        marks[2] = marks[2] + 1;
        System.out.println("maths: " + marks[2]);

        int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("percentage: " + percentage + "%");
        sc.close();
        // input/output
        // creating an array

    }

}