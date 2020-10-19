class Dog {
    private String breed;
    private String name;
    private boolean isFemale;
    private int age;

    public Dog() {
        breed = null;
        name = null;
        isFemale = false;
        age = 0;
        System.out.println(breed);
        System.out.println(name);
        System.out.println(isFemale);
        System.out.println(age);
    }

    public Dog(String br, String nm, boolean isFem, int ag) {
        breed = br;
        name = nm;
        isFemale = isFem;
        age = ag;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void growl() {
        System.out.println("Grrrrrrr!");
    }
}

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Collie", "Lassie", true, 4);
        dog1.bark();
        dog1.growl();
        Dog dog2 = new Dog("Maltese", "Frankie", false, 11);
        dog2.growl();
    }
}