/* 
 * Collin Koldoff
 * 10/09/2020
 */

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input a single word: ");

        String input = in.next();

        String output = input.substring(1) + input.charAt(0) + "ay";
        System.out.println(input + " in Pig Latin is " + output);

        in.close();
    }
}