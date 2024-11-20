public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // init Triangle
    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            System.err.println("Error: The given sides do not form a valid triangle.");
            System.exit(1);  
        }
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    // Getter for side1
    public double getSide1() {
        return side1;
    }

    // Getter for side2
    public double getSide2() {
        return side2;
    }

    // Getter for side3
    public double getSide3() {
        return side3;
    }

    // Setter for side1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    // Setter for side2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // Setter for side3
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // calculate perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // calculate area 
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // scale method
    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }


    @Override
    public String toString() {
        return super.toString() + ", Sides: (" + side1 + ", " + side2 + ", " + side3 + ")";
    }
}
