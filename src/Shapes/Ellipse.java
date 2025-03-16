package Shapes;

/**
 * The Ellipse class extends Shape. Area and Perimeter are
 * calculated based on major and minor axes.
 */

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    @Override
    public double getPerimeter() {
        double x = 2*( Math.pow(a, 2) + Math.pow(b, 2) );
        double y = ( Math.pow(a, 2) + Math.pow(b, 2) ) / 2;
        return Math.PI * Math.sqrt(x-y);
    }

    @Override
    public String toString() {
        return "Eclipse: " + super.toString();
    }
}
