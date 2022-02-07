package behavioral.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black & White filter on this Image..");
    }
}
