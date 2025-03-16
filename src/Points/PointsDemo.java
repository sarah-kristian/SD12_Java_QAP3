package Points;

public class PointsDemo {
    public static void main(String[] args) {
        // Create a Point and display it
        Point point = new Point(5.0f, 5.0f);
        System.out.println("Initial Point: " + point);

        // Create a MovablePoint with initial position and speed
        MovablePoint movablePoint = new MovablePoint(5.0f, 5.0f, 2.0f, 3.0f);
        System.out.println("Initial MovablePoint: " + movablePoint);

        // Move the MovablePoint
        movablePoint.move();
        System.out.println("Moved MovablePoint: " + movablePoint);

        // Create another MovablePoint with different speeds
        MovablePoint fastMovablePoint = new MovablePoint(1.0f, 1.0f, 10.0f, 15.0f);
        System.out.println("Fast MovablePoint before moving: " + fastMovablePoint);
        fastMovablePoint.move();
        System.out.println("Fast MovablePoint after moving: " + fastMovablePoint);
    }
}
