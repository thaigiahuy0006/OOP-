package c6.c6_8;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println(point);

        point.moveUp();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 10);
        System.out.println(circle);

        circle.moveRight();
        System.out.println(circle);
    }
}
