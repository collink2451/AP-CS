package APCS;

public class Card {
    private String name;
    private String suit;
    private int value;


    public Card() {
        name = "";
        suit = "";
        value = 0;
    }
    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    public Card(String name) {
        this.name = name;
        suit = "";
        value = 0;
    }


    public String getName() {
        return name;
    }
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setValue(int value) {
        this.value = value;
    }


    public String toString() {
        return "Card Name: " + name + " Suit: " + suit + " Value: " + value;
    }
}
