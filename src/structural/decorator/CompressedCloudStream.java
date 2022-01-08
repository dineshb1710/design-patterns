package structural.decorator;

public class CompressedCloudStream implements Stream {

    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressed = data.substring(0, 5);
        stream.write(compressed);
    }
}
