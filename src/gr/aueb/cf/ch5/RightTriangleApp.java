package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές double απο τον χρήστη, τις
 * a, b, c όπου a είναι η υποτείνουσα και
 * b, c οι δύο πλευρές/
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ. \
 * a^2 == b^2 + c^2
 *
 * Εστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert the hypotenuse (double)");
        a = in.nextDouble();

        System.out.println("Please insert the other two side lengths");
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a * a - (b * b + c * c)) <= EPSILON;

        System.out.println("The triangle is " + (isRight ? "" : "not ") + "right") ;




    }
}
