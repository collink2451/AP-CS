package APCS;

public class Unit3Demo {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        System.out.println(x + " == " + y + " is " + (x == y)); // false
        System.out.println(x + " > " + y + " is " + (x > y)); // true
        System.out.println(x + " < " + y + " is " + (x < y)); // false
        System.out.println(x + " <= " + y + " is " + (x <= y)); // false
        System.out.println(x + " >= " + y + " is " + (x >= y)); // true
        System.out.println(x + " != " + y + " is " + (x != y)); // true

        int age = 17;
        if (age > 17) {
            System.out.println("You're over 17 years old!");
        } else {
            System.out.println("You're not over 17 years old!");
        }

        if (age >= 16) {
            System.out.println("You probably have your license");
        } else {
            System.out.println("You are too young to have a license");
        }

        if (age >= 18) {
            System.out.println("You can vote.");
            System.out.println("You can get a motorcycle license without a riding test.");
        } else if (age >= 16) {
            System.out.println("You can get your license.");
        } else if (age >= 15) {
            System.out.println("You can learn how to drive with a permit.");
        } else {
            System.out.println("You are excited to start learning to drive");
        }

        int num = 12;
        if (num > 20) {
            if (num % 6 == 0) {
                System.out.println(num + " is greater than 20 && div by 6");
            } else {
                System.out.println(num + " is greater than 20 but not div by 6");
            }
        } else {
            System.out.println(num + " is not greater than 20");
        }

        if (num > 30)
            if (num < 60)
                System.out.println(num + " is greater than 30 and less than 60");
            else
                System.out.println("Which if does the else belong to?");

        age = 13;
        boolean isEarly = false;
        if (age > 10)
            if(isEarly)
                System.out.println(age + " is greater than 10 && isEarly is true");
            else
                System.out.println(age + " is greater than 10 && isEarly is false");
        else
            System.out.println(age + " is not greater than 10");
        System.out.println("This will be printed");

    }
}