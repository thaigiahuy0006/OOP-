package c5.c5_1;

public class Line {
    private Point begin;
    private Point end;

    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public String toString() {
        return "Line: (" + begin + " to " + end + ")";
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public void setBeginXY( int x, int y ) {
        begin.setX(x);
        begin.setY(y);
    }
    public void setEndX( int x ) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY( int x, int y ) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength()
    {
        int xDiff=this.getBeginX()-this.getEndX();
        int yDiff=this.getBeginY()-this.getEndY();
        return  Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient()
    {
        return Math.atan2( getBeginY()-getEndY(),getBeginX()-getEndX());
    }

}
