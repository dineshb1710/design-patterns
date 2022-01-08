package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {

    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public void render() {
        for (Component component : components) {
            component.render();
        }
    }
}
