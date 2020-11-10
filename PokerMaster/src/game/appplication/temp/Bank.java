package game.appplication.temp;

public class Bank {

    final public static int POSSIBLE_CHIPS[] = {1, 5, 10, 25, 100};
    private Chip[] playerBank;

    public Bank(int ones, int fives, int tens, int twentyFives, int hundreds) {
        setPlayerBank(ones, fives, tens, twentyFives, hundreds);
    }

    @Override
    public String toString() {
        return String.format("$%s: [$%d: %d, $%d: %d,$%d: %d,$%d: %d,$%d: %d]", getBankTotal(),
                POSSIBLE_CHIPS[0], playerBank[0].getTotal(), POSSIBLE_CHIPS[1], playerBank[1].getTotal(),
                POSSIBLE_CHIPS[2], playerBank[2].getTotal(), POSSIBLE_CHIPS[3], playerBank[3].getTotal(),
                POSSIBLE_CHIPS[4], playerBank[4].getTotal());
    }

    public int getBankTotal() {
        int total = 0;
        for(Chip chip : playerBank)
            total += chip.getTotal();
        return total;
    }

    public Chip[] getPlayerBank() {
        return playerBank;
    }

    public void setPlayerBank(int ones, int fives, int tens, int twentyFives, int hundreds) {
        playerBank[0] = new Chip(POSSIBLE_CHIPS[0], ones);
        playerBank[1] = new Chip(POSSIBLE_CHIPS[1], fives);
        playerBank[2] = new Chip(POSSIBLE_CHIPS[2], tens);
        playerBank[3] = new Chip(POSSIBLE_CHIPS[3], twentyFives);
        playerBank[4] = new Chip(POSSIBLE_CHIPS[4], hundreds);
    }
}
