package c5.c5_2;

public class Cylinder {
    private Circle base;
    private double height;


    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }
    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
        public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    public String getColor() {
        return base.getColor();
    }
    public void setColor(String color) {
        base.setColor(color);
    }
    public double getArea() {
        return 2 * Math.PI * base.getRadius() * (base.getRadius() + height);
    }
    public double getVolume() {
        return base.getArea() * height;
    }
    public String toString() {
        return "Cylinder[radius=" + base.getRadius() + ", color=" + base.getColor() + ", height=" + height + "]";
    }
}
