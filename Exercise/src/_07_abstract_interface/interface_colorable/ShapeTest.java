package _07_abstract_interface.interface_colorable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[]{
                new Circle(1),
                new Rectangle(3, 4),
                new Square(8)
        };

        System.out.println("Display Colorable: ");
        for (Shape s : shapeArray) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle: " + c.getArea());
            } else if (s instanceof Colorable){
                Square sq = (Square) s;
                System.out.print("Square: ");
                sq.howToColor();
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle: " + r.getArea());
            }
        }
    }
}
