package ScalableShapes;

public class ShapesDemo {
    public static void main(String[] args) {

        Shapes[] shapes = new Shapes[4];

        shapes[0] = new Ellipse("Squish-y", 10.0, 5.0);
        shapes[1] = new Circle("Round-y", 3.0);
        shapes[2] = new Triangle("Poke-y", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Benny", 6.0);


        // Display original set of shapes
        System.out.println("*****  Meet the Shapes!  ******\n");
        for (Shapes shape : shapes) {
            System.out.println(shape.toString());
        }

        // Scale Shapes by a factor of 2 and display results
        scaleShapes(shapes, 2);
        System.out.println("\n*****  Meet the Twice-biggened Shapes!  ******\n");
        for (Shapes shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * scaleShapes will scale the shapes in an array by a given factor
     */
    public static void scaleShapes(Shapes[] shapes, int scaleFactor){
        for (Shapes shape : shapes) {
            shape.scale(scaleFactor);
        }
    }

}

