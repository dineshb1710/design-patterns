package behavioral.strategy;

public class PNGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Applying PNG Compression Strategy on this Image..");
    }
}
