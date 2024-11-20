public class Circle extends Ellipse {

    
    public Circle(String name, double radius) {
        super(name, radius, radius);  // In a circle, a = b = r
    }

    // Getter for radius
    public double getRadius() {
        return getA();  // Since a = b = r
    }

    // Setter for radius
    public void setRadius(double radius) {
        setA(radius);
        setB(radius);
    }

    // include radius
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + String.format("%.2f", getRadius());
    }
}
