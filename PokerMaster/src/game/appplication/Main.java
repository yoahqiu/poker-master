package game.appplication;

import game.appplication.board.Card;
import game.appplication.board.Deck;
import game.appplication.players.Hand;
import game.appplication.players.Player;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("player 1", 500000, false);
        Deck gameDeck = new Deck();

        p1.setPlayerHand(new Hand(gameDeck.draw(), gameDeck.draw()));
        p1.bet(30);
        System.out.println(p1.getBank());
        System.out.println(p1.getPlayerHand());

    }

}
