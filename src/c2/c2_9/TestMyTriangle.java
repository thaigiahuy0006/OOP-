package c2.c2_9;
import c2.c2_6.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(3, 4);

        MyTriangle triangle1 = new MyTriangle(p1, p2, p3);

        System.out.println(triangle1); //thông tin tam giác
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());
    }
}

