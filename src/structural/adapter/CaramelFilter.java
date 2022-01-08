package structural.adapter;

/**
 * Suppose, this is a 3rd party Filter.
 */
public class CaramelFilter {

    public void init() {
        System.out.println("Initializing Filter..");
    }

    public void apply(Image image) {
        System.out.println("Applying Caremel Filter on image " + image.getName());
    }
}
