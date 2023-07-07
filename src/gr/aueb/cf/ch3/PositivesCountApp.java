package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Μετράει το πλύθος των θετικών
 * αριθμών που δίνει ο χρήστης.
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;


        System.out.println("Please gone a nim (int");
        num = in.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please give a num (int) ");
            num = in.nextInt();
        }

        System.out.println("Positive-count: " + positivesCount);
    }
}
