
//Passing arrays as argument

public class passing_array_3 {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 50;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }

    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };

        for (int i = 0; i < marks.length; i++) {
            System.out.print("old: " + marks[i] + " ");

        }
        System.out.println();
        int nonChangable = 5;
        System.out.println("nonChangable: before> " + nonChangable);
        update(marks, nonChangable);
        System.out.println("nonChangable: after> " + nonChangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("new: " + marks[i] + " ");

        }
    }

}
