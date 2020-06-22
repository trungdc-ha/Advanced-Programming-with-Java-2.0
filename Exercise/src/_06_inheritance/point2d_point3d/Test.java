package _06_inheritance.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(8, 9);
        System.out.println("Before 2D: " + point2D.toString());
        point2D.setXY(11, 19);
        System.out.println("After 2D: " + point2D.toString());

        Point3D point3D = new Point3D(7, 8, 9);
        System.out.println("Before 3D: " + point3D.toString());
        point3D.setXYZ(9, 10, 11);
        System.out.println("After 3D: " + point3D.toString());
    }
}
