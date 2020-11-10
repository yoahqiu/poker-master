package game.appplication.board;

import game.appplication.players.Player;

import java.util.ArrayList;

public class Table {

    private Card[] cardsOnTable = new Card[5];
    private Deck gameDeck;
    private int cardIndex;
    private int pot;
    private ArrayList<Player> players;
    private ArrayList<Player> outOfTable;

    public Table(ArrayList<Player> newPlayers) {
        gameDeck = new Deck();
        cardIndex = 0;
        pot = 0;
        players = newPlayers;
    }

    public void initialBet() {
        
    }

}
