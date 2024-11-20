public abstract class Shape implements Scalable {
    private String name;  // Name of the shape

    
    public Shape(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // calculate perimeter
    public abstract double getPerimeter();

    // calculate area
    public abstract double getArea();

    
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
