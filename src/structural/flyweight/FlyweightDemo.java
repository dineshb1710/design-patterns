package structural.flyweight;

import java.util.List;

public class FlyweightDemo {

    public static void main(String[] args) {

        PointService pointService = new PointService(new PointIconFactory());
        List<Point> points = pointService.getAllPoints(PointType.CAFE);
        for (Point point : points) {
            point.draw();
        }
    }
}
