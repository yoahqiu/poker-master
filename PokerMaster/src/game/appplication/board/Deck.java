package game.appplication.board;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> outOfDeck;

    public Deck() {
        cards = new ArrayList<>(64);
        outOfDeck = new ArrayList<>(64);
        createDeck();
    }

    private void createDeck() {
        for (int i = 0; i < Card.POSSIBLE_SUITS.length; i++) {
            for (int j = 1; j <= Card.POSSIBLE_RANKS.length; j++) {
                cards.add(new Card(j, i));
            }
        }
    }

    public Card draw() {
        Random picker = new Random();
        int selectedIdx;
        Card selected = null;

        if (!cards.isEmpty()) {
            selectedIdx = picker.nextInt(cards.size());
            selected = cards.get(selectedIdx);
            cards.remove(selected);
            outOfDeck.add(selected);
        }

        return selected;
    }

    public void shuffle() {
        cards.clear();
        outOfDeck.clear();
        createDeck();
    }

    public int cardsLeft() {
        return cards.size();
    }

    public int cardsDrew() {
        return outOfDeck.size();
    }

    public String toString(boolean getOutOfDeck) {
        ArrayList<Card> toBeShowed;
        String formattedList = "";

        if (getOutOfDeck == false) {
            toBeShowed = cards;
            formattedList = "Cards left in deck: \n";
        }
        else {
            toBeShowed = outOfDeck;
            formattedList = "Cards out of deck: \n";
        }

        for (Card card : toBeShowed) {
            formattedList += card + "\n";
        }

        return formattedList;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Card> getOutOfDeck() {
        return outOfDeck;
    }
}
