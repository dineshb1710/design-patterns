package behavioral.observer;

public class Graph implements Observer {

    private DataSource dataSource;

    public Graph(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Graph Object Notified !! -> " + dataSource.getValue());
    }
}
