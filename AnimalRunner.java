/*
 * Collin Koldoff
 * 01/05/2021
 */

package APCS;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1);
        animal1.setName("Finnley");
        animal1.setType("White Lab");
        animal1.setAge(1);
        animal1.setWeight(20.0);
        System.out.println(animal1);

        Animal animal2 = new Animal("Remy", "White Lab", 1, 19.0);
        System.out.println(animal2);
    }
}