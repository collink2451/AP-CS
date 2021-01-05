package APCS;

public class CardRunner {
    public static void main(String[] args) {
        Card card1 = new Card("king", "spades", 10);
        Card card2 = new Card();

        Card card3 = new Card("ace");

        System.out.println(card1.getName());
        System.out.println(card1.getSuit());
        System.out.println(card1.getValue());
        
        System.out.println(card2);

        card2.setName("ten");
        card2.setSuit("diamonds");
        card2.setValue(10);

        System.out.println(card2);

        System.out.println(card3);

        card3.setSuit("clubs");
        card3.setValue(14);
        
        System.out.println(card3);
    }
}
