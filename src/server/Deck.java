package server;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck; // [1,2,3,4,5,6,7,8,9,10]

    public Deck(ArrayList<Card> cards) {
        this.deck = new ArrayList<>(cards);
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public void draw() {
        // take the top card
        this.deck.getFirst();
    }

    public ArrayList<Card> deal(int n) {
        if (n > this.deck.size()) {
            throw new IllegalArgumentException("Not enough cards left");
        }

        ArrayList<Card> distributed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            distributed.add(this.deck.get(i));
        }

        return distributed;
    }

    public int getSize() {
        return this.deck.size();
    }
}
