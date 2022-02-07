package behavioral.visitor;

/**
 * Visitable
 */
public interface FoodItem {
    void accept(Visitor visitor);
}
