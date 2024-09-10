
// import SimpleGeometricObject.SimpleGeometricObject;
import CircleFromSimpleGeometricObject.CircleFromSimpleGeometricObject;
import RectangleFromSimpleGeometricObject.RectangleFromSimpleGeometricObject;

public class Main {
    public static void main(String[] args) {

        // Circle

        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(2, "Black", true);
        System.out.println("A Circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        // Rectangle

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(4, 4, "Orange", true);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " +
                rectangle.getPerimeter());
    }

}
