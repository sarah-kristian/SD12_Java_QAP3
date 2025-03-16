package Shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + ", Area: " + String.format("%.2f", getArea()) + ", Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
