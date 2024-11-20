public class MovablePoint extends Point {
    private double xSpeed;  // Speed in x-direction
    private double ySpeed;  // Speed in y-direction

    // init MovablePoint 
    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);  
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed
    public double getXSpeed() {
        return xSpeed;
    }

    // Getter for ySpeed
    public double getYSpeed() {
        return ySpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    // move the point by adding speed 
    public MovablePoint move() {
        double newX = getX() + xSpeed;
        double newY = getY() + ySpeed;
        return new MovablePoint(newX, newY, xSpeed, ySpeed);
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Speed: (" + xSpeed + ", " + ySpeed + ")";
    }
}
