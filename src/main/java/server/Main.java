package server;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        hand1.addCards(deck.deal(5, State.FACE_DOWN));
        hand2.addCards(deck.deal(5, State.FACE_DOWN));
        hand1.addCards(deck.deal(5, State.FACE_UP));

        // decide trump - assume it is CLUB
        deck.getDeck().forEach((n) -> {
            if (n.getSuite() == Suite.CLUB) {
                n.setTrump(true);
            }
        });

        hand2.addCards(deck.deal(5, State.FACE_UP));
        hand1.addCards(deck.deal(5, State.FACE_DOWN));
        hand2.addCards(deck.deal(5, State.FACE_DOWN));

        Player yui = new Player(1, hand1); // non-dealer - decides trump
        Player amit = new Player(0, hand2); // dealer

        System.out.println(deck.getSize());




    }
}
