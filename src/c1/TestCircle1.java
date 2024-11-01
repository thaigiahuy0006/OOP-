package c1;

public class TestCircle1 {
    public static void main(String[] args)
    {
        Circle1 c1=new Circle1(1.1);
        System.out.println(c1);
        Circle1 c2=new Circle1();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is : "+ c1.getRadius());
        System.out.printf("area is : %.2f%n", c1.getarea());
        System.out.printf("Circumference is : %.2f%n", c1.getCircumference());
    }
}