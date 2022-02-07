package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<FoodItem> cartItems = new ArrayList<>();

    public void addToCart(FoodItem foodItem) {
        cartItems.add(foodItem);
    }

    public void processCart() {
        FoodItemVisitor visitor = new FoodItemVisitor(true);
        for(FoodItem foodItem : cartItems) {
            foodItem.accept(visitor);
            System.out.println(foodItem);
        }
    }

}
