package _21_design_patterns.factory_method;

public class Square extends Shape {
    @Override
    public String showArea() {
        return "Area: side * side";
    }
}
