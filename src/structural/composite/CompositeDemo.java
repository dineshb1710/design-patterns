package structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Square square_01 = new Square();
        Square square_02 = new Square();

        Group sq_group = new Group();
        sq_group.addComponent(square_01);
        sq_group.addComponent(square_02);

        Circle circle_01 = new Circle();
        Circle circle_02 = new Circle();

        Group cir_group = new Group();
        cir_group.addComponent(circle_01);
        cir_group.addComponent(circle_02);

        Group compositeGroup = new Group();
        compositeGroup.addComponent(sq_group);
        compositeGroup.addComponent(cir_group);

        compositeGroup.render();

    }
}
