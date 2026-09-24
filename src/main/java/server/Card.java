package server;

enum Suite {
    HEART,
    DIAMOND,
    SPADE,
    CLUB
}

enum State {
    FACE_UP,
    FACE_DOWN
}

public class Card {
    private int number; // 2 - 10, J, Q, K, A (11,12,13,1)
    private Suite suite;
    private State state;
    private boolean isTrump;

    public Card(int number, Suite suite, State state, boolean isTrump) {
        this.number = number;
        this.suite = suite;
        this.state = state;
        this.isTrump = isTrump;
    }

    public int getNumber() {
        return this.number;
    }

    public Suite getSuite() {
        return this.suite;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isTrump() {
        return isTrump;
    }

    public void setTrump(boolean trump) {
        this.isTrump = trump;
    }
}
