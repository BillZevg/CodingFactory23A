package gr.aueb.cf.ch1;

/**
 * Προσθέτεο δύο ακεραίους
 * και εμφανίζει το αποτέλεσμα
 * στο stdout.
 */
public class  AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;


        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελεσμάτων

        System.out.println("Το αποτελεσμα των " + num1 + ", " + num2 + " είναι " + result);
        System.out.printf("Το αποτέλεσμα των %d, %d είναι %d" , num1, num2, result);
    }
}
