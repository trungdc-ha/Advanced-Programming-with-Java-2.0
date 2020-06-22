package _06_inheritance.circle_cylinder;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return this.radius + " " + this.color + " " + this.getArea();
    }
}
