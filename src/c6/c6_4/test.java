package c6.c6_4;

public class test {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial position of p1: " + p1);
        p1.moveUp();
        System.out.println("After moving up: " + p1);
        p1.moveDown();
        System.out.println("After moving down: " + p1);
        p1.moveLeft();
        System.out.println("After moving left: " + p1);
        p1.moveRight();
        System.out.println("After moving right: " + p1);

        MovableCircle c1 = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Initial position of c1: " + c1);
        c1.moveUp();
        System.out.println("After moving up: " + c1);
        c1.moveDown();
        System.out.println("After moving down: " + c1);
        c1.moveLeft();
        System.out.println("After moving left: " + c1);
        c1.moveRight();
        System.out.println("After moving right: " + c1);
    }
}

