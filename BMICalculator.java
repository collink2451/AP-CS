/*
 * Collin Koldoff
 * 11/04/2020
 */

package APCS;
import java.util.Scanner;

public class BMICalculator {
    static double bmi;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Height (in inches): ");
        double height = in.nextDouble();
        System.out.print("Weight (in pounds): ");
        double weight = in.nextDouble();

        String weightClass = getWeightClass(height, weight);

        System.out.println("BMI = " + bmi);
        System.out.println("You are considered " + weightClass);

        in.close();
    }

    public static double calcBMI(double height, double weight) {
        return (weight / Math.pow(height, 2)) * 703;
    }

    public static String getWeightClass(double height, double weight) {
        bmi = calcBMI(height, weight);
        if (bmi >= 30.0) {
            return "obese";
        } else if (bmi >= 25.0) {
            return "overweight";
        } else if (bmi >= 18.5) {
            return "normal";
        } else if (bmi < 18.5) {
            return "underweight";
        } else {
            return "Error: Invalid BMI";
        }
    }
}
