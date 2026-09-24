package server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DeckTest {

    private Deck deck;

    @BeforeEach
    void setUp() {
//        ArrayList<Card> cards = new ArrayList<>();
//        cards.add(new Card(1, Suite.CLUB));
//        cards.add(new Card(2, Suite.HEART));
//        cards.add(new Card(3, Suite.DIAMOND));
//        deck = new Deck(cards);
    }

    @Test
    void getSizeReturnsNumberOfCardsInDeck() {
        assertEquals(3, deck.getSize());
    }

    @Test
    void dealReturnsRequestedNumberOfCards() {
//        ArrayList<Card> dealt = deck.deal(2);

//        assertEquals(2, dealt.size());
    }

    @Test
    void dealThrowsWhenRequestingMoreCardsThanAreInTheDeck() {
//        assertThrows(IllegalArgumentException.class, () -> deck.deal(4));
    }
}
