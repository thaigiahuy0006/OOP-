package c6.c6_5;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println("Initial Circle: " + c1);
        System.out.println("Circle Perimeter: " + c1.getPerimeter());
        System.out.println("Circle Area: " + c1.getArea());

        ResizableCircle rc1 = new ResizableCircle(5.5);
        System.out.println("Initial ResizableCircle: " + rc1);
        rc1.resize(50);
        System.out.println("After resizing by 50%: " + rc1);
        System.out.println("ResizableCircle Perimeter: " + rc1.getPerimeter());
        System.out.println("ResizableCircle Area: " + rc1.getArea());
    }
}

