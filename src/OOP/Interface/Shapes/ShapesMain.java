package OOP.Interface.Shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes [0] = new Rectangle(24,24);
        shapes [1] = new Circle(12);
        shapes [2] = new Triangle(12,12,12);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("area =" + shapes[i].getArea() + ", Perimeter = " + shapes[i].getPerimeter() );

        }

    }
}
