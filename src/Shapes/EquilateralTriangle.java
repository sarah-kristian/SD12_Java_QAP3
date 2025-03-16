package Shapes;
/**
 * The Equliateral Triangle class extends Triangle. Area and Perimeter are
 * simplified.
 */
public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    public double getSide() {
        return getSide1();
    }

    public void setSide(double length) {
        setSide1(length);
        setSide2(length);
        setSide3(length);
    }


    public double getArea() {
        double side = getSide();
        return (Math.sqrt(3) / 4) * side * side;

    }

    public double getPerimeter() {
        return 3 * getSide();
    }


    public String toString() {
        return "Equilateral " + super.toString();
    }
}
