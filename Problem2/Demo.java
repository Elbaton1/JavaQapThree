public class Demo {
    public static void main(String[] args) {
        // Create a Point object
        Point p = new Point(1.0, 2.0);
        System.out.println("Point p: " + p);

        // Create a MovablePoint 
        MovablePoint mp = new MovablePoint(3.0, 4.0, 1.1, 2.2);
        System.out.println("MovablePoint mp: " + mp);

        // Move the MovablePoint
        MovablePoint mpMoved = mp.move();
        System.out.println("After moving: " + mpMoved);
    }
}
