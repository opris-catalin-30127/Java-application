package isp.lab5.exercise4;

public class Main {
    public static void main(String[] args) {
        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded");
        AbstractShapeFactory normalShapeFactory = ShapeFactoryProvider.getShapeFactory("normal");

        // create instances
        Shape rectangle = roundedShapeFactory.getShape("roundedRectangle");
        Shape shape1 = normalShapeFactory.getShape("rectangle");

        rectangle.draw();
        shape1.draw();

        Shape square = roundedShapeFactory.getShape("roundedSquare");
        Shape shape2 = normalShapeFactory.getShape("square");


        square.draw();
        shape2.draw();
    }
}
