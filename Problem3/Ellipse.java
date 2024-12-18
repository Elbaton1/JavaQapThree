public class Ellipse extends Shape {
    private double a;  // Major axis
    private double b;  // Minor axis

    
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        this.a = Math.max(axis1, axis2);  // larger to a
        this.b = Math.min(axis1, axis2);  // smaller to b
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

    // calculate perimeter ,got a lot of help with this one im bad at math
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // calculate area
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // method from Shape.java
    @Override
    public String toString() {
        return super.toString();
    }
}
