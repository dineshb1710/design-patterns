package behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ImageStore imageStore = new ImageStore(new PNGCompressor(), new HighContrastFilter());
        imageStore.store("abc.jpeg");
    }
}
