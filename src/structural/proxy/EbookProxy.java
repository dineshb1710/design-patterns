package structural.proxy;

public class EbookProxy implements Ebook {

    private String name;
    private RealBook realBook;

    public EbookProxy(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        if (realBook == null) {
            realBook = new RealBook(name);
        }
        realBook.open();
    }
}
