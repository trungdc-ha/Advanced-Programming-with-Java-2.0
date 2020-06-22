package _06_inheritance.point_moveable;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(1, 1);
        System.out.println("Point: " + p.toString());

        MoveablePoint mPoint = new MoveablePoint(9, 9, 4, 4);
        System.out.println("Movable Point (before): " + mPoint.toString());
        mPoint.move();
        System.out.println("Movable Point (after): " + mPoint.toString());
    }
}
