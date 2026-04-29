/*
 * Collin Koldoff
 * 11/19/2020
 */

package APCS;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        boolean run = true;
        int number = (int)(Math.random() * 100);
        int input = -1;
        int count = 0;
        Scanner in = new Scanner(System.in);

        int x = -2;
while(x < 9)
{
   x++;
   System.out.print(x + " ");
}


        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a magic number between 0 and 100.");
        System.out.println("");
        while(run) {
            count++;
            System.out.print("Enter your guess: ");
            input = in.nextInt();

            if (input < 0 || input > 100) {
                System.out.println("Error: Guess out of range");
            } else if (input < number) {
                System.out.println("Your guess is too low.");
            } else if (input > number) {
                System.out.println("Your guess is too high!");
            } else if (input == number) {
                run = false;
            }
            System.out.println("");
        }
        in.close();
        System.out.println("Yes, the number is " + number);
        System.out.println("It took you " + count + " guesses to guess the magic number.");
    }
}
