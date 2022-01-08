package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType pointType) {
        if (!icons.containsKey(pointType)) {
            icons.put(pointType, new PointIcon(pointType, null));
        }
        return icons.get(pointType);
    }
}
