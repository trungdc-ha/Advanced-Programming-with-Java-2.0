package _21_design_patterns.factory_method;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("abc".equals(type)) {
            return new Square();
        } else if ("def".equals(type)) {
            return new Circle();
        } else {
            return new Rectangle();
        }
    }
}
