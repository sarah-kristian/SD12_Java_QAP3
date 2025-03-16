package Points;

/**
 * The MovablePoint class extends Point to allow movement by
 * adding speed in the x and y directions.
 */

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // default from Point class
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    // getters and setters
    public float getxSpeed() { return xSpeed; }

    public void setxSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getySpeed() { return ySpeed; }

    public void setySpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() { return new float[]{xSpeed,ySpeed}; }

    // move the point
    public void move(){
        setXY( (getX() + this.xSpeed), (getY() + this.ySpeed) );
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
