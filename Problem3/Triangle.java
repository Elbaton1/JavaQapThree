public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    
    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        // this one was so hard i know you have it in the instructions but i just didnt understand how it worked 
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            System.err.println("wrong again"); // had to make this cause i kept messing up 
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

    // calculate area, same here im bad at math lol
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;  
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // display Triangle details
    @Override
    public String toString() {
        return super.toString() + ", Sides: (" + side1 + ", " + side2 + ", " + side3 + ")";
    }
}
