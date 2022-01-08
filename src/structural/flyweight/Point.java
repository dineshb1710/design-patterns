package structural.flyweight;

/**
 * Remember, In flyweight the intrinsic & extrinsic properties makes a lot of difference
 * and could help in saving a lot of space.
 * <p>
 * For Example,
 * Intrinsic, Properties that can be shared.
 * Extrinsic, Properties that makes an object unique from the other.
 */
public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d) \n", pointIcon.getType(), x, y);
    }
}
