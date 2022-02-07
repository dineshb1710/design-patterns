package behavioral.observer;

public class DataSource extends Observable {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        // Notify all other entities once this field is updated.
        notifyObservers();
    }
}
