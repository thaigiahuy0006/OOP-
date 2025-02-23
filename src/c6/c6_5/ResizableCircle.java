package c6.c6_5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius *= (percent / 100.0);
    }

    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }
}

