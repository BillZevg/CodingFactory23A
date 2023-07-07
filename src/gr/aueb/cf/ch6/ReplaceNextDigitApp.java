package gr.aueb.cf.ch6;

/**
 * Replaces all array digits with
 * the next digit.
 */
public class ReplaceNextDigitApp {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8};

    }

    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length -1] = 0;
    }
}
