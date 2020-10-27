/*
 * Collin Koldoff
 * 09/22/2020
 */

package APCS;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your school's name? ");
        String school = keyboard.nextLine();

        keyboard.close();

        System.out.println("Your school's name is " + school);
    }
}
