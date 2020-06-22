package _21_design_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("abc");
        System.out.println(shape1.showArea());

        Shape shape2 = shapeFactory.getShape("def");
        System.out.println(shape2.showArea());

        Shape shape3 = shapeFactory.getShape("kgh");
        System.out.println(shape3.showArea());
    }
}
