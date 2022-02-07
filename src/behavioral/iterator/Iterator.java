package behavioral.iterator;

public interface Iterator<T> {

    void next();

    boolean hasNext();

    T current();
}
