/*
 * Collin Koldoff
 * 09/23/2020
 */
package APCS;

import java.util.Scanner;
import java.lang.Math;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String name = input.nextLine(); // Grabs full name

        System.out.print("Please enter your nickname or press enter if you do not have one: ");
        String nick = input.nextLine(); // Uses next line to detect an empty response
        if(nick.isEmpty()) { // Checks if nick is an empty string
            nick = "None";
        }

        System.out.print("Please enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Please enter a recent exam score: ");
        int exam1 = input.nextInt();

        System.out.print("Please enter another recent exam score: ");
        int exam2 = input.nextInt();

        System.out.print("Please enter another recent exam score: ");
        int exam3 = input.nextInt();

        input.close();

        double examAverage = (double) Math.round(((double) (exam1 + exam2 + exam3) / 3.0) * 100) / 100; // Converts 3 scores into average rounded to 2 decimal places
        System.out.println("");
        System.out.println("User's name: " + name);
        System.out.println("User's nickname: " + nick);
        System.out.println("User's GPA: " + gpa);
        System.out.println("User's exam average: " + examAverage);
    }
}
