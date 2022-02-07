package behavioral.iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.addHistory("a");
        browserHistory.addHistory("b");
        browserHistory.addHistory("c");

        Iterator iterator = browserHistory.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
