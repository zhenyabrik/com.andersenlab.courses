package hometask2.Shape;

import functions.Function;
import hometask2.Interfaces.ShapeInterface;

public abstract class AbstractShape implements ShapeInterface {

    Function function = new Function();
    protected double randomGeometricDouble = function.genDouble(1, 10, 1);

    protected double area;
    protected double perimeter;
}
