import functions.Collection;
import functions.Function;
import hometask1.Phone.MobilePhone;
import hometask1.Phone.StationaryPhone;
import collections.Start;
import hometask2.Shape.Circle;
import hometask2.Shape.Rectangle;
import hometask2.Shape.Square;
import hometask2.Shape.Triangle;

public class BaseClass {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        StationaryPhone stationaryPhone = new StationaryPhone();
        Function function = new Function();
        Collection collection = new Collection();
        Start start = new Start();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

/**COLLECTIONS*/
//        collection.createArrayList();
//        start.createCarsArrayList();

/**HOMETASK 1*/
///**validate phone number*/
//        function.validateNumber(function.scanNumber());
///**average value from array*/
//        function.averageValue();
///**factorial of a number*/
//        function.factorialOfNumber();
///**factorial of a number*/
//        function.fibonacciRow();

/**HOMETASK 2*/
        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
