/* 
 * Collin Koldoff
 * 11/09/2020
 */

package APCS;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        String input;
        while (run) {
            System.out.print("Enter a year or type cancel: ");
            input = in.nextLine();
            if (input.toLowerCase().equals("cancel")) {
                run = false;
                break;
            }
            isLeapYear(Integer.parseInt(input));
        }
        in.close();
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.\n");
            return;
        }
        System.out.println(year + " is NOT a leap year.\n");
    }
}
