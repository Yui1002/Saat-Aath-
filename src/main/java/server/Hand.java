package server;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public Hand(ArrayList<Card> cards) {
        this.hand = cards;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public void addCards(ArrayList<Card> cards) {
        this.hand.addAll(cards);
    }

    public void removeCard(Card card) {
        if (!this.contains(card)) {
            throw new IllegalArgumentException("The specified card does not exist");
        }
        this.hand.remove(card);
    }

    public boolean contains(Card card) {
        return this.hand.contains(card);
    }

    public int getSize() {
        return this.hand.size();
    }

    public boolean isEmpty() {
        return this.hand.isEmpty();
    }
}
