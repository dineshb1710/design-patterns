package structural.decorator;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        String encrypted = "&^%$!@*%$#^&@*!^@*#^";
        stream.write(encrypted);
    }
}
