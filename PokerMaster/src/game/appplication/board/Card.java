package game.appplication.board;

public class Card {

    final public static int[] POSSIBLE_RANKS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    final public static String[] POSSIBLE_SUITS = {"spades", "clubs", "diamonds", "hearts"};
    final public static String[] POSSIBLE_FACE_CARD = {"ace", "jack", "queen", "king"};
    private int rank;
    private String suit;

    public Card(int rank, int suit) {
        setRank(rank);
        setSuit(suit);
    }

    public boolean isFaceCard() {
        if(rank == 1 || rank == 11 || rank == 12 || rank == 13)
            return true;
        else
            return false;
    }

    public String getFaceCard() {
        if (isFaceCard()) {
            switch (rank) {
                case 1:
                    return POSSIBLE_FACE_CARD[0];
                case 11:
                    return POSSIBLE_FACE_CARD[1];
                case 12:
                    return POSSIBLE_FACE_CARD[2];
                case 13:
                    return POSSIBLE_FACE_CARD[3];
            }
        }
        return "-1";
    }

    @Override
    public String toString() {
        String cardName;
        if (isFaceCard())
            cardName = getFaceCard();
        else
            cardName = "" + rank;
        cardName += " of " + suit;
        return cardName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank >= POSSIBLE_RANKS[0] && rank <= POSSIBLE_RANKS[POSSIBLE_RANKS.length - 1])
            this.rank = rank;
        else
            this.rank = POSSIBLE_RANKS[0];
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        for(String possibleSuit : POSSIBLE_SUITS) {
            if (possibleSuit.equals(suit.toLowerCase())) {
                this.suit = suit;
                return;
            }
        }
        this.suit = POSSIBLE_SUITS[0];
    }

    public void setSuit(int suitIndex) {
        if (suitIndex >= 0 && suitIndex <= POSSIBLE_SUITS.length - 1)
            this.suit = POSSIBLE_SUITS[suitIndex];
        else
            this.suit = POSSIBLE_SUITS[0];
    }

}
