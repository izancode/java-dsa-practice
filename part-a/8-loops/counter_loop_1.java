/*
 * 
 * In java 3 types of loop
 * 
 * a. while loop
 * b. for loop
 * c. do while loop
 * 
 * 
 * while loop
 * while (condition) {
 * //do something
 * }
 * 
 * 
 * for loop
 * for (initialisation; condtion; updation;) {
 * // do something
 * }
 * 
 * do while loop
 * do {
 * // do something
 * } while (condtion)
 * run atleast one time if the condition is false.
 * 
 * 
 * 
 * a. Break Statement
 * to exist the loop;
 * 
 * b. Continue Statement
 * to skip an iteration;
 * 
 * 
 */

public class counter_loop_1 {

    public static void main(String args[]) {

        // while
        int counter_while = 1;
        while (counter_while <= 10) {
            System.out.println(counter_while + " Hello world! While");
            counter_while++;

        }

        // for

        for (int counter_for = 1; counter_for <= 10; counter_for++) {
            System.out.println(counter_for + " Hello world! for");

        }

        // do-while
        int counter_do_while = 1;
        do {
            System.out.println(counter_do_while + " Hello world! While");
            counter_do_while++;

        } while (counter_do_while < 0);

    }
}
