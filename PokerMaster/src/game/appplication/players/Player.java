package game.appplication.players;

public class Player {

    private String name;
    private int bank;
    private Hand playerHand;
    private boolean isBigBlind;
    private boolean isInGame;

    public Player(String name, int startingBank, boolean isBigBlind) {
        this.name = name;
        this.bank = startingBank;
        this.playerHand = null;
        this.isBigBlind = isBigBlind;
        this.isInGame = true;
    }

    public void bet(int amount) {
        bank -= amount;
    }

    public void fold() {
        isInGame = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public boolean isBigBlind() {
        return isBigBlind;
    }

    public void setBigBlind(boolean bigBlind) {
        isBigBlind = bigBlind;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public void setInGame(boolean inGame) {
        isInGame = inGame;
    }
}
