package server;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        this.initDeck();
    }

    public void initDeck() {
        // Hearts:   7,8,9,10,J,Q,K,A
        //Spades: 7,8,9,10,J,Q,K,A
        //Clubs: 	  8,9,10,J,Q,K,A
        //Diamonds : 8,9,10,J,Q,K,A

        // Hearts and Spades 7 - 13
        for (int i = 7; i <= 13; i++) {
            Card card1 = new Card(i, Suite.HEART, State.FACE_DOWN, false);
            Card card2 = new Card(i, Suite.SPADE, State.FACE_DOWN, false);
            this.deck.add(card1);
            this.deck.add(card2);
        }

        // Club and Diamonds 7 - 13
        for (int i = 8; i <= 13; i++) {
            Card card3 = new Card(i, Suite.CLUB, State.FACE_DOWN, false);
            Card card4 = new Card(i, Suite.DIAMOND, State.FACE_DOWN, false);
            this.deck.add(card3);
            this.deck.add(card4);
        }

        // Hearts / Spades / Club / Diamonds - 1
        for (Suite suite : Suite.values()) {
            this.deck.add(new Card(1, suite, State.FACE_DOWN, false));
        }
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

    public ArrayList<Card> deal(int n, State state) {
        // get the first n cards
        if (n > this.deck.size()) {
            throw new IllegalArgumentException("Not enough cards left");
        }

        ArrayList<Card> distributed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Card currentCard = this.deck.get(i);
            currentCard.setState(state);
            distributed.add(currentCard);
        }

        // remove from deck
        for (int i = 0; i < n; i++) {
            this.deck.removeFirst();
        }

        return distributed;
    }

    public int getSize() {
        return this.deck.size();
    }


}
