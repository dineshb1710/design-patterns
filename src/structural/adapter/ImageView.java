package structural.adapter;

/**
 * Allows user to open the image & apply filters on top of it.
 */
public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void applyFilter(Filter filter) {
        filter.apply(image);
    }
}
