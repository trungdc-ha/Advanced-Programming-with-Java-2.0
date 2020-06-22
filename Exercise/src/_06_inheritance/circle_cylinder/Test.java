package _06_inheritance.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        System.out.println("Circle: " + circle.toString());

        Cylinder cylinder = new Cylinder(9, 15);
        System.out.println("Cylinder: " + cylinder.toString());
    }
}
