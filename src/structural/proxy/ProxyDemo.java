package structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Library library = new Library();
        String[] books = new String[]{"A", "B", "C"};
        for (String book : books) {
            library.addBook(book);
        }
        library.read("A");
    }
}
