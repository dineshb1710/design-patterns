package behavioral.strategy;

public class JPEGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Applying JPEG Compression Strategy on this Image..");
    }
}
