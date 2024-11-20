public class Demo {
    public static void main(String[] args) {
        // array of Shape objects
        Shape[] shapes = new Shape[4];

        // Initshapes
        shapes[0] = new Ellipse("Ellipse1", 5.0, 3.0);
        shapes[1] = new Circle("Circle1", 4.0);
        shapes[2] = new Triangle("Triangle1", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6.0);

        
        System.out.println("Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
