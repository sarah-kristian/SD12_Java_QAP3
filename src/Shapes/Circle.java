package Shapes;

/**
 * The Circle class extends Ellipse. This allows for a simplification
 * in calculations for Area and Perimeter.
 */

public class Circle extends Ellipse {

    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    public double getR() {
        return getA();
    }

    public void setR(double radius) {
        setA(radius);
        setB(radius);
    }


    public double getArea() {
        double radius = getA(); // get the radius from a
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        double radius = getA(); //
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle-Perfect " + super.toString();
    }
}
