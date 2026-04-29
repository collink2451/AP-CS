/*
 * Collin Koldoff
 * 09/09/2020
 */

package APCS;

public class Receipt {
    public static void main(String args[]) {
        int subtotal = 38 + 40 + 30;
        double tax = subtotal * 0.08;
        double tip = subtotal * 0.15;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}