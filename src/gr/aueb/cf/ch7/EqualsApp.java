package gr.aueb.cf.ch7;

/**
 * Compares two Strings for equality
 */
public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");

        if (s1.equals(s2)) {
            System.out.println("EQUAL");
        }

    }
}
