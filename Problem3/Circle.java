public class Circle extends Ellipse {

    
    public Circle(String name, double radius) {
        super(name, radius, radius);  // a = b = r
    }

    // Getter for radius
    public double getRadius() {
        return getA();  
    }

    // Setter for radius
    public void setRadius(double radius) {
        setA(radius);
        setB(radius);
    }

    // method to include radius
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + String.format("%.2f", getRadius());
    }
}
