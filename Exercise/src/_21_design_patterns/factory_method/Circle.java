package _21_design_patterns.factory_method;

public class Circle extends Shape {
    @Override
    public String showArea() {
        return "Area: PI * Radius^2";
    }
}
