package ScalableShapes;

/**
 * The Triangle class extends Shape. Area and Perimeter are
 * calculated based on the length of the sides.
 */
public class Triangle extends Shapes {

    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("Invalid triangle");
            System.exit(0);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static Shapes createTriangle(String name, double a, double b, double c) {
        if ((a == b) && (b == c)) {
            return new EquilateralTriangle(name, a);
        } else {
            return new Triangle(name, a, b, c);
        }
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(int factor) {
        setSide1(factor * side1);
        setSide2(factor * side2);
        setSide3(factor * side3);
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    }

}
