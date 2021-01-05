/*
 * Collin Koldoff
 * 01/05/2021
 */

package APCS;

public class Animal {
    private String name;
    private String type;
    private int age;
    private double weight;

    public Animal() {
        name = "null";
        type = "null";
        age = -1;
        weight = 0.0;
    }

    public Animal(String name, String type, int age, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Age: " + age + ", Weight: " + weight;
    }
}
