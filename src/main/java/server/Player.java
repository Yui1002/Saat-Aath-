package server;

public class Player {
    private int turn; // 0 (non-dealer - choose trump) or 1 (dealer)
    private Hand hand;

    public Player(int turn, Hand hand) {
        this.turn = turn;
        this.hand = hand;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
