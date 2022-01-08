package structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
        storeCompressedData(new CompressedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }

    public static void storeCompressedData(Stream stream) {
        stream.write("Lorem Impsum li men der");
    }
}
