public class Ellipse extends Shape {
    private double a;  // Major axis
    private double b;  // Minor axis

    
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        this.a = Math.max(axis1, axis2);  //larger value to a
        this.b = Math.min(axis1, axis2);  //smaller value to b
    }

    // Getter for major axis
    public double getA() {
        return a;
    }

    // Getter for minor axis
    public double getB() {
        return b;
    }

    // Setter for major axis
    public void setA(double a) {
        this.a = a;
    }

    // Setter for minor axis
    public void setB(double b) {
        this.b = b;
    }

    // calculate perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // calculate area
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    
    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }
        this.a *= factor;
        this.b *= factor;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }
}
