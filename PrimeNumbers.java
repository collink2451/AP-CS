/*
 * Collin Koldoff
 * 12/02/2020
 */

package APCS;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.print("Enter an integer greater than 1: ");
            int num = in.nextInt();
            if (isPrime(num)) {
                System.out.println(num + " is prime.\n");
            } else {
                System.out.println(num + " is not prime.\n");
            }
        }
        in.close();
    }

    public static boolean isPrime(int num) {
        for (int i=2; i<num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
