package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει ένα πίνακα με τη χρήση
 * μεθόδου.
 */
public class PrintArrayMethod {
    public static void main(String[] args) {
        int[] ages = {19, 25, 34, 42};
        printArray(ages);

    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
       // if (arr == null) return;
        if ((arr == null) || low < 0 || high > arr.length - 1) return;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
