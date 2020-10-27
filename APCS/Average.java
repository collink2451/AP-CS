/*
 * Collin Koldoff
 * 09/16/2020
 */

package APCS;

public class Average {
    public static void main(String[] args) {
        int exam1 = 98, exam2 = 95, exam3 = 87;
        /* or
        int exam1 = 98;
        int exam2 = 95;
        int exam3 = 87
        */
        int totalScore = exam1 + exam2 + exam3;
        final int TOTAL_EXAMS = 3;
        double average = (double) totalScore / (double) TOTAL_EXAMS;
        System.out.println("Your exam average is: " + average);
    }
}