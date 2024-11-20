public class Demo {
    public static void main(String[] args) {
        // array of Shape objects
        Shape[] shapes = new Shape[4];

        // Init shapes
        shapes[0] = new Ellipse("Ellipse1", 5.0, 3.0);
        shapes[1] = new Circle("Circle1", 4.0);
        shapes[2] = new Triangle("Triangle1", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6.0);

        
        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // scaling factor
        double scaleFactor = 2.0;

        // Scale the shapes
        scaleShapes(new Scalable[]{shapes[0], shapes[1], shapes[2], shapes[3]}, scaleFactor);

        
        System.out.println("\nShapes after scaling by a factor of " + scaleFactor + ":");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

  
    public static void scaleShapes(Scalable[] scalableShapes, double factor) {
        for (Scalable scalable : scalableShapes) {
            scalable.scale(factor);
        }
    }
}
