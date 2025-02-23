package c4.c4_4;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2.5f, 3.0f);
        System.out.println(p1);
        p1.setXY(4.0f, 5.0f);
        System.out.println("X: " + p1.getX() + ", Y: " + p1.getY());


        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(mp1);
        mp1.move();
        System.out.println(mp1);
    }
}
