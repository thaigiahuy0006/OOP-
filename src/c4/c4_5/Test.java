package c4.c4_5;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape1);
        System.out.println(shape2);


        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.5, "green", true);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("Circle area: " + circle3.getArea());
        System.out.println("Circle perimeter: " + circle3.getPerimeter());


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.0, 4.0);
        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "yellow", true);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("Rectangle area: " + rectangle3.getArea());
        System.out.println("Rectangle perimeter: " + rectangle3.getPerimeter());


        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0, "purple", false);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println("Square area: " + square3.getArea());
        System.out.println("Square perimeter: " + square3.getPerimeter());
    }
}

