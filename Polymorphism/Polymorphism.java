package Polymorphism;

import CircleFromSimpleGeometricObject.CircleFromSimpleGeometricObject;
import SimpleGeometricObject.SimpleGeometricObject;
import RectangleFromSimpleGeometricObject.RectangleFromSimpleGeometricObject;

public class Polymorphism {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(0, "Blue", true));
        displayObject(new RectangleFromSimpleGeometricObject(0, 2, "Blue", true));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
