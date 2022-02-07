package behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Pizza pizza_01 = new Pizza();
        pizza_01.setName("Deluxe Veggie");
        pizza_01.setPrice(367);

        Pizza pizza_02 = new Pizza();
        pizza_02.setName("Veggie Paradise");
        pizza_02.setPrice(420);

        Burger burger = new Burger();
        burger.setName("Veg Premium Burger");
        burger.setPrice(120);

        shoppingCart.addToCart(pizza_01);
        shoppingCart.addToCart(pizza_02);
        shoppingCart.addToCart(burger);

        shoppingCart.processCart();

    }
}
