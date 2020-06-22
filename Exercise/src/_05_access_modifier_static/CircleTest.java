package _05_access_modifier_static;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
