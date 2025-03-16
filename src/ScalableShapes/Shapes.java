package ScalableShapes;

public abstract class Shapes {
    protected String name;

    public Shapes(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void scale(int factor);

    @Override
    public String toString() {
        return name + ", Area: " + String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
