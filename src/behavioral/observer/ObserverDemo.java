package behavioral.observer;

/**
 * Below class represents an implementation of Observer Pattern.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.addObserver(new SpreadSheet(dataSource));
        dataSource.addObserver(new Graph(dataSource));

        dataSource.setValue(10);
    }
}
