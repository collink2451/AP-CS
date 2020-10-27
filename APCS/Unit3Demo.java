package APCS;

public class Unit3Demo {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        System.out.println(x + " == " + y + " is " + (x==y)); // false
        System.out.println(x + " > " + y + " is " + (x>y)); // true
        System.out.println(x + " < " + y + " is " + (x<y)); // false
        System.out.println(x + " <= " + y + " is " + (x<=y)); // false
        System.out.println(x + " >= " + y + " is " + (x>=y)); // true
        System.out.println(x + " != " + y + " is " + (x!=y)); // true

        int age = 17;
        if (age > 17) {
            System.out.println("You're over 17 years old!");
        } else {
            System.out.println("You're not over 17 years old!");
        }
    }
}