package c1;

public class Circle1 {
    private double radius;
    public Circle1()
    {
        radius=1.0;
    }
    public Circle1(double r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getCircumference()
    {
        return 2*radius*Math.PI;
    }
    public double getarea()
    {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + this.radius + "]";

    }
}