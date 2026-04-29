/*
 * Collin Koldoff
 * 09/30/2020
 */

package APCS;

public class StarsStripesRunner {
    public static void main(String[] args) {
        StarsStripes printer = new StarsStripes();
        printer.printASmallBox();
        printer.printTwoBlankLines();
        printer.printALargeBox();
    }
}

class StarsStripes {
    public StarsStripes()
    {
        System.out.println("Stars and Stripes");
        printTwoBlankLines();
    }

    public void printTwentyStars() {
        //System.out.println("********************");
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void printTwentyDashes() {
        //System.out.println("--------------------");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void printTwoBlankLines() {
        System.out.println("\n");
    }

    public void printASmallBox() {
        /*
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        */
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0)
                printTwentyDashes();
            else
                printTwentyStars();
        }
    }

    public void printALargeBox() {
        printASmallBox();
        printASmallBox();
    }
}

