package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Ebook> books = new HashMap<>();

    public void addBook(String name) {
        books.put(name, new EbookProxy(name));
    }

    public void read(String name) {
        books.get(name).open();
    }
}
