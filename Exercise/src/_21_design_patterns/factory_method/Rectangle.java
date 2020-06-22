package _21_design_patterns.factory_method;

public class Rectangle extends Shape {
    @Override
    public String showArea() {
        return "Area: height * wight";
    }
}
