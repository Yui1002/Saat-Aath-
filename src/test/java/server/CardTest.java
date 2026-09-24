package server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    void getNumberReturnsTheNumberPassedToConstructor() {
        Card card = new Card(7, Suite.HEART, State.FACE_DOWN, false);

        assertEquals(7, card.getNumber());
    }

    @Test
    void getSuiteReturnsTheSuitePassedToConstructor() {
        Card card = new Card(7, Suite.HEART, State.FACE_DOWN, false);

        assertEquals(Suite.HEART, card.getSuite());
    }
}
