package game.appplication.temp;

public class Chip {

    private int value;
    private int count;

    public Chip(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getTotal() {
        return value * count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
