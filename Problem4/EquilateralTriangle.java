public class EquilateralTriangle extends Triangle {

    
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);  // All sides are equal
    }

    // Getter for side
    public double getSide() {
        return getSide1();
    }

    // Setter for side
    public void setSide(double side) {
        setSide1(side);
        setSide2(side);
        setSide3(side);
    }

    // equilateral
    @Override
    public String toString() {
        return super.toString() + " [Equilateral]";
    }
}
