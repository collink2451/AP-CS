/*
 * Collin Koldoff
 * 09/22/2020
 */

import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type in two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("You entered " + num1 + " and " + num2);

        input.close();
    }
}
