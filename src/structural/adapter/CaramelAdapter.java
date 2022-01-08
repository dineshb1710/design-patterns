package structural.adapter;

public class CaramelAdapter implements Filter {

    private CaramelFilter caramelFilter;

    public CaramelAdapter(CaramelFilter caramelFilter) {
        this.caramelFilter = caramelFilter;
    }

    @Override
    public void apply(Image image) {
        caramelFilter.init();
        caramelFilter.apply(image);
    }
}
