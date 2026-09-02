package server;

enum Suite {
    HEART,
    DIAMOND,
    SPADE,
    CLUB
}

public class Card {
    private int number; // 2 - 10, J, Q, K, A (11,12,13,1)
    private Suite suite; 

    public Card(int number, Suite suite) {
        this.number = number;
        this.suite = suite;
    }

    public int getNumber() {
        return this.number;
    }

    public Suite getSuite() {
        return this.suite;
    }
}
