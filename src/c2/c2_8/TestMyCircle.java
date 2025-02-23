package c2.c2_8;
import c2.c2_6.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(new MyPoint(3, 4), 5);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Radius of c1: " + c1.getRadius());
        System.out.println("Center of c1: " + c1.getCenter());
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c1: " + c1.getCircumference());

        System.out.println("Radius of c2: " + c2.getRadius());
        System.out.println("Center of c2: " + c2.getCenter());
        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());

        System.out.println("Distance between centers: " + c1.distance(c2));
    }
}
