/*
 * Collin Koldoff
 * 11/05/2020
 */

package APCS;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean cleanedRoom = false;
        boolean didHomework = true;
        
        if (cleanedRoom || didHomework) {
            System.out.println("You can go out.");
        } else {
            System.out.println("You need to stay in.");
        }

        boolean homeworkDone = false;
        if (!homeworkDone) {
            System.out.println("You have not done your homework.");
        }

        int score = 10;

        if (score < 0 || score > 100) {
            System.out.println(score + " has an illegal value.");
        } else {
            System.out.println(score + " is [0, 100]");
        }
    }
}
