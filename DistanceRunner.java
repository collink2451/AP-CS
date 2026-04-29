/*
 * Collin Koldoff
 * 10/20/2020
 */

package APCS;

import java.util.Scanner;

class Distance {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return (int)((Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))) * 1000) / 1000.0;
    }
}

public class DistanceRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = in.nextInt();
        System.out.print("Enter y1: ");
        int y1 = in.nextInt();
        System.out.print("Enter x2: ");
        int x2 = in.nextInt();
        System.out.print("Enter y2: ");
        int y2 = in.nextInt();

        in.close();

        System.out.printf("The distance is " + Distance.getDistance(x1, y1, x2, y2));
    }
}
