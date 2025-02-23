package c4.c4_3;

public class TestPoint {
    public static void main(String[] args) {
        // Kiểm tra Point2D
        Point2D point2D = new Point2D();
        point2D.setX(1.1f);
        point2D.setY(2.2f);
        System.out.println("Point2D: " + point2D);

        // Kiểm tra Point3D
        Point3D point3D = new Point3D();
        point3D.setXYZ(3.3f, 4.4f, 5.5f);
        System.out.println("Point3D: " + point3D);

        // Lấy các giá trị của Point3D
        float[] xyz = point3D.getXYZ();
        System.out.println("X: " + xyz[0] + ", Y: " + xyz[1] + ", Z: " + xyz[2]);
    }
}

