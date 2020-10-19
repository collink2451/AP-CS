public class Coins {
    public static void main(String args[]) {
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int cents = 0;
        int total = 137;

        quarters = total / 25;
        total = total % 25;
        dimes = total / 10;
        total = total % 10;
        nickles = total / 5;
        total = total % 5;
        cents = total;
        System.out.println("Q: " + quarters + "\nD: " + dimes + "\nN: " + nickles + "\nP: " + cents);
    }
}
