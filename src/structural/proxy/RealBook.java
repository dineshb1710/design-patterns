package structural.proxy;

public class RealBook implements Ebook {
    private String name;

    public RealBook(String name) {
        this.name = name;
        load();
    }

    private void load() {
        System.out.println("Loading Book -> " + name);
    }

    @Override
    public void open() {
        System.out.println("Opening Book to read -> " + name);
    }
}
