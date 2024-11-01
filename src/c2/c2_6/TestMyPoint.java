package c2.c2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1); // Expected: (0, 0)

        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Expected: x is 8
        System.out.println("y is: " + p1.getY()); // Expected: y is 6

        p1.setXY(3, 0);
        System.out.println("x is: " + p1.getXY()[0]); // Expected: x is 3
        System.out.println("y is: " + p1.getXY()[1]); // Expected: y is 0

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(5, 6)); // Calculate distance to (5, 6)
        System.out.println(p1.distance(p2)); // Calculate distance to another MyPoint
        System.out.println(p1.distance()); // Calculate distance to the origin (0, 0)
    }
}
