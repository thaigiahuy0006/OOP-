package c4.c4_5;

public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
    public String toString() {
        return "Square[Rectangle[Shape[" + super.toString() + "]" ;
    }

}
