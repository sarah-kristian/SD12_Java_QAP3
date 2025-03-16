package Shapes;

public class ShapesDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Ellipse("Squish-y", 10.0, 5.0);
        shapes[1] = new Circle("Round-y", 3.0);
        shapes[2] = new Triangle("Poke-y", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Benny", 6.0);

        // Output
        System.out.println("*****  Meet the Shapes!  ******");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
