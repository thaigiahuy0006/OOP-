package c2.c2_7;

import c2.c2_6.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1); // Expected: MyLine[begin=(0, 0), end=(3, 4)]

        line1.setBegin(new MyPoint(1, 1));
        line1.setEnd(new MyPoint(4, 5));
        System.out.println("Begin: " + line1.getBegin()); // Expected: Begin: (1, 1)
        System.out.println("End: " + line1.getEnd()); // Expected: End: (4, 5)

        System.out.println("Length: " + line1.getLength()); // Expected: Length: 5.0
        System.out.println("Gradient: " + line1.getGradient()); // Expected: Gradient: 0.7853981633974483 (45 degrees in radians)
    }
}