package behavioral.visitor;

public interface Visitor {
    Pizza visit(Pizza pizza);
    Burger visit(Burger burger);
}
