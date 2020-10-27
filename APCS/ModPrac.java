package APCS;

public class ModPrac {
    public static void main(String args[]) {
        System.out.println(45 % 6);
        System.out.println(2 % 2);
        System.out.println(8 % 10);
        try {
            System.out.println(11 % 0);
        } catch (ArithmeticException ae) {
            System.err.println(ae);
        }
    }
}
