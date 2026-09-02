package server;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(1, Suite.CLUB);
        Card card2 = new Card(2, Suite.HEART);
        Card card3 = new Card(3, Suite.DIAMOND);
        Card card4 = new Card(4, Suite.CLUB);
        Card card5 = new Card(5, Suite.SPADE);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        Deck deck = new Deck(cards);
        deck.shuffle();
        ArrayList<Card> dealt = deck.deal(3);

        for (int i = 0; i < dealt.size(); i++) {
            System.out.println(dealt.get(i).getNumber());
        }
    }
}
