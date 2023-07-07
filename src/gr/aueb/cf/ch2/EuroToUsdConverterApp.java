package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει euros σε Δολάρια ΗΠΑ.
 * Λαμβάνει από τον χρήστη (stdin) ένα ακέραιο
 * που συμβολίζει και εμφανίζει τι τελικό αποτέλεσμα.
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Εντολές
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars= totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);

    }
}
