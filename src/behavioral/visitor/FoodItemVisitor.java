package behavioral.visitor;

public class FoodItemVisitor implements Visitor {

    private boolean hasPromoCode;

    public FoodItemVisitor(boolean hasPromoCode) {
        this.hasPromoCode = hasPromoCode;
    }

    @Override
    public Pizza visit(Pizza pizza) {
        if (!hasPromoCode) {
            return pizza;
        }
        // Applying Promo prices on every food item..
        double promoPrice = getPromoPriceForFoodItem(pizza.getPrice());
        pizza.setPrice(promoPrice);
        return pizza;
    }

    @Override
    public Burger visit(Burger burger) {
        if (!hasPromoCode) {
            return burger;
        }
        // Applying Promo prices on every food item..
        double promoPrice = getPromoPriceForFoodItem(burger.getPrice());
        burger.setPrice(promoPrice);
        return burger;
    }

    private double getPromoPriceForFoodItem(double price) {
        // Flat 20% off..
        double discount = (price * 20) / 100;
        return price - discount;
    }
}
