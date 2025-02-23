package c5.c5_2;

public class TestCylinder {
    public static void main(String[] args) {

        Circle c1 = new Circle(3, "red");
        Cylinder cld = new Cylinder(c1, 5);

        System.out.println(cld);
        System.out.println("Area: " + cld.getArea());
        System.out.println("Volume: " + cld.getVolume());
    }
}

