package structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Image image = new Image("abc.jpg");
        ImageView imageView = new ImageView(image);
        imageView.applyFilter(new CaramelAdapter(new CaramelFilter()));
    }
}
