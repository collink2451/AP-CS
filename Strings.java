package APCS;

public class Strings {
    public static void main(String[] args) {
        String name1 = "Bilbo Baggins";
        String name2 = new String("Frodo Baggins");        
        String name3 = new String(name1);
        String name4 = "Samwise Gamgee";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name2 + " and " + name4 + " are friends.");

        String firstName = "Elijah";
        String lastName = "Wood";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        firstName += lastName;
        System.out.println(firstName);

        int numMovies = 3;
        System.out.println("The number of Lord of the rings movies is " + numMovies);

        System.out.println("\"My precious\", Gollum said.");
        System.out.println("\\To print a backslash");
        System.out.println("\nTo print an extra blank line");
        System.out.println("L\t0\tR");
        firstName.indexOf("a");
    }
}