public class Point {
    private double x;  // X-coordinate
    private double y;  // Y-coordinate

    // init Point object
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x-coordinate
    public double getX() {
        return x;
    }

    // Getter for y-coordinate
    public double getY() {
        return y;
    }

    // Setter for x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Setter for y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    // display Point details
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
