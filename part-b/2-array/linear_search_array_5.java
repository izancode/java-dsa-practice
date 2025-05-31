//linearSearch homework practice

public class linear_search_array_5 {

    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        String menu[] = { "sand-which", "big-col", "samosa", "pizza" };

        String key = "samosa";

        int index = linearSearch(menu, key);

        if (index == -1) {
            System.out.println("Not Found");

        } else {

            System.out.println("Key is at index: " + index);
        }

    }

}
