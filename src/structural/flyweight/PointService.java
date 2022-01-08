package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {

    private PointIconFactory pointIconFactory;

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    /**
     * This will return all the point matching user preference.
     * e.g. If a user wishes to see all the CAFE's near him.
     * Below will return a list of points(CAFE') to that user.
     *
     * @param pointType
     * @return
     */
    public List<Point> getAllPoints(PointType pointType) {

        List<Point> points = new ArrayList<>();

        Point point_01 = new Point(10, 230, pointIconFactory.getPointIcon(pointType));
        Point point_02 = new Point(5, 14, pointIconFactory.getPointIcon(pointType));
        Point point_03 = new Point(20, 120, pointIconFactory.getPointIcon(pointType));
        Point point_04 = new Point(54, 40, pointIconFactory.getPointIcon(pointType));
        Point point_05 = new Point(100, 23, pointIconFactory.getPointIcon(pointType));
        Point point_06 = new Point(10, 23, pointIconFactory.getPointIcon(pointType));
        Point point_07 = new Point(560, 20, pointIconFactory.getPointIcon(pointType));
        Point point_08 = new Point(34, 190, pointIconFactory.getPointIcon(pointType));
        Point point_09 = new Point(19, 10, pointIconFactory.getPointIcon(pointType));
        Point point_10 = new Point(1076, 1090, pointIconFactory.getPointIcon(pointType));

        points.add(point_01);
        points.add(point_02);
        points.add(point_03);
        points.add(point_04);
        points.add(point_05);
        points.add(point_06);
        points.add(point_07);
        points.add(point_08);
        points.add(point_09);
        points.add(point_10);

        return points;
    }
}
